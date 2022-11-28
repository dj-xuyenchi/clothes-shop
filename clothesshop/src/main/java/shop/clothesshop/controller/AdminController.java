package shop.clothesshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shop.clothesshop.entities.Product;
import shop.clothesshop.entities.adminrespon.AnalysisObject;
import shop.clothesshop.serivices.AdminServices;

import java.util.List;

@RestController
@RequestMapping(value = "api/admin1.0")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class AdminController {
    @Autowired
    private AdminServices adminServices;

    @RequestMapping(method = RequestMethod.GET, value = "getanalysisshop")
    public AnalysisObject getAnalysisShop12Month(){
        return adminServices.analysisShop12Month();
    }

}
