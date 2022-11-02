package shop.clothesshop.serivices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.clothesshop.entities.Product;
import shop.clothesshop.repository.ProductRepo;
import shop.clothesshop.serivices.iservices.IProductServices;

import java.util.List;

@Service
public class ProductServices implements IProductServices {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }
}
