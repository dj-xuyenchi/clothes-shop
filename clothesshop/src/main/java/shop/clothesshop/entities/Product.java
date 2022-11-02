package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "product")
@Entity
public class Product {
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "categorytypeid", insertable = false, updatable = false)
    private Integer categoryTypeId;
    @ManyToOne
    @JoinColumn(name = "categorytypeid")
    @JsonBackReference
    private CategoryType categoryType;
    @Column(name = "productname")
    private String productName;

    @Column(name = "producer")
    private String producer;

    @Column(name = "productdetail")
    private String productDetail;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Property> propertyList;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<VoteStar> voteStars;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ProductImg> productImgs;


    public Integer getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }


    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }


    public List<VoteStar> getVoteStars() {
        return voteStars;
    }

    public void setVoteStars(List<VoteStar> voteStars) {
        this.voteStars = voteStars;
    }

    public List<ProductImg> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(List<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }
}
