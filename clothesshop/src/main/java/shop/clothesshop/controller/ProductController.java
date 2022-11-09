package shop.clothesshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.clothesshop.entities.AccountBag;
import shop.clothesshop.entities.CategoryType;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.responobject.ProductDetail;
import shop.clothesshop.entities.responobject.ShowAccountBag;
import shop.clothesshop.serivices.ProductServices;

import java.util.List;

@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ProductController {
    @Autowired
    private ProductServices productServices;

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

}

