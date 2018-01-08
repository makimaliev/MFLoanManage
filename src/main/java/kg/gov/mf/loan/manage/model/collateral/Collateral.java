package kg.gov.mf.loan.manage.model.collateral;

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

import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collateral")
public class Collateral {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=50)
	private String name;
	
	@ManyToOne
	private Loan loan;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateral_id")
	private Set<CollateralAgreement> agreement;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateral_id")
	private Set<CollateralSummary> collateralSummary;
	
	public Collateral()
	{
		
	}
	
	public Collateral(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Set<CollateralAgreement> getAgreement() {
		return agreement;
	}

	public void setAgreement(Set<CollateralAgreement> agreement) {
		this.agreement = agreement;
	}

	public Set<CollateralSummary> getCollateralSummary() {
		return collateralSummary;
	}

	public void setCollateralSummary(Set<CollateralSummary> collateralSummary) {
		this.collateralSummary = collateralSummary;
	}
	
}
