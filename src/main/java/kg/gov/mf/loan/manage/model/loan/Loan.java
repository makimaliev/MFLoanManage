package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.collateral.CollateralAgreement;
import kg.gov.mf.loan.manage.model.collection.CollectionPhase;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermCurrency;

@Entity
@Table(name="loan")
public class Loan extends BaseModel {
	
	@Column(nullable=false, length=150)
	private String regNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date regDate;
	
	@Column(precision = 12, scale = 5)
	private Double amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currencyId", nullable = false)
	private OrderTermCurrency currency;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanTypeId", nullable = false)
	private LoanType loanType;

	@Enumerated(EnumType.STRING)
	private LoanState loanState;
	
	@Column(nullable=false)
	private long supervisorId;
	
	private boolean hasSubLoan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentLoanId")
	private Loan parentLoan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creditOrderId", nullable = false)
	private CreditOrder creditOrder;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "debtorId", nullable = false)
	Debtor debtor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "collectionPhaseId", nullable = false)
	CollectionPhase collectionPhase;

	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	@JoinTable(name = "loan_collateral_agreement",
			joinColumns = { @JoinColumn(name = "loanId") },
			inverseJoinColumns = { @JoinColumn(name = "collateralAgreementId") })
	private Set<CollateralAgreement> collateralAgreements = new HashSet<>();

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

	public CollectionPhase getCollectionPhase() {
		return collectionPhase;
	}

	public void setCollectionPhase(CollectionPhase collectionPhase) {
		this.collectionPhase = collectionPhase;
	}

	public Set<CollateralAgreement> getCollateralAgreements() {
		return collateralAgreements;
	}

	public void setCollateralAgreements(Set<CollateralAgreement> collateralAgreements) {
		this.collateralAgreements = collateralAgreements;
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
