package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Table(name = "sex")
@Entity
public class Sex {
    @Id
    @Column(name="sexid")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer sexId;

    @Column(name="sexcode")
    private String sexCode;

    @Column(name="sexdetail")
    private String sexDetail;

    @OneToMany(mappedBy = "sex",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Accounts> accounts;

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getSexDetail() {
        return sexDetail;
    }

    public void setSexDetail(String sexDetail) {
        this.sexDetail = sexDetail;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
}
