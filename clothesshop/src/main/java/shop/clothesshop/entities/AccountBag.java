package shop.clothesshop.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name="accountbag")
@Entity
public class AccountBag {
    @Id
    @Column(name="accountbag")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountBagId;

    @Column(name="accountid",insertable = false,updatable = false)
    private Integer accountId;

    @Column(name="propertydetailid",insertable = false,updatable = false)
    private Integer propertyDetailId;

    @Column(name="quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "accountid")
    @JsonBackReference
    private Accounts account;

    @ManyToOne
    @JoinColumn(name = "propertydetailid")
    @JsonBackReference
    private PropertyDetail propertyDetail;

    public Integer getAccountBagId() {
        return accountBagId;
    }

    public void setAccountBagId(Integer accountBagId) {
        this.accountBagId = accountBagId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getPropertyDetailId() {
        return propertyDetailId;
    }

    public void setPropertyDetailId(Integer propertyDetailId) {
        this.propertyDetailId = propertyDetailId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public PropertyDetail getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(PropertyDetail propertyDetail) {
        this.propertyDetail = propertyDetail;
    }
}
