package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import kg.gov.mf.loan.process.model.Accrue;
import kg.gov.mf.loan.process.model.LoanDetailedSummary;
import kg.gov.mf.loan.process.model.LoanSummary;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.collateral.Collateral;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Entity
@Table(name="loan")
public class Loan extends GenericModel{
	
	@Column(nullable=false, length=50)
	private String regNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date regDate;
	
	@Column(precision = 12, scale = 5)
	private Double amount;
	
	@ManyToOne(targetEntity=OrderTermCurrency.class, fetch = FetchType.EAGER)
	@JoinColumn(name="currencyId")
	private OrderTermCurrency currency;
	
	@ManyToOne(targetEntity=LoanType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="loanTypeId")
	private LoanType loanType;
	
	@ManyToOne(targetEntity=LoanState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="loanStateId")
	private LoanState loanState;
	
	@Column(nullable=false)
	private long supervisorId;
	
	private boolean hasSubLoan;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
	@JoinColumn(name="parentLoanId")
	private Loan parentLoan;
	
	@OneToMany(mappedBy = "parentLoan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<Loan> subLoans = new HashSet<Loan>();
	
	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrderId", nullable=true)
	private CreditOrder creditOrder;
	
	@ManyToOne(targetEntity=Debtor.class, fetch = FetchType.EAGER)
    @JoinColumn(name="debtorId")
	Debtor debtor;
	
	@ManyToOne(targetEntity=CollectionPhase.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collectionPhaseId")
	CollectionPhase collectionPhase;
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CreditTerm> creditTerms = new HashSet<CreditTerm>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<WriteOff> writeOffs = new HashSet<WriteOff>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
	@OrderBy("expectedDate")
    private Set<PaymentSchedule> paymentSchedules = new HashSet<PaymentSchedule>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<Payment> payments = new HashSet<Payment>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<SupervisorPlan> supervisorPlans = new HashSet<SupervisorPlan>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<LoanGoods> loanGoods = new HashSet<LoanGoods>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<DebtTransfer> debtTransfers = new HashSet<DebtTransfer>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<TargetedUse> targetedUses = new HashSet<TargetedUse>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<ReconstructedList> reconstructedLists = new HashSet<ReconstructedList>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<Bankrupt> bankrupts = new HashSet<Bankrupt>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<Collateral> collaterals = new HashSet<Collateral>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
	@OrderBy("fromDate")
	private Set<Accrue> accrues = new HashSet<Accrue>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
	@OrderBy("onDate")
	private Set<LoanSummary> loanSummaries = new HashSet<LoanSummary>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
	@OrderBy("onDate")
	private Set<LoanDetailedSummary> loanDetailedSummaries = new HashSet<LoanDetailedSummary>();
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="loans")
	Set<CollateralAgreement> collateralAgreements = new HashSet<CollateralAgreement>();
	
	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public OrderTermCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(OrderTermCurrency currency) {
		this.currency = currency;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public LoanState getLoanState() {
		return loanState;
	}

	public void setLoanState(LoanState loanState) {
		this.loanState = loanState;
	}

	public long getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(long supervisorId) {
		this.supervisorId = supervisorId;
	}

	public boolean isHasSubLoan() {
		return hasSubLoan;
	}

	public void setHasSubLoan(boolean hasSubLoan) {
		this.hasSubLoan = hasSubLoan;
	}

	public Loan getParentLoan() {
		return parentLoan;
	}

	public void setParentLoan(Loan parentLoan) {
		this.parentLoan = parentLoan;
	}

	public Set<Loan> getSubLoans() {
		return subLoans;
	}

	public void setSubLoans(Set<Loan> subLoans) {
		this.subLoans = subLoans;
	}

	public CreditOrder getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(CreditOrder creditOrder) {
		this.creditOrder = creditOrder;
	}

	public Debtor getDebtor() {
		return debtor;
	}

	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}

	public CollectionPhase getCollectionPhase() {
		return collectionPhase;
	}

	public void setCollectionPhase(CollectionPhase collectionPhase) {
		this.collectionPhase = collectionPhase;
	}

	public Set<CreditTerm> getCreditTerms() {
		return creditTerms;
	}

	public void setCreditTerms(Set<CreditTerm> creditTerms) {
		this.creditTerms = creditTerms;
	}

	public Set<WriteOff> getWriteOffs() {
		return writeOffs;
	}

	public void setWriteOffs(Set<WriteOff> writeOffs) {
		this.writeOffs = writeOffs;
	}

	public Set<PaymentSchedule> getPaymentSchedules() {
		return paymentSchedules;
	}

	public void setPaymentSchedules(Set<PaymentSchedule> paymentSchedules) {
		this.paymentSchedules = paymentSchedules;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<SupervisorPlan> getSupervisorPlans() {
		return supervisorPlans;
	}

	public void setSupervisorPlans(Set<SupervisorPlan> supervisorPlans) {
		this.supervisorPlans = supervisorPlans;
	}

	public Set<LoanGoods> getLoanGoods() {
		return loanGoods;
	}

	public void setLoanGoods(Set<LoanGoods> loanGoods) {
		this.loanGoods = loanGoods;
	}

	public Set<DebtTransfer> getDebtTransfers() {
		return debtTransfers;
	}

	public void setDebtTransfers(Set<DebtTransfer> debtTransfers) {
		this.debtTransfers = debtTransfers;
	}

	public Set<TargetedUse> getTargetedUses() {
		return targetedUses;
	}

	public void setTargetedUses(Set<TargetedUse> targetedUses) {
		this.targetedUses = targetedUses;
	}

	public Set<ReconstructedList> getReconstructedLists() {
		return reconstructedLists;
	}

	public void setReconstructedLists(Set<ReconstructedList> reconstructedLists) {
		this.reconstructedLists = reconstructedLists;
	}

	public Set<Bankrupt> getBankrupts() {
		return bankrupts;
	}

	public void setBankrupts(Set<Bankrupt> bankrupts) {
		this.bankrupts = bankrupts;
	}

	public Set<Collateral> getCollaterals() {
		return collaterals;
	}

	public void setCollaterals(Set<Collateral> collaterals) {
		this.collaterals = collaterals;
	}

	public Set<CollateralAgreement> getCollateralAgreements() {
		return collateralAgreements;
	}

	public void setCollateralAgreements(Set<CollateralAgreement> collateralAgreements) {
		this.collateralAgreements = collateralAgreements;
	}

	public Set<Accrue> getAccrues() {
		return accrues;
	}

	public void setAccrues(Set<Accrue> accrues) {
		this.accrues = accrues;
	}

	public Set<LoanSummary> getLoanSummaries() {
		return loanSummaries;
	}

	public void setLoanSummaries(Set<LoanSummary> loanSummaries) {
		this.loanSummaries = loanSummaries;
	}

	public Set<LoanDetailedSummary> getLoanDetailedSummaries() {
		return loanDetailedSummaries;
	}

	public void setLoanDetailedSummaries(Set<LoanDetailedSummary> loanDetailedSummaries) {
		this.loanDetailedSummaries = loanDetailedSummaries;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 83 * hash + Objects.hashCode(this.getId());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Loan other = (Loan) obj;
		if (!Objects.equals(this.getId(), other.getId())) {
			return false;
		}
		return true;
	}
}
