package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;


@Table(name = "cancelreason")
@Entity
public class CancelReason {
    @Id
    @Column(name = "cancelreasonid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cancelReasonId;

    @Column(name = "cancelreasoncode")
    private String cancelReasonCode;

    @Column(name = "cancelreasonname")
    private String cancelReasonName;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cancelReason")
    @JsonManagedReference
    private List<Bill> bills;

    public Integer getCancelReasonId() {
        return cancelReasonId;
    }

    public void setCancelReasonId(Integer cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }

    public String getCancelReasonCode() {
        return cancelReasonCode;
    }

    public void setCancelReasonCode(String cancelReasonCode) {
        this.cancelReasonCode = cancelReasonCode;
    }

    public String getCancelReasonName() {
        return cancelReasonName;
    }

    public void setCancelReasonName(String cancelReasonName) {
        this.cancelReasonName = cancelReasonName;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
