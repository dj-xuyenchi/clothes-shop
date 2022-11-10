package shop.clothesshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.clothesshop.entities.Accounts;
import shop.clothesshop.entities.BillDetail;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.responobject.OrderObject;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;
import shop.clothesshop.serivices.AppServices;

import java.util.List;

@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AppController {
    @Autowired
    private AppServices productServices;

    @RequestMapping(method = RequestMethod.GET, value = "getproducthome")
    public List<Product> getProductHome() {
        return productServices.getProductHome();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getproductid")
    public ProductDetail getProductById(@RequestParam Integer id) {
        return productServices.getProductId(id);
    }


    @RequestMapping(method = RequestMethod.GET, value = "getproductbagbyaccountid")
    public List<ShowAccountBag> getBag(@RequestParam Integer accountId) {
        return productServices.getProductBagByAccountID(accountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getbilldetailbyaccountid")
    public List<OrderObject> getBillDetail(@RequestParam Integer accountId) {
        return productServices.getOrderObjectByAccountId(accountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "checklogin")
    public Accounts checkLogin(@RequestParam String userName,String userPass) {
        return productServices.checkLogin(userName,userPass);
    }
}

