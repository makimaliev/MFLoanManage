package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="collateral_agreement")
public class CollateralAgreement {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="agreement_number", nullable=false, length=50)
	private String agreementNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="agreement_date", nullable=false)
	private Date agreementDate;
	
	@Column(name="collateral_office_reg_number", nullable=false, length=50)
	private String collateralOfficeRegNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="collateral_office_reg_date", nullable=false)
	private Date collateralOfficeRegDate;
	
	@Column(name="notary_office_reg_number", nullable=false, length=50)
	private String notaryOfficeRegNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="notary_office_reg_date", nullable=false)
	private Date notaryOfficeRegDate;
	
	@Column(name="arrest_reg_number", nullable=false, length=50)
	private String arrestRegNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="arrest_reg_date", nullable=false)
	private Date arrestRegDate;
	
	@ManyToOne
	private Collateral collateral;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralAgreement_id")
	private Set<CollateralInspection> collateralInspection;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralAgreement_id")
	private Set<CollateralArrestFree> collateralArrestFree;
	
	public CollateralAgreement()
	{
		
	}
	
	public CollateralAgreement(String agreementNumber, Date agreementDate, String collateralOfficeRegNumber,
			Date collateralOfficeRegDate, String notaryOfficeRegNumber, Date notaryOfficeRegDate,
			String arrestRegNumber, Date arrestRegDate) {
		this.agreementNumber = agreementNumber;
		this.agreementDate = agreementDate;
		this.collateralOfficeRegNumber = collateralOfficeRegNumber;
		this.collateralOfficeRegDate = collateralOfficeRegDate;
		this.notaryOfficeRegNumber = notaryOfficeRegNumber;
		this.notaryOfficeRegDate = notaryOfficeRegDate;
		this.arrestRegNumber = arrestRegNumber;
		this.arrestRegDate = arrestRegDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Collateral getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral collateral) {
		this.collateral = collateral;
	}
	
	public Set<CollateralInspection> getCollateralInspection() {
		return collateralInspection;
	}

	public void setCollateralInspection(Set<CollateralInspection> collateralInspection) {
		this.collateralInspection = collateralInspection;
	}

	public Set<CollateralArrestFree> getCollateralArrestFree() {
		return collateralArrestFree;
	}

	public void setCollateralArrestFree(Set<CollateralArrestFree> collateralArrestFree) {
		this.collateralArrestFree = collateralArrestFree;
	}

	@Override
	public String toString() {
		return "CollateralAgreement [id=" + id + ", agreementNumber=" + agreementNumber + ", agreementDate="
				+ agreementDate + ", collateralOfficeRegNumber=" + collateralOfficeRegNumber
				+ ", collateralOfficeRegDate=" + collateralOfficeRegDate + ", notaryOfficeRegNumber="
				+ notaryOfficeRegNumber + ", notaryOfficeRegDate=" + notaryOfficeRegDate + ", arrestRegNumber="
				+ arrestRegNumber + ", arrestRegDate=" + arrestRegDate + "]";
	}
}
