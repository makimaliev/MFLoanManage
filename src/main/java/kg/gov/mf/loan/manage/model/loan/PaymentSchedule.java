package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.task.model.GenericModel;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="paymentSchedule")
@Audited
public class PaymentSchedule extends GenericModel{

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date expectedDate;
	
	@Column(precision = 12, scale = 5)
	private Double disbursement;
	
	@Column(precision = 12, scale = 5)
	private Double principalPayment;
	
	@Column(precision = 12, scale = 5)
	private Double interestPayment;
	
	@Column(precision = 12, scale = 5)
	private Double collectedInterestPayment;
	
	@Column(precision = 12, scale = 5)
	private Double collectedPenaltyPayment;
	
	@ManyToOne(targetEntity=InstallmentState.class, fetch = FetchType.LAZY)
	@JoinColumn(name="installmentStateId")
	@Audited( targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
	private InstallmentState installmentState;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
	@Audited( targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
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
