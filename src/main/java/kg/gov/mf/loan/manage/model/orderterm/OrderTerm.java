package kg.gov.mf.loan.manage.model.orderterm;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="order_term")
public class OrderTerm {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@ManyToOne
	private CreditOrder creditOrder;
	
	@Column(name="description")
	private String description;
	
	@OneToOne
	@JoinColumn(name="fund_id")
	private OrderTermFund fund;
	
	@Column(name = "amount")
	private Double amount;
	
	@OneToOne
	@JoinColumn(name="currency_id")
	private OrderTermCurrency currency;
	
	@Column(name="frequency_quantity")
	private int frequencyQuantity;
	
	@OneToOne
	@JoinColumn(name="frequency_type_id")
	private OrderTermFrequencyType frequencyType;
	
	@Column(name="installment_quantity")
	private int installmentQuantity;
	
	@Column(name="installment_first_day")
	private int installmentFirstDay;
	
	@Temporal(TemporalType.DATE)
	@Column(name="first_installment_date", nullable=false)
	private Date firstInstallmentDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="last_installment_date", nullable=false)
	private Date lastInstallmentDate;
	
	@Column(name="min_days_disb_first_inst")
	private int minDaysDisbFirstInst;
	
	@Column(name="max_days_disb_first_inst")
	private int maxDaysDisbFirstInst;

	@Column(name="grace_on_principle_payment_inst")
	private int graceOnPrinciplePaymentInst;
	
	@Column(name="grace_on_principle_payment_days")
	private int graceOnPrinciplePaymentDays;
	
	@Column(name="grace_on_interest_payment_inst")
	private int graceOnInterestPaymentInst;
	
	@Column(name="grace_on_interest_payment_days")
	private int graceOnInterestPaymentDays;
	
	@Column(name="grace_on_interest_accr_inst")
	private int graceOnInterestAccrInst;
	
	@Column(name="grace_on_interest_accr_days")
	private int graceOnInterestAccrDays;
	
	@Column(name="interest_rate_value")
	private Double interestRateValue;
	
	@OneToOne
	@JoinColumn(name="interest_rate_value_per_period_id")
	private OrderTermRatePeriod interestRateValuePerPeriod;
	
	@OneToOne
	@JoinColumn(name="interest_type_id")
	private OrderTermFloatingRateType interestType;
	
	@Column(name="penalty_on_principle_overdue_rate_value")
	private Double penaltyOnPrincipleOverdueRateValue;
	
	@OneToOne
	@JoinColumn(name="penalty_on_principle_overdue_type_id")
	private OrderTermFloatingRateType penaltyOnPrincipleOverdueType;
	
	@Column(name="penalty_on_interest_overdue_rate_value")
	private Double penaltyOnInterestOverdueRateValue;
	
	@OneToOne
	@JoinColumn(name="penalty_on_interest_overdue_type_id")
	private OrderTermFloatingRateType penaltyOnInterestOverdueType;
	
	@OneToOne
	@JoinColumn(name="days_in_year_method_id")
	private OrderTermDaysMethod daysInYearMethod;
	
	@OneToOne
	@JoinColumn(name="days_in_month_method_id")
	private OrderTermDaysMethod daysInMonthMethod;
	
	@OneToOne
	@JoinColumn(name="transaction_order_id")
	private OrderTermTransactionOrder transactionOrder;
	
	@OneToOne
	@JoinColumn(name="interest_accr_method_id")
	private OrderTermAccrMethod interestAccrMethod;
	
	@Column(name="early_repayment_allowed")
	private boolean earlyRepaymentAllowed;
	
	@Column(name="penalty_percent_limit")
	private Double penaltyLimitPercent;
	
	@Column(name="collateral_free")
	private boolean collateralFree;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="orderTerm_id")
	private Set<AgreementTemplate> agreementTemplate;
	
	public OrderTerm()
	{
		
	}

	public OrderTerm(String description, OrderTermFund fund, Double amount,
			OrderTermCurrency currency, int frequencyQuantity, OrderTermFrequencyType frequencyType,
			int installmentQuantity, int installmentFirstDay, Date firstInstallmentDate, Date lastInstallmentDate,
			int minDaysDisbFirstInst, int maxDaysDisbFirstInst, int graceOnPrinciplePaymentInst,
			int graceOnPrinciplePaymentDays, int graceOnInterestPaymentInst, int graceOnInterestPaymentDays,
			int graceOnInterestAccrInst, int graceOnInterestAccrDays, Double interestRateValue,
			OrderTermRatePeriod interestRateValuePerPeriod, OrderTermFloatingRateType interestType,
			Double penaltyOnPrincipleOverdueRateValue, OrderTermFloatingRateType penaltyOnPrincipleOverdueType,
			Double penaltyOnInterestOverdueRateValue, OrderTermFloatingRateType penaltyOnInterestOverdueType,
			OrderTermDaysMethod daysInYearMethod, OrderTermDaysMethod daysInMonthMethod,
			OrderTermTransactionOrder transactionOrder, OrderTermAccrMethod interestAccrMethod,
			boolean earlyRepaymentAllowed, Double penaltyLimitPercent, boolean collateralFree) {
		this.description = description;
		this.fund = fund;
		this.amount = amount;
		this.currency = currency;
		this.frequencyQuantity = frequencyQuantity;
		this.frequencyType = frequencyType;
		this.installmentQuantity = installmentQuantity;
		this.installmentFirstDay = installmentFirstDay;
		this.firstInstallmentDate = firstInstallmentDate;
		this.lastInstallmentDate = lastInstallmentDate;
		this.minDaysDisbFirstInst = minDaysDisbFirstInst;
		this.maxDaysDisbFirstInst = maxDaysDisbFirstInst;
		this.graceOnPrinciplePaymentInst = graceOnPrinciplePaymentInst;
		this.graceOnPrinciplePaymentDays = graceOnPrinciplePaymentDays;
		this.graceOnInterestPaymentInst = graceOnInterestPaymentInst;
		this.graceOnInterestPaymentDays = graceOnInterestPaymentDays;
		this.graceOnInterestAccrInst = graceOnInterestAccrInst;
		this.graceOnInterestAccrDays = graceOnInterestAccrDays;
		this.interestRateValue = interestRateValue;
		this.interestRateValuePerPeriod = interestRateValuePerPeriod;
		this.interestType = interestType;
		this.penaltyOnPrincipleOverdueRateValue = penaltyOnPrincipleOverdueRateValue;
		this.penaltyOnPrincipleOverdueType = penaltyOnPrincipleOverdueType;
		this.penaltyOnInterestOverdueRateValue = penaltyOnInterestOverdueRateValue;
		this.penaltyOnInterestOverdueType = penaltyOnInterestOverdueType;
		this.daysInYearMethod = daysInYearMethod;
		this.daysInMonthMethod = daysInMonthMethod;
		this.transactionOrder = transactionOrder;
		this.interestAccrMethod = interestAccrMethod;
		this.earlyRepaymentAllowed = earlyRepaymentAllowed;
		this.penaltyLimitPercent = penaltyLimitPercent;
		this.collateralFree = collateralFree;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CreditOrder getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(CreditOrder creditOrder) {
		this.creditOrder = creditOrder;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OrderTermFund getFund() {
		return fund;
	}

	public void setFund(OrderTermFund fund) {
		this.fund = fund;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public OrderTermCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(OrderTermCurrency currency) {
		this.currency = currency;
	}

	public int getFrequencyQuantity() {
		return frequencyQuantity;
	}

	public void setFrequencyQuantity(int frequencyQuantity) {
		this.frequencyQuantity = frequencyQuantity;
	}

	public OrderTermFrequencyType getFrequencyType() {
		return frequencyType;
	}

	public void setFrequencyType(OrderTermFrequencyType frequencyType) {
		this.frequencyType = frequencyType;
	}

	public int getInstallmentQuantity() {
		return installmentQuantity;
	}

	public void setInstallmentQuantity(int installmentQuantity) {
		this.installmentQuantity = installmentQuantity;
	}

	public int getInstallmentFirstDay() {
		return installmentFirstDay;
	}

	public void setInstallmentFirstDay(int installmentFirstDay) {
		this.installmentFirstDay = installmentFirstDay;
	}

	public Date getFirstInstallmentDate() {
		return firstInstallmentDate;
	}

	public void setFirstInstallmentDate(Date firstInstallmentDate) {
		this.firstInstallmentDate = firstInstallmentDate;
	}

	public Date getLastInstallmentDate() {
		return lastInstallmentDate;
	}

	public void setLastInstallmentDate(Date lastInstallmentDate) {
		this.lastInstallmentDate = lastInstallmentDate;
	}

	public int getMinDaysDisbFirstInst() {
		return minDaysDisbFirstInst;
	}

	public void setMinDaysDisbFirstInst(int minDaysDisbFirstInst) {
		this.minDaysDisbFirstInst = minDaysDisbFirstInst;
	}

	public int getMaxDaysDisbFirstInst() {
		return maxDaysDisbFirstInst;
	}

	public void setMaxDaysDisbFirstInst(int maxDaysDisbFirstInst) {
		this.maxDaysDisbFirstInst = maxDaysDisbFirstInst;
	}

	public int getGraceOnPrinciplePaymentInst() {
		return graceOnPrinciplePaymentInst;
	}

	public void setGraceOnPrinciplePaymentInst(int graceOnPrinciplePaymentInst) {
		this.graceOnPrinciplePaymentInst = graceOnPrinciplePaymentInst;
	}

	public int getGraceOnPrinciplePaymentDays() {
		return graceOnPrinciplePaymentDays;
	}

	public void setGraceOnPrinciplePaymentDays(int graceOnPrinciplePaymentDays) {
		this.graceOnPrinciplePaymentDays = graceOnPrinciplePaymentDays;
	}

	public int getGraceOnInterestPaymentInst() {
		return graceOnInterestPaymentInst;
	}

	public void setGraceOnInterestPaymentInst(int graceOnInterestPaymentInst) {
		this.graceOnInterestPaymentInst = graceOnInterestPaymentInst;
	}

	public int getGraceOnInterestPaymentDays() {
		return graceOnInterestPaymentDays;
	}

	public void setGraceOnInterestPaymentDays(int graceOnInterestPaymentDays) {
		this.graceOnInterestPaymentDays = graceOnInterestPaymentDays;
	}

	public int getGraceOnInterestAccrInst() {
		return graceOnInterestAccrInst;
	}

	public void setGraceOnInterestAccrInst(int graceOnInterestAccrInst) {
		this.graceOnInterestAccrInst = graceOnInterestAccrInst;
	}

	public int getGraceOnInterestAccrDays() {
		return graceOnInterestAccrDays;
	}

	public void setGraceOnInterestAccrDays(int graceOnInterestAccrDays) {
		this.graceOnInterestAccrDays = graceOnInterestAccrDays;
	}

	public Double getInterestRateValue() {
		return interestRateValue;
	}

	public void setInterestRateValue(Double interestRateValue) {
		this.interestRateValue = interestRateValue;
	}

	public OrderTermRatePeriod getInterestRateValuePerPeriod() {
		return interestRateValuePerPeriod;
	}

	public void setInterestRateValuePerPeriod(OrderTermRatePeriod interestRateValuePerPeriod) {
		this.interestRateValuePerPeriod = interestRateValuePerPeriod;
	}

	public OrderTermFloatingRateType getInterestType() {
		return interestType;
	}

	public void setInterestType(OrderTermFloatingRateType interestType) {
		this.interestType = interestType;
	}

	public Double getPenaltyOnPrincipleOverdueRateValue() {
		return penaltyOnPrincipleOverdueRateValue;
	}

	public void setPenaltyOnPrincipleOverdueRateValue(Double penaltyOnPrincipleOverdueRateValue) {
		this.penaltyOnPrincipleOverdueRateValue = penaltyOnPrincipleOverdueRateValue;
	}

	public OrderTermFloatingRateType getPenaltyOnPrincipleOverdueType() {
		return penaltyOnPrincipleOverdueType;
	}

	public void setPenaltyOnPrincipleOverdueType(OrderTermFloatingRateType penaltyOnPrincipleOverdueType) {
		this.penaltyOnPrincipleOverdueType = penaltyOnPrincipleOverdueType;
	}

	public Double getPenaltyOnInterestOverdueRateValue() {
		return penaltyOnInterestOverdueRateValue;
	}

	public void setPenaltyOnInterestOverdueRateValue(Double penaltyOnInterestOverdueRateValue) {
		this.penaltyOnInterestOverdueRateValue = penaltyOnInterestOverdueRateValue;
	}

	public OrderTermFloatingRateType getPenaltyOnInterestOverdueType() {
		return penaltyOnInterestOverdueType;
	}

	public void setPenaltyOnInterestOverdueType(OrderTermFloatingRateType penaltyOnInterestOverdueType) {
		this.penaltyOnInterestOverdueType = penaltyOnInterestOverdueType;
	}

	public OrderTermDaysMethod getDaysInYearMethod() {
		return daysInYearMethod;
	}

	public void setDaysInYearMethod(OrderTermDaysMethod daysInYearMethod) {
		this.daysInYearMethod = daysInYearMethod;
	}

	public OrderTermDaysMethod getDaysInMonthMethod() {
		return daysInMonthMethod;
	}

	public void setDaysInMonthMethod(OrderTermDaysMethod daysInMonthMethod) {
		this.daysInMonthMethod = daysInMonthMethod;
	}

	public OrderTermTransactionOrder getTransactionOrder() {
		return transactionOrder;
	}

	public void setTransactionOrder(OrderTermTransactionOrder transactionOrder) {
		this.transactionOrder = transactionOrder;
	}

	public OrderTermAccrMethod getInterestAccrMethod() {
		return interestAccrMethod;
	}

	public void setInterestAccrMethod(OrderTermAccrMethod interestAccrMethod) {
		this.interestAccrMethod = interestAccrMethod;
	}

	public boolean isEarlyRepaymentAllowed() {
		return earlyRepaymentAllowed;
	}

	public void setEarlyRepaymentAllowed(boolean earlyRepaymentAllowed) {
		this.earlyRepaymentAllowed = earlyRepaymentAllowed;
	}

	public Double getPenaltyLimitPercent() {
		return penaltyLimitPercent;
	}

	public void setPenaltyLimitPercent(Double penaltyLimitPercent) {
		this.penaltyLimitPercent = penaltyLimitPercent;
	}

	public boolean isCollateralFree() {
		return collateralFree;
	}

	public void setCollateralFree(boolean collateralFree) {
		this.collateralFree = collateralFree;
	}

	public Set<AgreementTemplate> getAgreementTemplate() {
		return agreementTemplate;
	}

	public void setAgreementTemplate(Set<AgreementTemplate> agreementTemplate) {
		this.agreementTemplate = agreementTemplate;
	}
	
}
