package shop.clothesshop.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.entities.AccountBag;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;
import shop.clothesshop.repository.AccountBagRepo;
import shop.clothesshop.repository.ProductRepo;
import shop.clothesshop.serivices.iservices.IProductServices;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices implements IProductServices {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private AccountBagRepo accountBagRepo;

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
}
