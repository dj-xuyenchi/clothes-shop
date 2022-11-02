package shop.clothesshop.entities;

import javax.persistence.*;

@Entity
@Table(name="propertydetailsalesstatus")
public class PropertyDetailSalesStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="propertydetailsalesstatusid")
    private Integer propertyDetailSalesStatusId;
    @Column(name="propertydetailsalesstatuscode")
    private String propertyDetailSalesStatusCode;
    @Column(name="propertydetailsalesstatusdetail")
    private String propertyDetailSalesStatusDetail;

    public Integer getPropertyDetailSalesStatusId() {
        return propertyDetailSalesStatusId;
    }

    public void setPropertyDetailSalesStatusId(Integer propertyDetailSalesStatusId) {
        this.propertyDetailSalesStatusId = propertyDetailSalesStatusId;
    }

    public String getPropertyDetailSalesStatusCode() {
        return propertyDetailSalesStatusCode;
    }

    public void setPropertyDetailSalesStatusCode(String propertyDetailSalesStatusCode) {
        this.propertyDetailSalesStatusCode = propertyDetailSalesStatusCode;
    }

    public String getPropertyDetailSalesStatusDetail() {
        return propertyDetailSalesStatusDetail;
    }

    public void setPropertyDetailSalesStatusDetail(String propertyDetailSalesStatusDetail) {
        this.propertyDetailSalesStatusDetail = propertyDetailSalesStatusDetail;
    }
}

