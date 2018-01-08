package kg.gov.mf.loan.manage.model.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="phase_details")
public class PhaseDetails {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name = "start_total_amount", precision = 12, scale = 5)
	private Double startTotalAmount;
	
	@Column(name = "start_principal", precision = 12, scale = 5)
	private Double startPrincipal;
	
	@Column(name = "start_interest", precision = 12, scale = 5)
	private Double startInterest;
	
	@Column(name = "start_penalty", precision = 12, scale = 5)
	private Double startPenalty;
	
	@Column(name = "start_fee", precision = 12, scale = 5)
	private Double startFee;
	
	@Column(name = "close_total_amount", precision = 12, scale = 5)
	private Double closeTotalAmount;
	
	@Column(name = "close_principal", precision = 12, scale = 5)
	private Double closePrincipal;
	
	@Column(name = "close_interest", precision = 12, scale = 5)
	private Double closeInterest;
	
	@Column(name = "close_penalty", precision = 12, scale = 5)
	private Double closePenalty;
	
	@Column(name = "close_fee", precision = 12, scale = 5)
	private Double closeFee;
	
	@Column(name = "paid_total_amount", precision = 12, scale = 5)
	private Double paidTotalAmount;
	
	@Column(name = "paid_principal", precision = 12, scale = 5)
	private Double paidPrincipal;
	
	@Column(name = "paid_interest", precision = 12, scale = 5)
	private Double paidInterest;
	
	@Column(name = "paid_penalty", precision = 12, scale = 5)
	private Double paidPenalty;
	
	@Column(name = "paid_fee", precision = 12, scale = 5)
	private Double paidFee;
	
	@ManyToOne
	private Loan loan;

	public PhaseDetails()
	{
		
	}
	
	public PhaseDetails(Double startTotalAmount, Double startPrincipal, Double startInterest, Double startPenalty,
			Double startFee, Double closeTotalAmount, Double closePrincipal, Double closeInterest, Double closePenalty,
			Double closeFee, Double paidTotalAmount, Double paidPrincipal, Double paidInterest, Double paidPenalty,
			Double paidFee) {
		this.startTotalAmount = startTotalAmount;
		this.startPrincipal = startPrincipal;
		this.startInterest = startInterest;
		this.startPenalty = startPenalty;
		this.startFee = startFee;
		this.closeTotalAmount = closeTotalAmount;
		this.closePrincipal = closePrincipal;
		this.closeInterest = closeInterest;
		this.closePenalty = closePenalty;
		this.closeFee = closeFee;
		this.paidTotalAmount = paidTotalAmount;
		this.paidPrincipal = paidPrincipal;
		this.paidInterest = paidInterest;
		this.paidPenalty = paidPenalty;
		this.paidFee = paidFee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getStartTotalAmount() {
		return startTotalAmount;
	}

	public void setStartTotalAmount(Double startTotalAmount) {
		this.startTotalAmount = startTotalAmount;
	}

	public Double getStartPrincipal() {
		return startPrincipal;
	}

	public void setStartPrincipal(Double startPrincipal) {
		this.startPrincipal = startPrincipal;
	}

	public Double getStartInterest() {
		return startInterest;
	}

	public void setStartInterest(Double startInterest) {
		this.startInterest = startInterest;
	}

	public Double getStartPenalty() {
		return startPenalty;
	}

	public void setStartPenalty(Double startPenalty) {
		this.startPenalty = startPenalty;
	}

	public Double getStartFee() {
		return startFee;
	}

	public void setStartFee(Double startFee) {
		this.startFee = startFee;
	}

	public Double getCloseTotalAmount() {
		return closeTotalAmount;
	}

	public void setCloseTotalAmount(Double closeTotalAmount) {
		this.closeTotalAmount = closeTotalAmount;
	}

	public Double getClosePrincipal() {
		return closePrincipal;
	}

	public void setClosePrincipal(Double closePrincipal) {
		this.closePrincipal = closePrincipal;
	}

	public Double getCloseInterest() {
		return closeInterest;
	}

	public void setCloseInterest(Double closeInterest) {
		this.closeInterest = closeInterest;
	}

	public Double getClosePenalty() {
		return closePenalty;
	}

	public void setClosePenalty(Double closePenalty) {
		this.closePenalty = closePenalty;
	}

	public Double getCloseFee() {
		return closeFee;
	}

	public void setCloseFee(Double closeFee) {
		this.closeFee = closeFee;
	}

	public Double getPaidTotalAmount() {
		return paidTotalAmount;
	}

	public void setPaidTotalAmount(Double paidTotalAmount) {
		this.paidTotalAmount = paidTotalAmount;
	}

	public Double getPaidPrincipal() {
		return paidPrincipal;
	}

	public void setPaidPrincipal(Double paidPrincipal) {
		this.paidPrincipal = paidPrincipal;
	}

	public Double getPaidInterest() {
		return paidInterest;
	}

	public void setPaidInterest(Double paidInterest) {
		this.paidInterest = paidInterest;
	}

	public Double getPaidPenalty() {
		return paidPenalty;
	}

	public void setPaidPenalty(Double paidPenalty) {
		this.paidPenalty = paidPenalty;
	}

	public Double getPaidFee() {
		return paidFee;
	}

	public void setPaidFee(Double paidFee) {
		this.paidFee = paidFee;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
