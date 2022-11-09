package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name = "productsales")
@Entity
public class BillSales {
    @Id
    @Column(name = "productsalesid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productSalesId;
    @Column(name = "salesid", updatable = false, insertable = false)
    private Integer salesId;
    @Column(name = "billdetailid", insertable = false, updatable = false)
    private Integer billDetailId;
    @Column(name = "salesstatusid", insertable = false, updatable = false)
    private Integer salesSatusId;
    @ManyToOne
    @JoinColumn(name = "salesstatusid")
    @JsonBackReference
    private SalesStatus salesStatus;
    @ManyToOne
    @JoinColumn(name = "saleid")
    @JsonBackReference
    private Sales saleProperty;
    @ManyToOne
    @JoinColumn(name = "billdetailid")
    @JsonBackReference
    private BillDetail billDetail;

    public Integer getProductSalesId() {
        return productSalesId;
    }

    public void setProductSalesId(Integer productSalesId) {
        this.productSalesId = productSalesId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }


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

    public Sales getSaleProperty() {
        return saleProperty;
    }

    public void setSaleProperty(Sales saleProperty) {
        this.saleProperty = saleProperty;
    }

    public Integer getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(Integer billDetailId) {
        this.billDetailId = billDetailId;
    }

    public BillDetail getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(BillDetail billDetail) {
        this.billDetail = billDetail;
    }
}
