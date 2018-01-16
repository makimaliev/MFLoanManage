package kg.gov.mf.loan.manage.model.collateral;

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
@Table(name="collateralSummary")
public class CollateralSummary extends GenericModel{
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date onDate;
	
	@Column(precision = 12, scale = 5)
	private Double agreementQuantity;
	
	@Column(precision = 12, scale = 5)
	private Double guarantorQuantity;
	
	@Column(precision = 12, scale = 5)
	private Double collateralLoanCoverRatio;
	
	@Column(precision = 12, scale = 5)
	private Double collateralAmount;
	
	@Column(precision = 12, scale = 5)
	private Double loanAmount;
	
	@Column(precision = 12, scale = 5)
	private Double itemAverageCondition;
	
	@Column(precision = 12, scale = 5)
	private Double itemWorstCondition;
	
	@Column(precision = 12, scale = 5)
	private Double itemAvgConditionByCollateral;
	
	@Column(precision = 12, scale = 5)
	private Double itemAvgConditionByLoan;
	
	@ManyToOne(targetEntity=Collateral.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralId")
	Collateral collateral;

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public Double getAgreementQuantity() {
		return agreementQuantity;
	}

	public void setAgreementQuantity(Double agreementQuantity) {
		this.agreementQuantity = agreementQuantity;
	}

	public Double getGuarantorQuantity() {
		return guarantorQuantity;
	}

	public void setGuarantorQuantity(Double guarantorQuantity) {
		this.guarantorQuantity = guarantorQuantity;
	}

	public Double getCollateralLoanCoverRatio() {
		return collateralLoanCoverRatio;
	}

	public void setCollateralLoanCoverRatio(Double collateralLoanCoverRatio) {
		this.collateralLoanCoverRatio = collateralLoanCoverRatio;
	}

	public Double getCollateralAmount() {
		return collateralAmount;
	}

	public void setCollateralAmount(Double collateralAmount) {
		this.collateralAmount = collateralAmount;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getItemAverageCondition() {
		return itemAverageCondition;
	}

	public void setItemAverageCondition(Double itemAverageCondition) {
		this.itemAverageCondition = itemAverageCondition;
	}

	public Double getItemWorstCondition() {
		return itemWorstCondition;
	}

	public void setItemWorstCondition(Double itemWorstCondition) {
		this.itemWorstCondition = itemWorstCondition;
	}

	public Double getItemAvgConditionByCollateral() {
		return itemAvgConditionByCollateral;
	}

	public void setItemAvgConditionByCollateral(Double itemAvgConditionByCollateral) {
		this.itemAvgConditionByCollateral = itemAvgConditionByCollateral;
	}

	public Double getItemAvgConditionByLoan() {
		return itemAvgConditionByLoan;
	}

	public void setItemAvgConditionByLoan(Double itemAvgConditionByLoan) {
		this.itemAvgConditionByLoan = itemAvgConditionByLoan;
	}

	public Collateral getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral collateral) {
		this.collateral = collateral;
	}
}
