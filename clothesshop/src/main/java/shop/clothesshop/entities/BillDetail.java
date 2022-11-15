package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "billdetail")
@Entity
public class BillDetail {
    @Id
    @Column(name = "billdetailid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billDetailId;

    @Column(name = "billid", updatable = false, insertable = false)
    private Integer billId;

    @Column(name = "productid", updatable = false, insertable = false)
    private Integer productId;


    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "billid")
    @JsonBackReference
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "productid")
    @JsonBackReference
    private Product product;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "billDetail")
    @JsonManagedReference
    private List<BillDetailSales> billDetailSalesses;

    public List<BillDetailSales> getBillSaless() {
        return billDetailSalesses;
    }

    public void setBillSaless(List<BillDetailSales> billDetailSalesses) {
        this.billDetailSalesses = billDetailSalesses;
    }

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

}
