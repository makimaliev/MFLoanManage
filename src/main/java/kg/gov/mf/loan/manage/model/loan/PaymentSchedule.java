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
@Table(name="payment_schedule")
public class PaymentSchedule {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expected_date", nullable=false)
	private Date expectedDate;
	
	@Column(name = "disbursement", precision = 12, scale = 5)
	private Double disbursement;
	
	@Column(name = "principal_payment", precision = 12, scale = 5)
	private Double principalPayment;
	
	@Column(name = "interest_payment", precision = 12, scale = 5)
	private Double interestPayment;
	
	@Column(name = "collected_interest_payment", precision = 12, scale = 5)
	private Double collectedInterestPayment;
	
	@Column(name = "collected_penalty_payment", precision = 12, scale = 5)
	private Double collectedPenaltyPayment;
	
	@OneToOne
	@JoinColumn(name="installment_state_id")
	private InstallmentState installmentState;
	
	@ManyToOne
	private Loan loan;
	
	public PaymentSchedule()
	{
		
	}

	public PaymentSchedule(Date expectedDate, Double disbursement, Double principalPayment, Double interestPayment,
			Double collectedInterestPayment, Double collectedPenaltyPayment, InstallmentState installmentState) {
		this.expectedDate = expectedDate;
		this.disbursement = disbursement;
		this.principalPayment = principalPayment;
		this.interestPayment = interestPayment;
		this.collectedInterestPayment = collectedInterestPayment;
		this.collectedPenaltyPayment = collectedPenaltyPayment;
		this.installmentState = installmentState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	public Double getDisbursement() {
		return disbursement;
	}

	public void setDisbursement(Double disbursement) {
		this.disbursement = disbursement;
	}

	public Double getPrincipalPayment() {
		return principalPayment;
	}

	public void setPrincipalPayment(Double principalPayment) {
		this.principalPayment = principalPayment;
	}

	public Double getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(Double interestPayment) {
		this.interestPayment = interestPayment;
	}

	public Double getCollectedInterestPayment() {
		return collectedInterestPayment;
	}

	public void setCollectedInterestPayment(Double collectedInterestPayment) {
		this.collectedInterestPayment = collectedInterestPayment;
	}

	public Double getCollectedPenaltyPayment() {
		return collectedPenaltyPayment;
	}

	public void setCollectedPenaltyPayment(Double collectedPenaltyPayment) {
		this.collectedPenaltyPayment = collectedPenaltyPayment;
	}

	public InstallmentState getInstallmentState() {
		return installmentState;
	}

	public void setInstallmentState(InstallmentState installmentState) {
		this.installmentState = installmentState;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
}
