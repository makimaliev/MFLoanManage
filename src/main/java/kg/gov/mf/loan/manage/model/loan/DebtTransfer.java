package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="debtTransfer")
public class DebtTransfer extends GenericModel{

	@Column(name="number", nullable=false, length=50)
	private String number;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="date", nullable=false)
	private Date date;
	
	@Column(name = "quantity", precision = 12, scale = 5)
	private Double quantity;
	
	@Column(name = "price_per_unit", precision = 12, scale = 5)
	private Double pricePerUnit;
	
	@Column(name="unit_type_id")
	private long unitTypeId;
	
	@Column(name = "total_cost", precision = 12, scale = 5)
	private Double totalCost;
	
	@Column(name="transfer_payment_id")
	private long transferPaymentId;
	
	@Column(name="transfer_credit_id")
	private long transferCreditId;
	
	@Column(name="transfer_person_id")
	private long transferPersonId;
	
	@Column(name="goods_type_id")
	private long goodsTypeId;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
    @JoinColumn(name="loanId")
    Loan loan;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public long getUnitTypeId() {
		return unitTypeId;
	}

	public void setUnitTypeId(long unitTypeId) {
		this.unitTypeId = unitTypeId;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public long getTransferPaymentId() {
		return transferPaymentId;
	}

	public void setTransferPaymentId(long transferPaymentId) {
		this.transferPaymentId = transferPaymentId;
	}

	public long getTransferCreditId() {
		return transferCreditId;
	}

	public void setTransferCreditId(long transferCreditId) {
		this.transferCreditId = transferCreditId;
	}

	public long getTransferPersonId() {
		return transferPersonId;
	}

	public void setTransferPersonId(long transferPersonId) {
		this.transferPersonId = transferPersonId;
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
