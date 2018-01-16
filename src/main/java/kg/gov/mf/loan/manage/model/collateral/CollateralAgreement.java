package kg.gov.mf.loan.manage.model.collateral;

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

@Entity
@Table(name="collateralAgreement")
public class CollateralAgreement extends GenericModel{
	
	@Column(name="agreement_number", nullable=false, length=50)
	private String agreementNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="agreement_date", nullable=false)
	private Date agreementDate;
	
	@Column(name="collateral_office_reg_number", nullable=false, length=50)
	private String collateralOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="collateral_office_reg_date", nullable=false)
	private Date collateralOfficeRegDate;
	
	@Column(name="notary_office_reg_number", nullable=false, length=50)
	private String notaryOfficeRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="notary_office_reg_date", nullable=false)
	private Date notaryOfficeRegDate;
	
	@Column(name="arrest_reg_number", nullable=false, length=50)
	private String arrestRegNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="arrest_reg_date", nullable=false)
	private Date arrestRegDate;
	
	@ManyToOne(targetEntity=Collateral.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralId")
	Collateral collateral;
	
	@OneToMany(mappedBy = "collateralAgreement", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralInspection> collateralInspections = new HashSet<CollateralInspection>();
	
	@OneToMany(mappedBy = "collateralAgreement", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralArrestFree> collateralArrestFrees = new HashSet<CollateralArrestFree>();

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
}
