package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="loanGoods")
public class LoanGoods extends GenericModel{
	
	@Column(name = "quantity", precision = 12, scale = 5)
	private Double quantity;
	
	@Column(name="unit_type_id")
	private long unitTypeId;
	
	@Column(name="goods_type_id")
	private long goodsTypeId;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
    @JoinColumn(name="loanId")
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
