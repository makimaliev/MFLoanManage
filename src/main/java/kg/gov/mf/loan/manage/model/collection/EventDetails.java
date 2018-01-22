package kg.gov.mf.loan.manage.model.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="eventDetails")
public class EventDetails extends GenericModel{

	@Column(precision = 12, scale = 5)
	private Double startTotalAmount;
	
	@Column(precision = 12, scale = 5)
	private Double startPrincipal;
	
	@Column(precision = 12, scale = 5)
	private Double startInterest;
	
	@Column(precision = 12, scale = 5)
	private Double startPenalty;
	
	@Column(precision = 12, scale = 5)
	private Double startFee;
	
	@Column(precision = 12, scale = 5)
	private Double closeTotalAmount;
	
	@Column(precision = 12, scale = 5)
	private Double closePrincipal;
	
	@Column(precision = 12, scale = 5)
	private Double closeInterest;
	
	@Column(precision = 12, scale = 5)
	private Double closePenalty;
	
	@Column(precision = 12, scale = 5)
	private Double closeFee;
	
	@Column(precision = 12, scale = 5)
	private Double paidTotalAmount;
	
	@Column(precision = 12, scale = 5)
	private Double paidPrincipal;
	
	@Column(precision = 12, scale = 5)
	private Double paidInterest;
	
	@Column(precision = 12, scale = 5)
	private Double paidPenalty;
	
	@Column(precision = 12, scale = 5)
	private Double paidFee;
	
	@OneToOne(targetEntity=CollectionEvent.class, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	CollectionEvent collectionEvent;

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

	public CollectionEvent getCollectionEvent() {
		return collectionEvent;
	}

	public void setCollectionEvent(CollectionEvent collectionEvent) {
		this.collectionEvent = collectionEvent;
	}
}
