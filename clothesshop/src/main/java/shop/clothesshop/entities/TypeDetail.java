package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name="typedetail")
@Entity
public class TypeDetail {
    @Id
    @Column(name="typedetailid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeDetailId;

    @Column(name="typedetailcode")
    private String typeDetailCode;

    @Column(name="typedetailname")
    private String typeDetailName;
    @OneToMany(mappedBy = "typeDetail",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProductTypeDetail> productTypeDetails;

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(Integer typeDetailId) {
        this.typeDetailId = typeDetailId;
    }

    public String getTypeDetailCode() {
        return typeDetailCode;
    }

    public void setTypeDetailCode(String typeDetailCode) {
        this.typeDetailCode = typeDetailCode;
    }

    public String getTypeDetailName() {
        return typeDetailName;
    }

    public void setTypeDetailName(String typeDetailName) {
        this.typeDetailName = typeDetailName;
    }

    public List<ProductTypeDetail> getProductTypeDetails() {
        return productTypeDetails;
    }

    public void setProductTypeDetails(List<ProductTypeDetail> productTypeDetails) {
        this.productTypeDetails = productTypeDetails;
    }
}
