package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "accounts")
@Entity
public class Accounts {
    @Id
    @Column(name = "accountid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(name = "accountusername")
    private String accountUserName;

    @Column(name = "accountemail")
    private String accountEmail;

    @Column(name = "accountnumberphone")
    private String accountNumberPhone;

    @Column(name = "accountpassword")
    private String accountPassword;

    @Column(name = "accountstatusid", insertable = false, updatable = false)
    private Integer accountStatusId;


    @Column(name = "accountname")
    private String accountName;

    @Column(name = "accountborn")
    private LocalDate accountBorn;


    @Column(name = "accountdetailaddress")
    private String accountDetailAddress;

    @Column(name = "accountphonenumber")
    private String accountPhoneNumber;

    @Column(name = "accountcreatedate")
    private LocalDate accountCreateDate;


    @ManyToOne
    @JoinColumn(name = "accountstatusid")
    @JsonBackReference
    private AccountStatus accountStatus;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<AccountShipContact> accountShipContacts;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<AccountBag> accountBags;

    @OneToMany(mappedBy = "account")
    @JsonManagedReference
    private List<VoteStar> voteStars;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountNumberPhone() {
        return accountNumberPhone;
    }

    public void setAccountNumberPhone(String accountNumberPhone) {
        this.accountNumberPhone = accountNumberPhone;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Integer getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(Integer accountStatusId) {
        this.accountStatusId = accountStatusId;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDate getAccountBorn() {
        return accountBorn;
    }

    public void setAccountBorn(LocalDate accountBorn) {
        this.accountBorn = accountBorn;
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

    public LocalDate getAccountCreateDate() {
        return accountCreateDate;
    }

    public void setAccountCreateDate(LocalDate accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }


    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public List<AccountShipContact> getAccountShipContacts() {
        return accountShipContacts;
    }

    public void setAccountShipContacts(List<AccountShipContact> accountShipContacts) {
        this.accountShipContacts = accountShipContacts;
    }

    public List<AccountBag> getAccountBags() {
        return accountBags;
    }

    public void setAccountBags(List<AccountBag> accountBags) {
        this.accountBags = accountBags;
    }

    public List<VoteStar> getVoteStars() {
        return voteStars;
    }

    public void setVoteStars(List<VoteStar> voteStars) {
        this.voteStars = voteStars;
    }
}
