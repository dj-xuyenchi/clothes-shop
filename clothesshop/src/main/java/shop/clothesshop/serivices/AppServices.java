package shop.clothesshop.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.entities.*;
import shop.clothesshop.entities.responobject.*;
import shop.clothesshop.repository.*;
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
    @Autowired
    private BuyMethodRepo buyMethodRepo;
    @Autowired
    private SalesRepo salesRepo;
    @Autowired
    private ShipMethodRepo shipMethodRepo;

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
    public AccountCustom checkLogin(String userName, String userPass) {
        Accounts account = accountRepo.checkLogin(userName, userPass);
        if (account == null) {
            return null;
        }
        AccountCustom result = new AccountCustom();
        result.setId(account.getAccountId());
        result.setAddress(account.getAccountDetailAddress());
        result.setName(account.getName());
        result.setShipContacts(account.getAccountShipContacts());
        return result;
    }

    @Override
    public AccountCustom getAccountContacts(int accountBagId) {
        Optional<Accounts> accountOp = accountRepo.findById(accountBagId);
        if (accountOp.isEmpty()) {
            return null;
        }
        Accounts account = accountOp.get();
        AccountCustom result = new AccountCustom();
        result.setId(account.getAccountId());
        result.setAddress(account.getAccountDetailAddress());
        result.setName(account.getName());
        result.setBorn(account.getAccountBorn());
        result.setShipContacts(account.getAccountShipContacts());
        return result;
    }

    @Override
    public AccountBag addProduct2Bag(int accountId, int productId, int quantity) {
        AccountBag accountBag = new AccountBag();
        accountBag.setAccount(accountRepo.findById(accountId).get());
        accountBag.setProduct(productRepo.findById(productId).get());
        accountBag.setQuantity(quantity);
        accountBagRepo.save(accountBag);
        return accountBag;
    }

    @Override
    public AccountBag deleteAccountBag(int accountBagId) {
        Optional<AccountBag> accountBag = accountBagRepo.findById(accountBagId);
        if (accountBag.isEmpty()) {
            return null;
        }
        accountBagRepo.delete(accountBag.get());
        return accountBag.get();
    }

    @Override
    public CreateOrder createOrder(Integer[] listIdAccountBag) {
        CreateOrder co = new CreateOrder();
        List<OrderItem> orderItems = new ArrayList<>();
        List<Sales> salesOfBill = salesRepo.getAllOffBillWithoutOff();
        List<Sales> salesOfBillDetail = salesRepo.getAllOffBillDetailWithoutOff();
        List<ShipMethod> shipMethods = shipMethodRepo.findAll();
        List<BuyMethod> buyMethods = buyMethodRepo.findAll();
        List<AccountShipContact> accountShipContacts = accountBagRepo.findById(listIdAccountBag[0]).get().getAccount().getAccountShipContacts();
        for (Integer i : listIdAccountBag) {
            OrderItem oi = new OrderItem();
            AccountBag ab = accountBagRepo.findById(i).get();
            oi.setAccountBagId(i);
            oi.setProduct(ab.getProduct());
            oi.setQuantity(ab.getQuantity());
            oi.setCategoryType(ab.getProduct().getCategoryType());
            orderItems.add(oi);
        }
        co.setAccountShipContacts(accountShipContacts);
        co.setOrderItems(orderItems);
        co.setSalesOfBill(salesOfBill);
        co.setSalesOfBillDetail(salesOfBillDetail);
        co.setBuyMethods(buyMethods);
        co.setShipMethods(shipMethods);
        return co;
    }

}
