package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.collateral.GuarantorAgreement;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFund;
import kg.gov.mf.loan.manage.model.process.Accrue;
import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;
import kg.gov.mf.loan.manage.model.process.LoanSummary;
import org.hibernate.annotations.DiscriminatorOptions;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.collateral.Collateral;
import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Entity
@Table(name="loan")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER,
		name = "loan_class_id",
		columnDefinition = "TINYINT(1)")
@DiscriminatorOptions(force = true)
public abstract class Loan{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long version = 1L;

	@OneToMany(mappedBy="parent",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Loan> children;

	@ManyToOne
	@JoinColumn
	private Loan parent;

	@Column(nullable=false, length=150)
	private String regNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date regDate;

	@Column(precision = 12, scale = 5)
	private Double amount;

	@ManyToOne(targetEntity=OrderTermCurrency.class, fetch = FetchType.LAZY)
	@JoinColumn(name="currencyId")
	private OrderTermCurrency currency;

	@ManyToOne(targetEntity=LoanType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="loanTypeId")
	private LoanType loanType;

	@ManyToOne(targetEntity=LoanState.class, fetch = FetchType.LAZY)
	@JoinColumn(name="loanStateId")
	private LoanState loanState;

	@ManyToOne(targetEntity=LoanFinGroup.class, fetch = FetchType.LAZY)
	@JoinColumn(name="loanFinGroupId")
	private LoanFinGroup loanFinGroup;

	@Column(nullable=false)
	private long supervisorId;

	@Column
	private long bankDataId;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="closeDate")
    private Date closeDate;

	@Column(precision = 12, scale = 5)
	private Double closeRate;

	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.LAZY)
	@JoinColumn(name="creditOrderId", nullable=true)
	private CreditOrder creditOrder;

	@ManyToOne(targetEntity=Debtor.class, fetch = FetchType.LAZY)
    @JoinColumn(name="debtorId")
	Debtor debtor;

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CreditTerm> creditTerms = new HashSet<CreditTerm>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<WriteOff> writeOffs = new HashSet<WriteOff>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Judgement> judgements = new HashSet<Judgement>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("expectedDate")
    private Set<PaymentSchedule> paymentSchedules = new HashSet<PaymentSchedule>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Payment> payments = new HashSet<Payment>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SupervisorPlan> supervisorPlans = new HashSet<SupervisorPlan>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<LoanGoods> loanGoods = new HashSet<LoanGoods>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DebtTransfer> debtTransfers = new HashSet<DebtTransfer>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TargetedUse> targetedUses = new HashSet<TargetedUse>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ReconstructedList> reconstructedLists = new HashSet<ReconstructedList>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Bankrupt> bankrupts = new HashSet<Bankrupt>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Collateral> collaterals = new HashSet<Collateral>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("fromDate")
	private Set<Accrue> accrues = new HashSet<Accrue>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("onDate")
	private Set<LoanSummary> loanSummaries = new HashSet<LoanSummary>();

	@OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("onDate")
	private Set<LoanDetailedSummary> loanDetailedSummaries = new HashSet<LoanDetailedSummary>();

	@ManyToMany(mappedBy="loans", fetch = FetchType.LAZY)
	Set<CollateralAgreement> collateralAgreements = new HashSet<CollateralAgreement>();

	@ManyToMany(mappedBy="loans", fetch = FetchType.LAZY)
	Set<GuarantorAgreement> guarantorAgreements= new HashSet<GuarantorAgreement>();

	@ManyToMany(mappedBy="loans", fetch = FetchType.LAZY)
	Set<CollectionPhase> collectionPhases = new HashSet<>();

    @ManyToOne(targetEntity=OrderTermFund.class, fetch = FetchType.LAZY)
    @JoinColumn(name="fundId")
    private OrderTermFund fund;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Transient
    public boolean isLeaf(){
        return (children == null || children.size() == 0);
    }

    @Transient
    public boolean isRoot() {
        return (parent == null);
    }

    public Set<Loan> getChildren() {
        return children;
    }
    public void setChildren(Set<Loan> children) {
        this.children = children;
    }

    public Loan getParent() {
        return parent;
    }
    public void setParent(Loan parent) {
        this.parent = parent;
    }

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
        return this.amount;
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

    public Set<Judgement> getJudgements() {
        return judgements;
    }

    public void setJudgements(Set<Judgement> judgements) {
        this.judgements = judgements;
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

	public Set<GuarantorAgreement> getGuarantorAgreements() {
		return guarantorAgreements;
	}

	public void setGuarantorAgreements(Set<GuarantorAgreement> guarantorAgreements) {
		this.guarantorAgreements = guarantorAgreements;
	}

	public Set<CollectionPhase> getCollectionPhases() {
		return collectionPhases;
	}

	public void setCollectionPhases(Set<CollectionPhase> collectionPhases) {
		this.collectionPhases = collectionPhases;
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

    public OrderTermFund getFund() {
        return fund;
    }

    public void setFund(OrderTermFund fund) {
        this.fund = fund;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

	public long getBankDataId() {
		return bankDataId;
	}

	public void setBankDataId(long bankDataId) {
		this.bankDataId = bankDataId;
	}

    public Double getCloseRate() {
        return closeRate;
    }

    public void setCloseRate(Double closeRate) {
        this.closeRate = closeRate;
    }

	public LoanFinGroup getLoanFinGroup() {
		return loanFinGroup;
	}

	public void setLoanFinGroup(LoanFinGroup loanFinGroup) {
		this.loanFinGroup = loanFinGroup;
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
