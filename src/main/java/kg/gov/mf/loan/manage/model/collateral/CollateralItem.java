package kg.gov.mf.loan.manage.model.collateral;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="collateral_item")
public class CollateralItem {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=30)
	private String name;
	
	@Column(name="description", nullable=false, length=200)
	private String description;
	
	@OneToOne
	@JoinColumn(name="item_type_id")
	private ItemType itemType;
	
	@Column(name = "quantity", precision = 12, scale = 5)
	private Double quantity;
	
	@OneToOne
	@JoinColumn(name="quantity_type_id")
	private QuantityType quantityType;
	
	@Column(name = "collateral_value", precision = 12, scale = 5)
	private Double collateralValue;
	
	@Column(name = "estimated_value", precision = 12, scale = 5)
	private Double estimatedValue;
	
	@OneToOne
	@JoinColumn(name="condition_type_id")
	private ConditionType conditionType;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralItem_id")
	private Set<CollateralItemDetails> collateralItemDetails;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralItem_id")
	private Set<CollateralItemInspectionResult> collateralItemInspectionResult;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralItem_id")
	private Set<CollateralItemArrestFree> collateralItemArrestFree;
	
	public CollateralItem()
	{
		
	}

	public CollateralItem(String name, String description, ItemType itemType, Double quantity,
			QuantityType quantityType, Double collateralValue, Double estimatedValue, ConditionType conditionType) {
		this.name = name;
		this.description = description;
		this.itemType = itemType;
		this.quantity = quantity;
		this.quantityType = quantityType;
		this.collateralValue = collateralValue;
		this.estimatedValue = estimatedValue;
		this.conditionType = conditionType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Set<CollateralItemInspectionResult> getCollateralItemInspectionResult() {
		return collateralItemInspectionResult;
	}

	public void setCollateralItemInspectionResult(Set<CollateralItemInspectionResult> collateralItemInspectionResult) {
		this.collateralItemInspectionResult = collateralItemInspectionResult;
	}

	public Set<CollateralItemArrestFree> getCollateralItemArrestFree() {
		return collateralItemArrestFree;
	}

	public void setCollateralItemArrestFree(Set<CollateralItemArrestFree> collateralItemArrestFree) {
		this.collateralItemArrestFree = collateralItemArrestFree;
	}
	
}
