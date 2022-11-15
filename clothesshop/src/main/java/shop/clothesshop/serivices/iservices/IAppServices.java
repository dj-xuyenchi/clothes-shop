package shop.clothesshop.serivices.iservices;

import shop.clothesshop.entities.*;
import shop.clothesshop.entities.responobject.*;

import java.util.List;

public interface IAppServices {
    public List<Product> getProductHome();

    public ProductDetail getProductId(int accountId);

    public List<ShowAccountBag> getProductBagByAccountID(int accountId);

    public List<OrderObject> getOrderObjectByAccountId(int accountId);

    public AccountCustom checkLogin(String useName, String userPass);

    public AccountCustom getAccountContacts(int accountId);

    public AccountBag addProduct2Bag(int accountId, int productId, int quantity);

    public AccountBag deleteAccountBag(int accountBagId);


    public CreateOrder createOrder(Integer[] listIdAccountBag);
}
