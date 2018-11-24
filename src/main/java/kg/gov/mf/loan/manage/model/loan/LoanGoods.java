package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.collateral.QuantityType;

@Entity
@Table(name="loanGoods")
public class LoanGoods extends GenericModel{
	
	@Column(precision = 12, scale = 5)
	private Double quantity;
	
	@ManyToOne(targetEntity=QuantityType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="unitTypeId")
	private QuantityType quantityType;
	
	@ManyToOne(targetEntity=GoodType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="goodsTypeId")
	GoodType goodType;

	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public QuantityType getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(QuantityType quantityType) {
		this.quantityType = quantityType;
	}

	public GoodType getGoodType() {
		return goodType;
	}

	public void setGoodType(GoodType goodType) {
		this.goodType = goodType;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
