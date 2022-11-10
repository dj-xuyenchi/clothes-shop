package shop.clothesshop.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.entities.*;
import shop.clothesshop.entities.responobject.OrderObject;
import shop.clothesshop.entities.responobject.ProductBillDetail;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;
import shop.clothesshop.repository.AccountBagRepo;
import shop.clothesshop.repository.AccountRepo;
import shop.clothesshop.repository.ProductRepo;
import shop.clothesshop.serivices.iservices.IAppServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppServices implements IAppServices {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private AccountBagRepo accountBagRepo;
    @Autowired
    private AccountRepo accountRepo;

    @Override
    public List<Product> getProductHome() {
        List<Product> fullList = productRepo.findAll();
        if (fullList.size() > 12) {
            return getProductHome();
        }
        return fullList;
    }

    @Override
    public ProductDetail getProductId(int accountId) {
        ProductDetail productDetail = new ProductDetail();
        Product p = productRepo.findById(accountId).get();
        productDetail.setProduct(p);
        productDetail.setBrand(p.getBrand());
        productDetail.setProducer(p.getProducer());
        productDetail.setSize(p.getSize());
        productDetail.setColor(p.getColor());
        productDetail.setCategoryType(p.getCategoryType());
        return productDetail;
    }

    @Override
    public List<ShowAccountBag> getProductBagByAccountID(int accountId) {
        List<ShowAccountBag> result = new ArrayList<>();
        List<AccountBag> listAccountBag = accountBagRepo.findByAccountId(accountId);
        for (AccountBag ab : listAccountBag) {
            ShowAccountBag showAccountBag = new ShowAccountBag();
            showAccountBag.setAccountBag(ab);
            showAccountBag.setProduct(productRepo.findById(ab.getProductId()).get());
            showAccountBag.setCategoryType(productRepo.findById(accountId).get().getCategoryType());
            result.add(showAccountBag);
        }
        return result;
    }

    @Override
    public List<OrderObject> getOrderObjectByAccountId(int accountId) {
        Optional<Accounts> account = accountRepo.findById(accountId);
        if (account.isEmpty()) {
            return null;
        }
        if (account.get().getAccountShipContacts() == null) {
            return null;
        }
        List<AccountShipContact> listShipContact = account.get().getAccountShipContacts();
        List<OrderObject> listResult = new ArrayList<>();
        for (AccountShipContact a : listShipContact) {
            for (Bill bill : a.getBills()) {
                OrderObject oo = new OrderObject();
                oo.setAccountShipContact(a);
                oo.setBill(bill);
                oo.setBillStatus(bill.getBillStatus());
                oo.setBuyMethod(bill.getBuyMethod());
                oo.setShipMethod(bill.getShipMethod());
                List<ProductBillDetail> pd = new ArrayList<>();
                for (BillDetail billDetail : bill.getBillDetails()) {
                    ProductBillDetail pdb = new ProductBillDetail();
                    pdb.setProduct(billDetail.getProduct());
                    pdb.setBillDetail(billDetail);
                    pd.add(pdb);
                }
                oo.setProductBillDetails(pd);
                listResult.add(oo);
            }
        }
        return listResult;
    }

    @Override
    public Accounts checkLogin(String userName, String userPass) {
        return accountRepo.checkLogin(userName, userPass);
    }
}
