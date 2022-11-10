package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "bill")
@Entity
public class Bill {
    @Id
    @Column(name = "billid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billId;
    @Column(name = "accountshipcontactid", updatable = false, insertable = false)
    private Integer accountShipContactId;
    @Column(name = "buymethodid", updatable = false, insertable = false)
    private Integer buyMethodId;
    @Column(name = "shipmethodid", updatable = false, insertable = false)
    private Integer shipMethodId;
    @Column(name = "createdate")
    private LocalDate createDate;
    @Column(name = "shiptobuyerdate")
    private LocalDate shipToBuyerDate;
    @Column(name = "receiveddate")
    private LocalDate receivedDate;
    @Column(name = "closedatetime")
    private LocalDate closeDateTime;
    @Column(name = "buyernotification")
    private String buyerNotification;
    @Column(name = "billstatusid", updatable = false, insertable = false)
    private Integer billStatusId;
    @JoinColumn(name = "billstatusid")
    @ManyToOne
    @JsonBackReference
    private BillStatus billStatus;
    @ManyToOne
    @JoinColumn(name = "buymethodid")
    @JsonBackReference
    private BuyMethod buyMethod;
    @ManyToOne
    @JoinColumn(name = "shipmethodid")
    @JsonBackReference
    private ShipMethod shipMethod;
    @ManyToOne
    @JoinColumn(name = "accountshipcontactid")
    @JsonBackReference
    private AccountShipContact accountShipContact;
    @OneToMany(mappedBy = "bill", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BillDetail> billDetails;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public Integer getBuyMethodId() {
        return buyMethodId;
    }

    public void setBuyMethodId(Integer buyMethodId) {
        this.buyMethodId = buyMethodId;
    }

    public Integer getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(Integer shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getShipToBuyerDate() {
        return shipToBuyerDate;
    }

    public void setShipToBuyerDate(LocalDate shipToBuyerDate) {
        this.shipToBuyerDate = shipToBuyerDate;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalDate getCloseDateTime() {
        return closeDateTime;
    }

    public void setCloseDateTime(LocalDate closeDateTime) {
        this.closeDateTime = closeDateTime;
    }

    public String getBuyerNotification() {
        return buyerNotification;
    }

    public void setBuyerNotification(String buyerNotification) {
        this.buyerNotification = buyerNotification;
    }

    public Integer getBillStatusId() {
        return billStatusId;
    }

    public void setBillStatusId(Integer billStatusId) {
        this.billStatusId = billStatusId;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public BuyMethod getBuyMethod() {
        return buyMethod;
    }

    public void setBuyMethod(BuyMethod buyMethod) {
        this.buyMethod = buyMethod;
    }

    public ShipMethod getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(ShipMethod shipMethod) {
        this.shipMethod = shipMethod;
    }

    public AccountShipContact getAccountShipContact() {
        return accountShipContact;
    }

    public void setAccountShipContact(AccountShipContact accountShipContact) {
        this.accountShipContact = accountShipContact;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }
}
