package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.manage.model.process.LoanSummary;
import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "loanSummaryAct")
public class LoanSummaryAct extends GenericModel {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<LoanSummary> loanSummaries= new HashSet<LoanSummary>();

    @ManyToOne(targetEntity=InstallmentState.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanSummaryActStateId")
    private LoanSummaryActState loanSummaryActState;

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
}
