package kg.gov.mf.loan.manage.model.collateral;


import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "additionalAgreement")
public class AdditionalAgreement extends GenericModel {


    @Column(nullable=true, length=150)
    private String number;

    @Column(nullable = true)
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable=true)
    private Date date;

    @ManyToOne(targetEntity=CollateralAgreement.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collateralAgreementId")
    CollateralAgreement collateralAgreement;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CollateralAgreement getCollateralAgreement() {
        return collateralAgreement;
    }

    public void setCollateralAgreement(CollateralAgreement collateralAgreement) {
        this.collateralAgreement = collateralAgreement;
    }
}
