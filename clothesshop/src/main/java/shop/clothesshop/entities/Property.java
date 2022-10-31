package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "property")
@Entity

public class Property {
    @Id
    @Column(name = "propertyid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer propertyId;
    @Column(name = "productid", updatable = false, insertable = false)
    private Integer productId;
    @Column(name = "propertyname")
    private String propertyName;

    @Column(name = "propertysort")
    private Integer propertySort;
    @OneToMany(mappedBy = "property",fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<PropertyDetail> propertyDetails;

    @ManyToOne
    @JoinColumn(name = "productid")
    @JsonBackReference
    private Product product;

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Integer getPropertySort() {
        return propertySort;
    }

    public void setPropertySort(Integer propertySort) {
        this.propertySort = propertySort;
    }

    public List<PropertyDetail> getPropertyDetails() {
        return propertyDetails;
    }

    public void setPropertyDetails(List<PropertyDetail> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
