package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="payment_date", nullable=false)
	private Date paymentDate;
		
	@Column(name = "total_amount", precision = 12, scale = 5)
	private Double totalAmount;
	
	@Column(name = "principal", precision = 12, scale = 5)
	private Double principal;
	
	@Column(name = "interest", precision = 12, scale = 5)
	private Double interest;
	
	@Column(name = "penalty", precision = 12, scale = 5)
	private Double penalty;
	
	@Column(name = "fee", precision = 12, scale = 5)
	private Double fee;
	
	@Column(name="number", nullable=false, length=30)
	private String number;
	
	@OneToOne
	@JoinColumn(name="payment_type_id")
	private PaymentType paymentType;
	
	@ManyToOne
	private Loan loan;
	
	public Payment()
	{
		
	}

	public Payment(Date paymentDate, Double totalAmount, Double principal, Double interest, Double penalty, Double fee,
			String number, PaymentType paymentType) {
		this.paymentDate = paymentDate;
		this.totalAmount = totalAmount;
		this.principal = principal;
		this.interest = interest;
		this.penalty = penalty;
		this.fee = fee;
		this.number = number;
		this.paymentType = paymentType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
	
}
