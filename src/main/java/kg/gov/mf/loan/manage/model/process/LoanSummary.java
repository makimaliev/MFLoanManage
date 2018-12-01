package kg.gov.mf.loan.manage.model.process;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.loan.Loan;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="loanSummary")
public class LoanSummary extends GenericModel {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date onDate;

    @Column(precision = 12, scale = 5)
    private Double loanAmount;

    @Column(precision = 12, scale = 5)
    private Double totalDisbursed;

    @Column(precision = 12, scale = 5)
    private Double totalPaid;

    @Column(precision = 12, scale = 5)
    private Double totalPaidKGS;

    @Column(precision = 12, scale = 5)
    private Double paidPrincipal;

    @Column(precision = 12, scale = 5)
    private Double paidInterest;

    @Column(precision = 12, scale = 5)
    private Double paidPenalty;

    @Column(precision = 12, scale = 5)
    private Double paidFee;

    @Column(precision = 12, scale = 5)
    private Double totalOutstanding;

    @Column(precision = 12, scale = 5)
    private Double outstadingPrincipal;

    @Column(precision = 12, scale = 5)
    private Double outstadingInterest;

    @Column(precision = 12, scale = 5)
    private Double outstadingPenalty;

    @Column(precision = 12, scale = 5)
    private Double outstadingFee;

    @Column(precision = 12, scale = 5)
    private Double totalOverdue;

    @Column(precision = 12, scale = 5)
    private Double overduePrincipal;

    @Column(precision = 12, scale = 5)
    private Double overdueInterest;

    @Column(precision = 12, scale = 5)
    private Double overduePenalty;

    @Column(precision = 12, scale = 5)
    private Double overdueFee;

    @Column(precision = 12, scale = 5)
    private Double totalPrincipalPaid;

    @Column(precision = 12, scale = 5)
    private Double totalInterestPaid;

    @Column(precision = 12, scale = 5)
    private Double totalPenaltyPaid;

    @Column(precision = 12, scale = 5)
    private Double totalFeePaid;

    @Column(length = 10, columnDefinition = "varchar(10) default 'SYSTEM'")
    @Enumerated(EnumType.STRING)
    private LoanSummaryType loanSummaryType = LoanSummaryType.SYSTEM;

    @ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getTotalDisbursed() {
        return totalDisbursed;
    }

    public void setTotalDisbursed(Double totalDisbursed) {
        this.totalDisbursed = totalDisbursed;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Double getPaidPrincipal() {
        return paidPrincipal;
    }

    public void setPaidPrincipal(Double paidPrincipal) {
        this.paidPrincipal = paidPrincipal;
    }

    public Double getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(Double paidInterest) {
        this.paidInterest = paidInterest;
    }

    public Double getPaidPenalty() {
        return paidPenalty;
    }

    public void setPaidPenalty(Double paidPenalty) {
        this.paidPenalty = paidPenalty;
    }

    public Double getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(Double paidFee) {
        this.paidFee = paidFee;
    }

    public Double getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(Double totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public Double getOutstadingPrincipal() {
        return outstadingPrincipal;
    }

    public void setOutstadingPrincipal(Double outstadingPrincipal) {
        this.outstadingPrincipal = outstadingPrincipal;
    }

    public Double getOutstadingInterest() {
        return outstadingInterest;
    }

    public void setOutstadingInterest(Double outstadingInterest) {
        this.outstadingInterest = outstadingInterest;
    }

    public Double getOutstadingPenalty() {
        return outstadingPenalty;
    }

    public void setOutstadingPenalty(Double outstadingPenalty) {
        this.outstadingPenalty = outstadingPenalty;
    }

    public Double getOutstadingFee() {
        return outstadingFee;
    }

    public void setOutstadingFee(Double outstadingFee) {
        this.outstadingFee = outstadingFee;
    }

    public Double getTotalOverdue() {
        return totalOverdue;
    }

    public void setTotalOverdue(Double totalOverdue) {
        this.totalOverdue = totalOverdue;
    }

    public Double getOverduePrincipal() {
        return overduePrincipal;
    }

    public void setOverduePrincipal(Double overduePrincipal) {
        this.overduePrincipal = overduePrincipal;
    }

    public Double getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Double overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Double getOverduePenalty() {
        return overduePenalty;
    }

    public void setOverduePenalty(Double overduePenalty) {
        this.overduePenalty = overduePenalty;
    }

    public Double getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(Double overdueFee) {
        this.overdueFee = overdueFee;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Double getTotalPrincipalPaid() {
        return totalPrincipalPaid;
    }

    public void setTotalPrincipalPaid(Double totalPrincipalPaid) {
        this.totalPrincipalPaid = totalPrincipalPaid;
    }

    public Double getTotalInterestPaid() {
        return totalInterestPaid;
    }

    public void setTotalInterestPaid(Double totalInterestPaid) {
        this.totalInterestPaid = totalInterestPaid;
    }

    public Double getTotalPenaltyPaid() {
        return totalPenaltyPaid;
    }

    public void setTotalPenaltyPaid(Double totalPenaltyPaid) {
        this.totalPenaltyPaid = totalPenaltyPaid;
    }

    public Double getTotalFeePaid() {
        return totalFeePaid;
    }

    public void setTotalFeePaid(Double totalFeePaid) {
        this.totalFeePaid = totalFeePaid;
    }

    public LoanSummaryType getLoanSummaryType() {
        return loanSummaryType;
    }

    public void setLoanSummaryType(LoanSummaryType loanSummaryType) {
        this.loanSummaryType = loanSummaryType;
    }

    public Double getTotalPaidKGS() {
        return totalPaidKGS;
    }

    public void setTotalPaidKGS(Double totalPaidKGS) {
        this.totalPaidKGS = totalPaidKGS;
    }
}
