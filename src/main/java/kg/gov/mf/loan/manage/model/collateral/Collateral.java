package kg.gov.mf.loan.manage.model.collateral;

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

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collateral")
public class Collateral extends GenericModel{

	@Column(nullable=false, length=50)
	private String name;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;
	
	@OneToMany(mappedBy = "collateral", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralSummary> collateralSummaries = new HashSet<CollateralSummary>();

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

	public Set<CollateralSummary> getCollateralSummaries() {
		return collateralSummaries;
	}

	public void setCollateralSummaries(Set<CollateralSummary> collateralSummaries) {
		this.collateralSummaries = collateralSummaries;
	}
}
