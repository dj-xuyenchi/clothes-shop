package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name = "propertydetailsales")
@Entity
public class PropertyDetailSales {
    @Id
    @Column(name = "propertydetailsalesid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer propertyDetailSalesId;

    @Column(name = "salesid", updatable = false, insertable = false)
    private Integer salesId;

    @Column(name = "propertydetailid", insertable = false, updatable = false)
    private Integer propertyDetailId;
    @Column(name = "propertydetailsalesstatusid", insertable = false, updatable = false)
    private Integer propertyDetailSalesStatusId;
    @ManyToOne
    @JoinColumn(name = "propertydetailsalesstatusid")
    @JsonBackReference
    private PropertyDetailSalesStatus propertyDetailSalesStatus;
    @ManyToOne
    @JoinColumn(name = "saleid")
    @JsonBackReference
    private Sales saleProperty;

    @ManyToOne
    @JoinColumn(name = "propertydetailid")
    @JsonBackReference
    private PropertyDetail propertyDetail;

    public Integer getPropertyDetailSalesId() {
        return propertyDetailSalesId;
    }

    public Integer getPropertyDetailSalesStatusId() {
        return propertyDetailSalesStatusId;
    }

    public void setPropertyDetailSalesStatusId(Integer propertyDetailSalesStatusId) {
        this.propertyDetailSalesStatusId = propertyDetailSalesStatusId;
    }

    public PropertyDetailSalesStatus getPropertyDetailSalesStatus() {
        return propertyDetailSalesStatus;
    }

    public void setPropertyDetailSalesStatus(PropertyDetailSalesStatus propertyDetailSalesStatus) {
        this.propertyDetailSalesStatus = propertyDetailSalesStatus;
    }

    public void setPropertyDetailSalesId(Integer propertyDetailSalesId) {
        this.propertyDetailSalesId = propertyDetailSalesId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Integer getPropertyDetailId() {
        return propertyDetailId;
    }

    public void setPropertyDetailId(Integer propertyDetailId) {
        this.propertyDetailId = propertyDetailId;
    }

    public Sales getSaleProperty() {
        return saleProperty;
    }

    public void setSaleProperty(Sales saleProperty) {
        this.saleProperty = saleProperty;
    }

    public PropertyDetail getPropertyDetail() {
        return propertyDetail;
    }

    public void setPropertyDetail(PropertyDetail propertyDetail) {
        this.propertyDetail = propertyDetail;
    }
}
