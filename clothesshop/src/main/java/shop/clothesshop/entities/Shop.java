package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "shop")
@Entity
public class Shop {
    @Id
    @Column(name = "shopid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shopId;

    @Column(name = "accountid", updatable = false, insertable = false)
    private Integer accountId;

    @Column(name = "addressid", updatable = false, insertable = false)
    private Integer addressId;

    @Column(name = "shopname")
    private String shopName;

    @OneToMany(mappedBy = "shop", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Product> productList;

    @ManyToOne
    @JoinColumn(name = "accountid")
    @JsonBackReference
    private Accounts account;

    @ManyToOne
    @JoinColumn(name = "addressid")
    @JsonBackReference
    private Address address;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
