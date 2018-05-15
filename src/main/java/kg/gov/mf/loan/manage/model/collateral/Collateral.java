package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collateral")
public class Collateral extends BaseModel {

	@Column(nullable=false, length=50)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanId", nullable = false)
    Loan loan;
	
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
}
