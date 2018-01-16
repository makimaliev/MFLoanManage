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
import kg.gov.mf.loan.manage.model.orderterm.OrderTermDaysMethod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermRatePeriod;
import kg.gov.mf.loan.manage.model.orderterm.OrderTermTransactionOrder;

@Entity
@Table(name="creditTerm")
public class CreditTerm extends GenericModel{
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="start_date", nullable=false)
	private Date startDate;
	
	@Column(name = "interest_rate_value", precision = 12, scale = 5)
	private Double interestRateValue;
	
	@ManyToOne(targetEntity=OrderTermRatePeriod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="rate_period_id")
	private OrderTermRatePeriod ratePeriod;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="floating_rate_type_id")
	private OrderTermFloatingRateType floatingRateType;
	
	@Column(name = "penalty_on_principle_overdue_rate_value", precision = 12, scale = 5)
	private Double penaltyOnPrincipleOverdueRateValue;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penalty_on_principle_overdue_rate_type_id")
	private OrderTermFloatingRateType penaltyOnPrincipleOverdueRateType;
	
	@Column(name = "penalty_on_interest_overdue_rate_value", precision = 12, scale = 5)
	private Double penaltyOnInterestOverdueRateValue;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penalty_on_interest_overdue_rate_type_id")
	private OrderTermFloatingRateType penaltyOnInterestOverdueRateType;
	
	@Column(name = "penalty_limit_percent", precision = 12, scale = 5)
	private Double penaltyLimitPercent;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="penalty_limit_end_date", nullable=false)
	private Date penaltyLimitEndDate;
	
	@ManyToOne(targetEntity=OrderTermTransactionOrder.class, fetch = FetchType.EAGER)
	@JoinColumn(name="transaction_order_id")
	private OrderTermTransactionOrder transactionOrder;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="days_in_month_method_id")
	private OrderTermDaysMethod daysInMonthMethod;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="days_in_year_method_id")
	private OrderTermDaysMethod daysInYearMethod;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
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
