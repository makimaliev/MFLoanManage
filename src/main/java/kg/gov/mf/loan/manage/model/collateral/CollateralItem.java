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
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="collateralItem")
public class CollateralItem extends GenericModel {
	
	@Column(name="name", nullable=false, length=30)
	private String name;
	
	@Column(name="description", nullable=false, length=200)
	private String description;
	
	@ManyToOne(targetEntity=ItemType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="item_type_id")
	private ItemType itemType;
	
	@Column(name = "quantity", precision = 12, scale = 5)
	private Double quantity;
	
	@ManyToOne(targetEntity=QuantityType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="quantity_type_id")
	private QuantityType quantityType;
	
	@Column(name = "collateral_value", precision = 12, scale = 5)
	private Double collateralValue;
	
	@Column(name = "estimated_value", precision = 12, scale = 5)
	private Double estimatedValue;
	
	@ManyToOne(targetEntity=ConditionType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="condition_type_id")
	private ConditionType conditionType;
	
	@OneToMany(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralItemDetails> collateralItemDetails = new HashSet<CollateralItemDetails>();
	
	@OneToMany(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralItemInspectionResult> collateralItemInspectionResults = new HashSet<CollateralItemInspectionResult>();
	
	@OneToMany(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<CollateralItemArrestFree> collateralItemArrestFrees = new HashSet<CollateralItemArrestFree>();

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

	public Set<CollateralItemDetails> getCollateralItemDetails() {
		return collateralItemDetails;
	}

	public void setCollateralItemDetails(Set<CollateralItemDetails> collateralItemDetails) {
		this.collateralItemDetails = collateralItemDetails;
	}

	public Set<CollateralItemInspectionResult> getCollateralItemInspectionResults() {
		return collateralItemInspectionResults;
	}

	public void setCollateralItemInspectionResults(Set<CollateralItemInspectionResult> collateralItemInspectionResults) {
		this.collateralItemInspectionResults = collateralItemInspectionResults;
	}

	public Set<CollateralItemArrestFree> getCollateralItemArrestFrees() {
		return collateralItemArrestFrees;
	}

	public void setCollateralItemArrestFrees(Set<CollateralItemArrestFree> collateralItemArrestFrees) {
		this.collateralItemArrestFrees = collateralItemArrestFrees;
	}
}
