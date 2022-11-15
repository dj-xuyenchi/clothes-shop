package shop.clothesshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.clothesshop.entities.*;
import shop.clothesshop.entities.responobject.*;
import shop.clothesshop.serivices.AppServices;

import java.util.List;

@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AppController {
    @Autowired
    private AppServices appServices;

    @RequestMapping(method = RequestMethod.GET, value = "getproducthome")
    public List<Product> getProductHome() {
        return appServices.getProductHome();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getproductid")
    public ProductDetail getProductById(@RequestParam Integer id) {
        return appServices.getProductId(id);
    }


    @RequestMapping(method = RequestMethod.GET, value = "getproductbagbyaccountid")
    public List<ShowAccountBag> getBag(@RequestParam Integer accountId) {
        return appServices.getProductBagByAccountID(accountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getbilldetailbyaccountid")
    public List<OrderObject> getBillDetail(@RequestParam Integer accountId) {
        return appServices.getOrderObjectByAccountId(accountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "checklogin")
    public AccountCustom checkLogin(@RequestParam String userName, String userPass) {
        return appServices.checkLogin(userName, userPass);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getcontacts")
    public AccountCustom getAccountContacts(@RequestParam int accountId) {
        return appServices.getAccountContacts(accountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "addproduct2bag")
    public AccountBag addProduct2Bag(@RequestParam int accountId, int productId, int quantity) {
        return appServices.addProduct2Bag(accountId, productId, quantity);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteaccountbag")
    public AccountBag deleteAccountBag(@RequestParam int accountBagId) {
        return appServices.deleteAccountBag(accountBagId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "getcalculbag")
    public CreateOrder createBillFromBag(@RequestBody Integer[] listIdAccountBag) {
       return appServices.createOrder(listIdAccountBag);
    }

}

