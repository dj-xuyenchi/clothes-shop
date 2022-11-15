package shop.clothesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.clothesshop.entities.Sales;

import java.util.List;

@Repository
public interface SalesRepo extends JpaRepository<Sales,Integer> {
    @Query(value = "select * from Sales where salesstatusid = 1",nativeQuery = true)
    public List<Sales> getAllOffBillDetailWithoutOff();
    @Query(value = "select * from Sales where salesstatusid = 2",nativeQuery = true)
    public List<Sales> getAllOffBillWithoutOff();
}
