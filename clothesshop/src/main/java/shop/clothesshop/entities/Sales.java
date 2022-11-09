package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
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
