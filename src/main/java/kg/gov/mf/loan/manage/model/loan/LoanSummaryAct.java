package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.process.LoanSummary;
import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "loanSummaryAct")
public class LoanSummaryAct extends GenericModel {

    @ManyToOne(targetEntity=Debtor.class, fetch = FetchType.LAZY)
    @JoinColumn(name="debtorId")
    Debtor debtor;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<LoanSummary> loanSummaries= new HashSet<LoanSummary>();

    @ManyToOne(targetEntity=LoanSummaryActState.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanSummaryActStateId")
    private LoanSummaryActState loanSummaryActState;

    @Temporal(TemporalType.DATE)
    private Date onDate;

    @Temporal(TemporalType.DATE)
    private Date registeredDate;

    @Temporal(TemporalType.DATE)
    private Date signedDate;

    @Column(precision = 12, scale = 5)
    private Double amount;

    public Set<LoanSummary> getLoanSummaries() {
        return loanSummaries;
    }

    public void setLoanSummaries(Set<LoanSummary> loanSummaries) {
        this.loanSummaries = loanSummaries;
    }

    public LoanSummaryActState getLoanSummaryActState() {
        return loanSummaryActState;
    }

    public void setLoanSummaryActState(LoanSummaryActState loanSummaryActState) {
        this.loanSummaryActState = loanSummaryActState;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
