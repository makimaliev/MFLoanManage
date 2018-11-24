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
import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

@Entity
@Table(name="creditTerm")
public class CreditTerm extends GenericModel{
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date startDate;
	
	@Column(precision = 12, scale = 5)
	private Double interestRateValue;
	
	@ManyToOne(targetEntity=OrderTermRatePeriod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="ratePeriodId")
	private OrderTermRatePeriod ratePeriod;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="floatingRateTypeId")
	private OrderTermFloatingRateType floatingRateType;
	
	@Column(precision = 12, scale = 5)
	private Double penaltyOnPrincipleOverdueRateValue;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penaltyOnPrincipleOverdueRateTypeId")
	private OrderTermFloatingRateType penaltyOnPrincipleOverdueRateType;
	
	@Column(name = "penaltyOnInterestOverdueRateValue", precision = 12, scale = 5)
	private Double penaltyOnInterestOverdueRateValue;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penaltyOnInterestOverdueRateTypeId")
	private OrderTermFloatingRateType penaltyOnInterestOverdueRateType;
	
	@Column(precision = 12, scale = 5)
	private Double penaltyLimitPercent;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date penaltyLimitEndDate;
	
	@ManyToOne(targetEntity=OrderTermTransactionOrder.class, fetch = FetchType.EAGER)
	@JoinColumn(name="transactionOrderId")
	private OrderTermTransactionOrder transactionOrder;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="daysInMonthMethodId")
	private OrderTermDaysMethod daysInMonthMethod;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="daysInYearMethodId")
	private OrderTermDaysMethod daysInYearMethod;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Double getInterestRateValue() {
		return interestRateValue;
	}

	public void setInterestRateValue(Double interestRateValue) {
		this.interestRateValue = interestRateValue;
	}

	public OrderTermRatePeriod getRatePeriod() {
		return ratePeriod;
	}

	public void setRatePeriod(OrderTermRatePeriod ratePeriod) {
		this.ratePeriod = ratePeriod;
	}

	public OrderTermFloatingRateType getFloatingRateType() {
		return floatingRateType;
	}

	public void setFloatingRateType(OrderTermFloatingRateType floatingRateType) {
		this.floatingRateType = floatingRateType;
	}

	public Double getPenaltyOnPrincipleOverdueRateValue() {
		return penaltyOnPrincipleOverdueRateValue;
	}

	public void setPenaltyOnPrincipleOverdueRateValue(Double penaltyOnPrincipleOverdueRateValue) {
		this.penaltyOnPrincipleOverdueRateValue = penaltyOnPrincipleOverdueRateValue;
	}

	public OrderTermFloatingRateType getPenaltyOnPrincipleOverdueRateType() {
		return penaltyOnPrincipleOverdueRateType;
	}

	public void setPenaltyOnPrincipleOverdueRateType(OrderTermFloatingRateType penaltyOnPrincipleOverdueRateType) {
		this.penaltyOnPrincipleOverdueRateType = penaltyOnPrincipleOverdueRateType;
	}

	public Double getPenaltyOnInterestOverdueRateValue() {
		return penaltyOnInterestOverdueRateValue;
	}

	public void setPenaltyOnInterestOverdueRateValue(Double penaltyOnInterestOverdueRateValue) {
		this.penaltyOnInterestOverdueRateValue = penaltyOnInterestOverdueRateValue;
	}

	public OrderTermFloatingRateType getPenaltyOnInterestOverdueRateType() {
		return penaltyOnInterestOverdueRateType;
	}

	public void setPenaltyOnInterestOverdueRateType(OrderTermFloatingRateType penaltyOnInterestOverdueRateType) {
		this.penaltyOnInterestOverdueRateType = penaltyOnInterestOverdueRateType;
	}

	public Double getPenaltyLimitPercent() {
		return penaltyLimitPercent;
	}

	public void setPenaltyLimitPercent(Double penaltyLimitPercent) {
		this.penaltyLimitPercent = penaltyLimitPercent;
	}

	public Date getPenaltyLimitEndDate() {
		return penaltyLimitEndDate;
	}

	public void setPenaltyLimitEndDate(Date penaltyLimitEndDate) {
		this.penaltyLimitEndDate = penaltyLimitEndDate;
	}

	public OrderTermTransactionOrder getTransactionOrder() {
		return transactionOrder;
	}

	public void setTransactionOrder(OrderTermTransactionOrder transactionOrder) {
		this.transactionOrder = transactionOrder;
	}

	public OrderTermDaysMethod getDaysInMonthMethod() {
		return daysInMonthMethod;
	}

	public void setDaysInMonthMethod(OrderTermDaysMethod daysInMonthMethod) {
		this.daysInMonthMethod = daysInMonthMethod;
	}

	public OrderTermDaysMethod getDaysInYearMethod() {
		return daysInYearMethod;
	}

	public void setDaysInYearMethod(OrderTermDaysMethod daysInYearMethod) {
		this.daysInYearMethod = daysInYearMethod;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
