package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.collateral.Collateral;
import kg.gov.mf.loan.manage.model.collection.Collection;
import kg.gov.mf.loan.manage.model.collection.EventDetails;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Entity
@Table(name="loan")
public class Loan extends GenericModel{
	
	@Column(name="reg_number", nullable=false, length=50)
	private String regNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="reg_date", nullable=false)
	private Date regDate;
	
	@Column(name = "amount", precision = 12, scale = 5)
	private Double amount;
	
	@ManyToOne(targetEntity=OrderTermCurrency.class, fetch = FetchType.EAGER)
	@JoinColumn(name="currency_id")
	private OrderTermCurrency currency;
	
	@ManyToOne(targetEntity=LoanType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="loan_type_id")
	private LoanType loanType;
	
	@ManyToOne(targetEntity=LoanState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="loan_state_id")
	private LoanState loanState;
	
	@Column(name="supervisor_id", nullable=false)
	private long supervisorId;
	
	@Column(name="has_sub_loan")
	private boolean hasSubLoan;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
	@JoinColumn(name="parent_loan_id", nullable=true)
	private Loan parentLoan;
	
	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.EAGER)
	@JoinColumn(name="credit_order_id", nullable=true)
	private CreditOrder creditOrder;
	
	@ManyToOne(targetEntity=Debtor.class, fetch = FetchType.EAGER)
    @JoinColumn(name="debtorId")
	Debtor debtor;
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CreditTerm> creditTerms = new HashSet<CreditTerm>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<WriteOff> writeOffs = new HashSet<WriteOff>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
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
    private Set<Collection> collections = new HashSet<Collection>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<PhaseDetails> phaseDetails = new HashSet<PhaseDetails>();
	
	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<EventDetails> eventDetails = new HashSet<EventDetails>();
	
	/*
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="loan_collateral",
			joinColumns = { @JoinColumn(name = "loan_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "collateralAgreement_id") })
	Set<CollateralAgreement> collateralAgreements = new HashSet<CollateralAgreement>();
	*/
	
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

	public Set<Collection> getCollections() {
		return collections;
	}

	public void setCollections(Set<Collection> collections) {
		this.collections = collections;
	}

	public Set<PhaseDetails> getPhaseDetails() {
		return phaseDetails;
	}

	public void setPhaseDetails(Set<PhaseDetails> phaseDetails) {
		this.phaseDetails = phaseDetails;
	}

	public Set<EventDetails> getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(Set<EventDetails> eventDetails) {
		this.eventDetails = eventDetails;
	}
}
