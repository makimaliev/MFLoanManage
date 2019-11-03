package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="collateralItem")
public class CollateralItem extends GenericModel {
	
	@Column(nullable=true, length=200)
	private String name;
	
	@Column(nullable=true, length=200)
	private String description;
	
	@ManyToOne(targetEntity=ItemType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="itemTypeId")
	private ItemType itemType;
	
	@Column(precision = 12, scale = 5)
	private Double quantity;

	@Column(precision = 12, scale = 5)
	private Double risk_rate;

	@Column(precision = 12, scale = 5)
	private Double demand_rate;

	@ManyToOne(targetEntity=QuantityType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="quantityTypeId")
	private QuantityType quantityType;
	
	@Column(precision = 12, scale = 5)
	private Double collateralValue;
	
	@Column(precision = 12, scale = 5)
	private Double estimatedValue;
	
	@ManyToOne(targetEntity=ConditionType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="conditionTypeId")
	private ConditionType conditionType;
	
	@ManyToOne(targetEntity=CollateralAgreement.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collateralAgreementId")
	CollateralAgreement collateralAgreement;
	
	@OneToMany(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CollateralItemInspectionResult> collateralItemInspectionResults = new HashSet<CollateralItemInspectionResult>();
	
	@OneToOne(mappedBy = "collateralItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval=true)
    private CollateralItemDetails collateralItemDetails;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name="collateralItemArrestFreeId")
	CollateralItemArrestFree collateralItemArrestFree;

	@ManyToOne(targetEntity=Owner.class, fetch = FetchType.LAZY)
	@JoinColumn(name="ownerId")
	Owner owner;

	@ManyToOne(targetEntity=Owner.class, fetch = FetchType.LAZY)
	@JoinColumn(name="organization")
	Owner organization;

	private int status = 1;
	private boolean inspection_needed=true;
	@Column(columnDefinition = "TEXT")
	private String inspection_needed_description;

	@ManyToOne(targetEntity=InspectionStatus.class, fetch = FetchType.LAZY)
	@JoinColumn(name="inspectionStatusId")
	private InspectionStatus inspectionStatus;

	@ManyToOne(targetEntity=ArrestFreeStatus.class, fetch = FetchType.LAZY)
	@JoinColumn(name="arrestFreeStatusId")
	private ArrestFreeStatus arrestFreeStatus;

	private Long condition_sub_type;

	//region get-set

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

	public CollateralItemArrestFree getCollateralItemArrestFree() {
		return collateralItemArrestFree;
	}

	public void setCollateralItemArrestFree(CollateralItemArrestFree collateralItemArrestFree) {
		this.collateralItemArrestFree = collateralItemArrestFree;
	}

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

	public Owner getOrganization() {
		return organization;
	}

	public void setOrganization(Owner organization) {
		this.organization = organization;
	}

	public boolean isInspection_needed() {
		return inspection_needed;
	}

	public void setInspection_needed(boolean inspection_needed) {
		this.inspection_needed = inspection_needed;
	}

	public String getInspection_needed_description() {
		return inspection_needed_description;
	}

	public void setInspection_needed_description(String inspection_needed_description) {
		this.inspection_needed_description = inspection_needed_description;
	}

	public InspectionStatus getInspectionStatus() {
		return inspectionStatus;
	}

	public void setInspectionStatus(InspectionStatus inspectionStatus) {
		this.inspectionStatus = inspectionStatus;
	}

	public ArrestFreeStatus getArrestFreeStatus() {
		return arrestFreeStatus;
	}

	public void setArrestFreeStatus(ArrestFreeStatus arrestFreeStatus) {
		this.arrestFreeStatus = arrestFreeStatus;
	}

	public Long getCondition_sub_type() {
		return condition_sub_type;
	}

	public void setCondition_sub_type(Long condition_sub_type) {
		this.condition_sub_type = condition_sub_type;
	}

	//endregion
}
