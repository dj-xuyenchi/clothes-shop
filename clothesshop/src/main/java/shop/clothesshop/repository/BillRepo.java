package shop.clothesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.clothesshop.entities.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer> {
    @Query(nativeQuery = true, value = "select count(*) from bill where MONTH(bill.createdate) = :month")
    public Integer countBillInMonth(int month);

    @Query(nativeQuery = true, value = "select count(*) from bill where billstatusid=3 and MONTH(createdate) = :month")
    public Integer countShippedBillByMonth(int month);
@Query(nativeQuery = true,value = "select sum(quantity) from billdetail join bill on bill.billid = billdetail.billid where bill.billstatusid =3 and MONTH(createdate) = :month")
    public Integer soldTotalByMonth(int month);
@Query(nativeQuery = true,value = "select sum(price*quantity)")
public Double profitbeforeBillBack(int month);
}
