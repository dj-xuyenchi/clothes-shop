package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "accountshipcontact")
@Entity
public class AccountShipContact {
    @Id
    @Column(name = "accountshipcontactid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountShipContactId;

    @Column(name = "accountid", updatable = false, insertable = false)
    private Integer accountId;

    @Column(name = "receivername")
    private String receiverName;
    @Column(name = "accountdetailaddress")
    private String accountDetailAddress;

    @Column(name = "accountphonenumber")
    private String accountPhoneNumber;


    @OneToMany(mappedBy = "accountShipContact", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Bill> bills;

    @ManyToOne
    @JoinColumn(name = "accountid")
    @JsonBackReference
    private Accounts account;

    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getAccountDetailAddress() {
        return accountDetailAddress;
    }

    public void setAccountDetailAddress(String accountDetailAddress) {
        this.accountDetailAddress = accountDetailAddress;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }
}
