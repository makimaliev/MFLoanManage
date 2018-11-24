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

import kg.gov.mf.loan.manage.model.collateral.QuantityType;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;

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
	
	@Column(precision = 12, scale = 5)
	private Double totalCost;
	
	private long transferPaymentId;
	
	private long transferCreditId;
	
	private long transferPersonId;

	@ManyToOne(targetEntity=QuantityType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="unitTypeId")
	private QuantityType quantityType;

	@ManyToOne(targetEntity=GoodType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="goodsTypeId")
	GoodType goodType;


	
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
