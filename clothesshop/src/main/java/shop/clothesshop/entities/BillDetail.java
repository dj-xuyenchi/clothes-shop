package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name = "billdetail")
@Entity
public class BillDetail {
    @Id
    @Column(name = "billdetailid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billDetailId;

    @Column(name = "billid", updatable = false, insertable = false)
    private Integer billId;

    @Column(name = "propertydetailid", updatable = false, insertable = false)
    private Integer propertyDetailId;


    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "billid")
    @JsonBackReference
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "propertydetailid")
    @JsonBackReference
    private PropertyDetail propertyDetail;


    public Integer getBillDetailId() {
        return billDetailId;
    }

    public void setBillDetailId(Integer billDetailId) {
        this.billDetailId = billDetailId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PropertyDetail getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(PropertyDetail propertyDetail) {
        this.propertyDetail = propertyDetail;
    }

}
