package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="collateral_summary")
public class CollateralSummary {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="on_date", nullable=false)
	private Date onDate;
	
	@Column(name = "agreement_quantity", precision = 12, scale = 5)
	private Double agreementQuantity;
	
	@Column(name = "guarantor_quantity", precision = 12, scale = 5)
	private Double guarantorQuantity;
	
	@Column(name = "collateral_loan_cover_ratio", precision = 12, scale = 5)
	private Double collateralLoanCoverRatio;
	
	@Column(name = "collateral_amount", precision = 12, scale = 5)
	private Double collateralAmount;
	
	@Column(name = "loan_amount", precision = 12, scale = 5)
	private Double loanAmount;
	
	@Column(name = "item_average_condition", precision = 12, scale = 5)
	private Double itemAverageCondition;
	
	@Column(name = "item_worst_condition", precision = 12, scale = 5)
	private Double itemWorstCondition;
	
	@Column(name = "item_avg_condition_by_collateral", precision = 12, scale = 5)
	private Double itemAvgConditionByCollateral;
	
	@Column(name = "item_avg_condition_by_loan", precision = 12, scale = 5)
	private Double itemAvgConditionByLoan;
	
	@ManyToOne
	private Collateral collateral;
	
	public CollateralSummary()
	{
		
	}
	
	public CollateralSummary(Date onDate, Double agreementQuantity, Double guarantorQuantity,
			Double collateralLoanCoverRatio, Double collateralAmount, Double loanAmount, Double itemAverageCondition,
			Double itemWorstCondition, Double itemAvgConditionByCollateral, Double itemAvgConditionByLoan) {
		this.onDate = onDate;
		this.agreementQuantity = agreementQuantity;
		this.guarantorQuantity = guarantorQuantity;
		this.collateralLoanCoverRatio = collateralLoanCoverRatio;
		this.collateralAmount = collateralAmount;
		this.loanAmount = loanAmount;
		this.itemAverageCondition = itemAverageCondition;
		this.itemWorstCondition = itemWorstCondition;
		this.itemAvgConditionByCollateral = itemAvgConditionByCollateral;
		this.itemAvgConditionByLoan = itemAvgConditionByLoan;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
