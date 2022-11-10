package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name = "billsales")
@Entity
public class BillSales {
    @Id
    @Column(name = "billsalesid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billSalesId;
    @Column(name = "salesid", updatable = false, insertable = false)
    private Integer salesId;
    @Column(name = "billdetailid", insertable = false, updatable = false)
    private Integer billDetailId;

    @ManyToOne
    @JoinColumn(name = "salesid")
    @JsonBackReference
    private Sales saleProperty;
    @ManyToOne
    @JoinColumn(name = "billdetailid")
    @JsonBackReference
    private BillDetail billDetail;

    public Integer getBillSalesId() {
        return billSalesId;
    }

    public void setBillSalesId(Integer billSalesId) {
        this.billSalesId = billSalesId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Integer getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(Integer billDetailId) {
        this.billDetailId = billDetailId;
    }

    public Sales getSaleProperty() {
        return saleProperty;
    }

    public void setSaleProperty(Sales saleProperty) {
        this.saleProperty = saleProperty;
    }

    public BillDetail getBillDetail() {
        return billDetail;
    }

    public void setBillDetail(BillDetail billDetail) {
        this.billDetail = billDetail;
    }
}
