package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collateralAgreement")
public class CollateralAgreement extends GenericModel{
	
	@Column(nullable=false, length=50)
	private String agreementNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date agreementDate;
	
	@Column(nullable=false, length=50)
	private String collateralOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date collateralOfficeRegDate;
	
	@Column(nullable=false, length=50)
	private String notaryOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column( nullable=false)
	private Date notaryOfficeRegDate;
	
	@Column(nullable=false, length=50)
	private String arrestRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date arrestRegDate;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="ownerId")
    Owner owner;
	
	@OneToMany(mappedBy = "collateralAgreement", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralItem> collateralItems = new HashSet<CollateralItem>();
	
	/*
	@OneToMany(mappedBy = "collateralAgreement", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralInspection> collateralInspections = new HashSet<CollateralInspection>();
	
	@OneToMany(mappedBy = "collateralAgreement", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralArrestFree> collateralArrestFrees = new HashSet<CollateralArrestFree>();
	*/

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name="loan_collateralagreement",
			joinColumns = { @JoinColumn(name = "collateralAgreementId") }, 
	        inverseJoinColumns = { @JoinColumn(name = "loanId") })
	Set<Loan> loans = new HashSet<Loan>();
	
	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public Date getAgreementDate() {
		return agreementDate;
	}

	public void setAgreementDate(Date agreementDate) {
		this.agreementDate = agreementDate;
	}

	public String getCollateralOfficeRegNumber() {
		return collateralOfficeRegNumber;
	}

	public void setCollateralOfficeRegNumber(String collateralOfficeRegNumber) {
		this.collateralOfficeRegNumber = collateralOfficeRegNumber;
	}

	public Date getCollateralOfficeRegDate() {
		return collateralOfficeRegDate;
	}

	public void setCollateralOfficeRegDate(Date collateralOfficeRegDate) {
		this.collateralOfficeRegDate = collateralOfficeRegDate;
	}

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

	public String getArrestRegNumber() {
		return arrestRegNumber;
	}

	public void setArrestRegNumber(String arrestRegNumber) {
		this.arrestRegNumber = arrestRegNumber;
	}

	public Date getArrestRegDate() {
		return arrestRegDate;
	}

	public void setArrestRegDate(Date arrestRegDate) {
		this.arrestRegDate = arrestRegDate;
	}

	/*
	public Set<CollateralInspection> getCollateralInspections() {
		return collateralInspections;
	}

	public void setCollateralInspections(Set<CollateralInspection> collateralInspections) {
		this.collateralInspections = collateralInspections;
	}

	public Set<CollateralArrestFree> getCollateralArrestFrees() {
		return collateralArrestFrees;
	}

	public void setCollateralArrestFrees(Set<CollateralArrestFree> collateralArrestFrees) {
		this.collateralArrestFrees = collateralArrestFrees;
	}
	*/

	public Set<CollateralItem> getCollateralItems() {
		return collateralItems;
	}

	public void setCollateralItems(Set<CollateralItem> collateralItems) {
		this.collateralItems = collateralItems;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
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
		final CollateralAgreement other = (CollateralAgreement) obj;
		if (!Objects.equals(this.getId(), other.getId())) {
			return false;
		}
		return true;
	}
}
