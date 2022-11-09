package shop.clothesshop.serivices.iservices;

import shop.clothesshop.entities.AccountBag;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;

import java.util.List;

public interface IProductServices {
    public List<Product> getProductHome();
    public ProductDetail getProductId(int accountId);
    public List<ShowAccountBag> getProductBagByAccountID(int accountId);
}
