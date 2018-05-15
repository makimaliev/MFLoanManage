package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.*;

@Entity
@Table(name="collateralItem")
public class CollateralItem extends BaseModel {
	
	@Column(nullable=true, length=200)
	private String name;
	
	@Column(nullable=true, length=200)
	private String description;
	
	@ManyToOne(targetEntity=ItemType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="itemTypeId")
	private ItemType itemType;
	
	@Column(precision = 12, scale = 5)
	private Double quantity;

	@Column(precision = 12, scale = 5)
	private Double risk_rate;

	@Column(precision = 12, scale = 5)
	private Double demand_rate;

	@Enumerated(EnumType.STRING)
	private QuantityType quantityType;
	
	@Column(precision = 12, scale = 5)
	private Double collateralValue;
	
	@Column(precision = 12, scale = 5)
	private Double estimatedValue;

	@Enumerated(EnumType.STRING)
	private ConditionType conditionType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "collateralAgreementId", nullable = false)
	CollateralAgreement collateralAgreement;
	
	@OneToOne(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private CollateralItemDetails collateralItemDetails;
	
	@OneToOne(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private CollateralItemArrestFree collateralItemArrestFree;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getRisk_rate() {
		return risk_rate;
	}

	public void setRisk_rate(Double risk_rate) {
		this.risk_rate = risk_rate;
	}

	public Double getDemand_rate() {
		return demand_rate;
	}

	public void setDemand_rate(Double demand_rate) {
		this.demand_rate = demand_rate;
	}

	public QuantityType getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(QuantityType quantityType) {
		this.quantityType = quantityType;
	}

	public Double getCollateralValue() {
		return collateralValue;
	}

	public void setCollateralValue(Double collateralValue) {
		this.collateralValue = collateralValue;
	}

	public Double getEstimatedValue() {
		return estimatedValue;
	}

	public void setEstimatedValue(Double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}

	public ConditionType getConditionType() {
		return conditionType;
	}

	public void setConditionType(ConditionType conditionType) {
		this.conditionType = conditionType;
	}

	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public void setCollateralAgreement(CollateralAgreement collateralAgreement) {
		this.collateralAgreement = collateralAgreement;
	}

	public CollateralItemDetails getCollateralItemDetails() {
		return collateralItemDetails;
	}

	public void setCollateralItemDetails(CollateralItemDetails collateralItemDetails) {
		this.collateralItemDetails = collateralItemDetails;
	}

	public CollateralItemArrestFree getCollateralItemArrestFree() {
		return collateralItemArrestFree;
	}

	public void setCollateralItemArrestFree(CollateralItemArrestFree collateralItemArrestFree) {
		this.collateralItemArrestFree = collateralItemArrestFree;
	}
}
