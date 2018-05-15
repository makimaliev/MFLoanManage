package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collateralAgreement")
public class CollateralAgreement extends BaseModel {
	
	@Column(nullable=true, length=150)
	private String agreementNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date agreementDate;
	
	@Column(nullable=true, length=150)
	private String collateralOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date collateralOfficeRegDate;
	
	@Column(nullable=true, length=150)
	private String notaryOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column( nullable=true)
	private Date notaryOfficeRegDate;
	
	@Column(nullable=true, length=150)
	private String arrestRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date arrestRegDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ownerId", nullable = false)
    Owner owner;

	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			},
			mappedBy = "collateralAgreements")
	private Set<Loan> loans = new HashSet<>();

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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
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
