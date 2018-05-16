package kg.gov.mf.loan.manage.model.loan;

import java.util.Date;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

@Entity
@Table(name="creditTerm")
public class CreditTerm extends BaseModel {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date startDate;
	
	@Column(precision = 12, scale = 5)
	private Double interestRateValue;

	@Enumerated(EnumType.STRING)
	private OrderTermRatePeriod ratePeriod;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "floatingRateTypeId", nullable = false)
	private OrderTermFloatingRateType floatingRateType;
	
	@Column(precision = 12, scale = 5)
	private Double penaltyOnPrincipleOverdueRateValue;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "penaltyOnPrincipleOverdueRateTypeId", nullable = false)
	private OrderTermFloatingRateType penaltyOnPrincipleOverdueRateType;
	
	@Column(name = "penaltyOnInterestOverdueRateValue", precision = 12, scale = 5)
	private Double penaltyOnInterestOverdueRateValue;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "penaltyOnInterestOverdueRateTypeId", nullable = false)
	private OrderTermFloatingRateType penaltyOnInterestOverdueRateType;
	
	@Column(precision = 12, scale = 5)
	private Double penaltyLimitPercent;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date penaltyLimitEndDate;

	@Enumerated(EnumType.STRING)
	private OrderTermTransactionOrder transactionOrder;

	@Enumerated(EnumType.STRING)
	private OrderTermDaysMethod daysInMonthMethod;

	@Enumerated(EnumType.STRING)
	private OrderTermDaysMethod daysInYearMethod;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanId", nullable = false)
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
