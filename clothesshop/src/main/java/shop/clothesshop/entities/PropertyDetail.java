package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "propertydetail")
@Entity
public class PropertyDetail {
    @Id
    @Column(name = "propertydetailid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer propertyDetailId;

    @Column(name = "propertyid", updatable = false, insertable = false)
    private Integer propertyId;

    @Column(name = "parentid")
    private Integer parentId;

    @Column(name = "propertydetailname")
    private String propertyDetailName;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "gianhap")
    private Integer giaNhap;

    @Column(name = "shellprice")
    private Integer shellPrice;

    @OneToMany(mappedBy = "propertyDetail", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BillDetail> billDetails;

    @OneToMany(mappedBy = "propertyDetail", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PropertyDetailSales> propertyDetailSalesList;

    @ManyToOne
    @JoinColumn(name = "propertyid")
    @JsonBackReference
    private Property property;

    @OneToMany(mappedBy = "propertyDetail", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<AccountBag> accountBagList;

    public Integer getPropertyDetailId() {
        return propertyDetailId;
    }

    public void setPropertyDetailId(Integer propertyDetailId) {
        this.propertyDetailId = propertyDetailId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPropertyDetailName() {
        return propertyDetailName;
    }

    public void setPropertyDetailName(String propertyDetailName) {
        this.propertyDetailName = propertyDetailName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Integer giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Integer getShellPrice() {
        return shellPrice;
    }

    public void setShellPrice(Integer shellPrice) {
        this.shellPrice = shellPrice;
    }

    public List<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(List<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    public List<PropertyDetailSales> getPropertyDetailSalesList() {
        return propertyDetailSalesList;
    }

    public void setPropertyDetailSalesList(List<PropertyDetailSales> propertyDetailSalesList) {
        this.propertyDetailSalesList = propertyDetailSalesList;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public List<AccountBag> getAccountBagList() {
        return accountBagList;
    }

    public void setAccountBagList(List<AccountBag> accountBagList) {
        this.accountBagList = accountBagList;
    }
}
