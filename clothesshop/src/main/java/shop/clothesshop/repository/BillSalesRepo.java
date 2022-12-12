package shop.clothesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.clothesshop.entities.BillSales;

import java.util.List;

@Repository
public interface BillSalesRepo extends JpaRepository<BillSales, Integer> {
    @Query(nativeQuery = true, value = "select * from billsales where billid = :idBill")
    public List<BillSales> getListSalesOfBill(@Param("idBill") Integer idBill);
}
