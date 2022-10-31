package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Table(name = "producttypedetail")
@Entity
public class ProductTypeDetail {
    @Id
    @Column(name = "producttypedetail")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productTypeDetailId;

    @Column(name = "productid", updatable = false, insertable = false)
    private Integer productId;

    @Column(name = "typedetailid", updatable = false, insertable = false)
    private Integer typeDetailId;

    @ManyToOne
    @JoinColumn(name = "productid")
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JoinColumn(name = "typedetailid")
    @JsonBackReference
    private TypeDetail typeDetail;

    public Integer getProductTypeDetailId() {
        return productTypeDetailId;
    }

    public void setProductTypeDetailId(Integer productTypeDetailId) {
        this.productTypeDetailId = productTypeDetailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(Integer typeDetailId) {
        this.typeDetailId = typeDetailId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public TypeDetail getTypeDetail() {
        return typeDetail;
    }

    public void setTypeDetail(TypeDetail typeDetail) {
        this.typeDetail = typeDetail;
    }
}
