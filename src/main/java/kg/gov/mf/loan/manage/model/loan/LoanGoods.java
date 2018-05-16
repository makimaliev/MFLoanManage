package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loanGoods")
public class LoanGoods extends BaseModel {
	
	@Column(precision = 12, scale = 5)
	private Double quantity;
	
	private long unitTypeId;
	
	private long goodsTypeId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanId", nullable = false)
    Loan loan;

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public long getUnitTypeId() {
		return unitTypeId;
	}

	public void setUnitTypeId(long unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
