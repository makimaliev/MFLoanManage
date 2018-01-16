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
@Table(name="paymentSchedule")
public class PaymentSchedule extends GenericModel{

	@DateTimeFormat(pattern = "yyyy-MM-dd")
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
	
	@ManyToOne(targetEntity=InstallmentState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="installment_state_id")
	private InstallmentState installmentState;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
    @JoinColumn(name="loanId")
    Loan loan;

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
