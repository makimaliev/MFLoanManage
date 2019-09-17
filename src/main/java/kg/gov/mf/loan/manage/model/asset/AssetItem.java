package kg.gov.mf.loan.manage.model.asset;


import kg.gov.mf.loan.manage.model.collateral.*;
import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "asset_item")
public class AssetItem extends GenericModel {

    @Column(nullable=true, length=200)
    private String name;

    @Column(nullable=true, length=200)
    private String description;

    @ManyToOne(targetEntity= ItemType.class, fetch = FetchType.LAZY)
    @JoinColumn(name="itemTypeId")
    private ItemType itemType;

    @Column(precision = 12, scale = 5)
    private Double quantity;

    @Column(precision = 12, scale = 5)
    private Double risk_rate;

    @Column(precision = 12, scale = 5)
    private Double demand_rate;

    @ManyToOne(targetEntity= QuantityType.class, fetch = FetchType.LAZY)
    @JoinColumn(name="quantityTypeId")
    private QuantityType quantityType;

    @Column(precision = 12, scale = 5)
    private Double collateralValue;

    @Column(precision = 12, scale = 5)
    private Double estimatedValue;

    @ManyToOne(targetEntity= ConditionType.class, fetch = FetchType.LAZY)
    @JoinColumn(name="conditionTypeId")
    private ConditionType conditionType;

    @OneToMany(mappedBy = "assetItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AssetItemInspection> assetItemInspections= new HashSet<AssetItemInspection>();

    @ManyToOne(targetEntity= Owner.class,fetch = FetchType.LAZY)
    @JoinColumn(name="ownerId")
    Owner owner;

    @ManyToOne(targetEntity=Owner.class, fetch = FetchType.LAZY)
    @JoinColumn(name="organization")
    Owner organization;

    @ManyToOne(targetEntity=Asset.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetId")
    Asset asset;

    private int status = 1;
    private boolean inspection_needed=true;

    @Column(columnDefinition = "TEXT")
    private String inspection_needed_description;

    @OneToOne(mappedBy = "assetItem", cascade = CascadeType.ALL, orphanRemoval=true)
    private AssetItemDetails assetItemDetails;

    // region GETTERS-SETTERS

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

    public Set<AssetItemInspection> getAssetItemInspections() {
        return assetItemInspections;
    }

    public void setAssetItemInspections(Set<AssetItemInspection> assetItemInspections) {
        this.assetItemInspections = assetItemInspections;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOrganization() {
        return organization;
    }

    public void setOrganization(Owner organization) {
        this.organization = organization;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public AssetItemDetails getAssetItemDetails() {
        return assetItemDetails;
    }

    public void setAssetItemDetails(AssetItemDetails assetItemDetails) {
        this.assetItemDetails = assetItemDetails;
    }
//endregion
}
