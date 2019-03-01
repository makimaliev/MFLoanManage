package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "guarantor_agreement")
public class GuarantorAgreement extends GenericModel {

    @Column(nullable=true, length=150)
    private String notaryOfficeRegNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column( nullable=true)
    private Date notaryOfficeRegDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="ownerId")
    private Owner owner;

    @ManyToOne(targetEntity=Owner.class, fetch = FetchType.LAZY)
    @JoinColumn(name="notary")
    private Owner notary;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name="loanGuarantorAgreement",
            joinColumns = { @JoinColumn(name = "guarantorAgreementId") },
            inverseJoinColumns = { @JoinColumn(name = "loanId") })
    Set<Loan> loans = new HashSet<Loan>();


    public String getNotaryOfficeRegNumber() {
        return notaryOfficeRegNumber;
    }

    public void setNotaryOfficeRegNumber(String notaryOfficeRegNumber) {
        this.notaryOfficeRegNumber = notaryOfficeRegNumber;
    }

    public Date getNotaryOfficeRegDate() {
        return notaryOfficeRegDate;
    }

    public void setNotaryOfficeRegDate(Date notaryOfficeRegDate) {
        this.notaryOfficeRegDate = notaryOfficeRegDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getNotary() {
        return notary;
    }

    public void setNotary(Owner notary) {
        this.notary = notary;
    }

    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }
}
