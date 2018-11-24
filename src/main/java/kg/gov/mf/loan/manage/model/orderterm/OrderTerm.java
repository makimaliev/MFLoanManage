package kg.gov.mf.loan.manage.model.orderterm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="orderTerm")
public class OrderTerm extends GenericModel{
	
	private String description;
	private Double amount;
	private int installmentQuantity;
	private int installmentFirstDay;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date firstInstallmentDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date lastInstallmentDate;
	
	private int minDaysDisbFirstInst;
	private int maxDaysDisbFirstInst;
	private int graceOnPrinciplePaymentInst;
	private int graceOnPrinciplePaymentDays;
	private int graceOnInterestPaymentInst;
	private int graceOnInterestPaymentDays;
	private int graceOnInterestAccrInst;
	private int graceOnInterestAccrDays;
	private Double interestRateValue;
	private int frequencyQuantity;
	private Double penaltyOnPrincipleOverdueRateValue;
	
	@ManyToOne(targetEntity=OrderTermFund.class, fetch = FetchType.EAGER)
	@JoinColumn(name="fundId")
	private OrderTermFund fund;
	
	private Double penaltyOnInterestOverdueRateValue;
	private boolean earlyRepaymentAllowed;
	private Double penaltyLimitPercent;
	private boolean collateralFree;
	
	@ManyToOne(targetEntity=OrderTermCurrency.class, fetch = FetchType.EAGER)
	@JoinColumn(name="currencyId")
	private OrderTermCurrency currency;
	
	@ManyToOne(targetEntity=OrderTermFrequencyType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="frequencyTypeId")
	private OrderTermFrequencyType frequencyType;
	
	@ManyToOne(targetEntity=OrderTermRatePeriod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="interestRateValuePerPeriodId")
	private OrderTermRatePeriod interestRateValuePerPeriod;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="interestTypeId")
	private OrderTermFloatingRateType interestType;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penaltyOnPrincipleOverdueTypeId")
	private OrderTermFloatingRateType penaltyOnPrincipleOverdueType;
	
	@ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="penaltyOnInterestOverdueTypeId")
	private OrderTermFloatingRateType penaltyOnInterestOverdueType;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="daysInYearMethodId")
	private OrderTermDaysMethod daysInYearMethod;
	
	@ManyToOne(targetEntity=OrderTermDaysMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="daysInMonthMethodId")
	private OrderTermDaysMethod daysInMonthMethod;
	
	@ManyToOne(targetEntity=OrderTermTransactionOrder.class, fetch = FetchType.EAGER)
	@JoinColumn(name="transactionOrderId")
	private OrderTermTransactionOrder transactionOrder;
	
	@ManyToOne(targetEntity=OrderTermAccrMethod.class, fetch = FetchType.EAGER)
	@JoinColumn(name="interestAccrMethodId")
	private OrderTermAccrMethod interestAccrMethod;

	@OneToMany(mappedBy = "orderTerm", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AgreementTemplate> agreementTemplates = new HashSet<AgreementTemplate>();
	
	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.LAZY)
    @JoinColumn(name="creditOrderId")
    CreditOrder creditOrder;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public int getFrequencyQuantity() {
		return frequencyQuantity;
	}

	public void setFrequencyQuantity(int frequencyQuantity) {
		this.frequencyQuantity = frequencyQuantity;
	}

	public Double getPenaltyOnPrincipleOverdueRateValue() {
		return penaltyOnPrincipleOverdueRateValue;
	}

	public void setPenaltyOnPrincipleOverdueRateValue(Double penaltyOnPrincipleOverdueRateValue) {
		this.penaltyOnPrincipleOverdueRateValue = penaltyOnPrincipleOverdueRateValue;
	}

	public OrderTermFund getFund() {
		return fund;
	}

	public void setFund(OrderTermFund fund) {
		this.fund = fund;
	}

	public Double getPenaltyOnInterestOverdueRateValue() {
		return penaltyOnInterestOverdueRateValue;
	}

	public void setPenaltyOnInterestOverdueRateValue(Double penaltyOnInterestOverdueRateValue) {
		this.penaltyOnInterestOverdueRateValue = penaltyOnInterestOverdueRateValue;
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

	public OrderTermCurrency getCurrency() {
		return currency;
	}

	public void setCurrency(OrderTermCurrency currency) {
		this.currency = currency;
	}

	public OrderTermFrequencyType getFrequencyType() {
		return frequencyType;
	}

	public void setFrequencyType(OrderTermFrequencyType frequencyType) {
		this.frequencyType = frequencyType;
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

	public OrderTermFloatingRateType getPenaltyOnPrincipleOverdueType() {
		return penaltyOnPrincipleOverdueType;
	}

	public void setPenaltyOnPrincipleOverdueType(OrderTermFloatingRateType penaltyOnPrincipleOverdueType) {
		this.penaltyOnPrincipleOverdueType = penaltyOnPrincipleOverdueType;
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

	public Set<AgreementTemplate> getAgreementTemplates() {
		return agreementTemplates;
	}

	public void setAgreementTemplates(Set<AgreementTemplate> agreementTemplates) {
		this.agreementTemplates = agreementTemplates;
	}

	public CreditOrder getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(CreditOrder creditOrder) {
		this.creditOrder = creditOrder;
	}
	
}
