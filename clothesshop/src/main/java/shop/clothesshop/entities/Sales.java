package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "sales")
@Entity
public class Sales {
    @Id
    @Column(name = "salesid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salesId;

    @Column(name = "salescode")
    private String salesCode;

    @Column(name = "salesname")
    private String salesName;

    @Column(name = "salespercent")
    private Integer salesPercent;

    @Column(name = "salesint")
    private Integer salesInt;
    @OneToMany(mappedBy = "saleProperty", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BillSales> billSalesList;
    @Column(name = "opendate")
    private LocalDate openDate;
    @Column(name = "enddate")
    private LocalDate endDate;
    @Column(name = "salesstatusid", insertable = false, updatable = false)
    private Integer salesSatusId;
    @ManyToOne
    @JoinColumn(name = "salesstatusid")
    @JsonBackReference
    private SalesStatus salesStatus;

    public Integer getSalesSatusId() {
        return salesSatusId;
    }

    public void setSalesSatusId(Integer salesSatusId) {
        this.salesSatusId = salesSatusId;
    }

    public SalesStatus getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(SalesStatus salesStatus) {
        this.salesStatus = salesStatus;
    }

    public List<BillSales> getBillSalesList() {
        return billSalesList;
    }

    public void setBillSalesList(List<BillSales> billSalesList) {
        this.billSalesList = billSalesList;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Integer getSalesPercent() {
        return salesPercent;
    }

    public void setSalesPercent(Integer salesPercent) {
        this.salesPercent = salesPercent;
    }

    public Integer getSalesInt() {
        return salesInt;
    }

    public void setSalesInt(Integer salesInt) {
        this.salesInt = salesInt;
    }

    public List<BillSales> getPropertyDetailSalesList() {
        return billSalesList;
    }

    public void setPropertyDetailSalesList(List<BillSales> billSalesList) {
        this.billSalesList = billSalesList;
    }
}
