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

    @Column(name = "buymethodid",updatable = false,insertable = false)
    private Integer buyMethodId;

    @Column(name = "shipmethodid",updatable = false,insertable = false)
    private Integer shipMethodId;

    @Column(name = "createdate")
    private LocalDate createDate;
    @Column(name = "shiptobuyerdate")
    private LocalDate shipToBuyerDate;

    @Column(name = "billstatus")
    private Integer billStatus;

    @Column(name = "receiveddate")
    private LocalDate receivedDate;

    @Column(name = "canceldatetime")
    private LocalDate cancelDateTime;

    @Column(name = "buyernotification")
    private String buyerNotification;

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

    @ManyToOne
    @JoinColumn(name="cancelstatus")
    @JsonBackReference
    private CancelReason cancelReason;

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

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalDate getCancelDateTime() {
        return cancelDateTime;
    }

    public void setCancelDateTime(LocalDate cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
    }

    public String getBuyerNotification() {
        return buyerNotification;
    }

    public void setBuyerNotification(String buyerNotification) {
        this.buyerNotification = buyerNotification;
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

    public CancelReason getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(CancelReason cancelReason) {
        this.cancelReason = cancelReason;
    }
}
