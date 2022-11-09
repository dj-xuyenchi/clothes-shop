package shop.clothesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.clothesshop.entities.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Query(value = "select top 12 * from product ",nativeQuery = true)
    public List<Product> getProductHome();

}
