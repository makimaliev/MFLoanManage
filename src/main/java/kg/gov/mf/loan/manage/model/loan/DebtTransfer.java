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

	@Column(nullable=false, length=50)
	private String number;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date date;
	
	@Column(precision = 12, scale = 5)
	private Double quantity;
	
	@Column(precision = 12, scale = 5)
	private Double pricePerUnit;
	
	private long unitTypeId;
	
	@Column(precision = 12, scale = 5)
	private Double totalCost;
	
	private long transferPaymentId;
	
	private long transferCreditId;
	
	private long transferPersonId;
	
	private long goodsTypeId;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
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
