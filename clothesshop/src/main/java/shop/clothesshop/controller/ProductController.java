package shop.clothesshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shop.clothesshop.entities.Product;
import shop.clothesshop.serivices.ProductServices;

import java.util.List;

@RestController
@RequestMapping(value = "api/product1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @RequestMapping(method = RequestMethod.GET,value = "getallproduct")
    public List<Product> getAllProduct() {
        return productServices.getAllProduct();
    }
}
