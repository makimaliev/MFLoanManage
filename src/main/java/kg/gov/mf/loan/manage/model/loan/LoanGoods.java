package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan_goods")
public class LoanGoods {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name = "quantity", precision = 12, scale = 5)
	private Double quantity;
	
	@Column(name="unit_type_id")
	private long unitTypeId;
	
	@Column(name="goods_type_id")
	private long goodsTypeId;
	
	@ManyToOne
	private Loan loan;
	
	public LoanGoods()
	{
		
	}
	
	public LoanGoods(Double quantity, long unitTypeId, long goodsTypeId) {
		this.quantity = quantity;
		this.unitTypeId = unitTypeId;
		this.goodsTypeId = goodsTypeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
