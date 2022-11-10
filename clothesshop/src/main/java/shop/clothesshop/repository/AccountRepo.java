package shop.clothesshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import shop.clothesshop.entities.Accounts;
@Repository
public interface AccountRepo extends JpaRepository<Accounts,Integer> {
    @Query(value = "select * from Accounts where accountUserName = :userName and accountPassword= :userPass",nativeQuery = true)
    public Accounts checkLogin(@Param("userName")String userName,@Param("userPass")String userPass);
}
