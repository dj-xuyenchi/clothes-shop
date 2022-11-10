package shop.clothesshop.serivices.iservices;

import shop.clothesshop.entities.*;
import shop.clothesshop.entities.responobject.OrderObject;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;

import java.util.List;

public interface IAppServices {
    public List<Product> getProductHome();
    public ProductDetail getProductId(int accountId);
    public List<ShowAccountBag> getProductBagByAccountID(int accountId);
    public List<OrderObject> getOrderObjectByAccountId(int accountId);
    public Accounts checkLogin(String useName,String userPass);
}
