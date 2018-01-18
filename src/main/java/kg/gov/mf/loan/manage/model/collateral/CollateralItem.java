package kg.gov.mf.loan.manage.model.collateral;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="collateralItem")
public class CollateralItem extends GenericModel {
	
	@Column(nullable=false, length=30)
	private String name;
	
	@Column(nullable=false, length=200)
	private String description;
	
	@ManyToOne(targetEntity=ItemType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="itemTypeId")
	private ItemType itemType;
	
	@Column(precision = 12, scale = 5)
	private Double quantity;
	
	@ManyToOne(targetEntity=QuantityType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="quantityTypeId")
	private QuantityType quantityType;
	
	@Column(precision = 12, scale = 5)
	private Double collateralValue;
	
	@Column(precision = 12, scale = 5)
	private Double estimatedValue;
	
	@ManyToOne(targetEntity=ConditionType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="conditionTypeId")
	private ConditionType conditionType;
	
	@ManyToOne(targetEntity=CollateralAgreement.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralAgreementId")
	CollateralAgreement collateralAgreement;
	
	@OneToMany(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralItemInspectionResult> collateralItemInspectionResults = new HashSet<CollateralItemInspectionResult>();
	
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

	public Set<CollateralItemInspectionResult> getCollateralItemInspectionResults() {
		return collateralItemInspectionResults;
	}

	public void setCollateralItemInspectionResults(Set<CollateralItemInspectionResult> collateralItemInspectionResults) {
		this.collateralItemInspectionResults = collateralItemInspectionResults;
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
