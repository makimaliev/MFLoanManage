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

import kg.gov.mf.loan.task.model.GenericModel;

@Entity
@Table(name="payment")
public class Payment extends GenericModel{
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date paymentDate;
		
	@Column(precision = 12, scale = 5)
	private Double totalAmount;
	
	@Column(precision = 12, scale = 5)
	private Double principal;
	
	@Column(precision = 12, scale = 5)
	private Double interest;
	
	@Column(precision = 12, scale = 5)
	private Double penalty;
	
	@Column(precision = 12, scale = 5)
	private Double fee;

	@Column(precision = 12, scale = 5)
	private Double exchange_rate;

	
	@Column(nullable=false, length=100)
	private String number;

	@Column(name="in_loan_currency")
	private boolean in_loan_currency;

	@Column(nullable=true, length=100)
	private String details;

	@ManyToOne(targetEntity=PaymentType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="paymentTypeId")
	private PaymentType paymentType;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getPenalty() {
		return penalty;
	}

	public void setPenalty(Double penalty) {
		this.penalty = penalty;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Double getExchange_rate() {
		return exchange_rate;
	}

	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public boolean isIn_loan_currency() {
		return in_loan_currency;
	}

	public void setIn_loan_currency(boolean in_loan_currency) {
		this.in_loan_currency = in_loan_currency;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
