package kg.gov.mf.loan.manage.model.asset;

import kg.gov.mf.loan.manage.model.collateral.InspectionResultType;
import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asset_item_inspection")
public class AssetItemInspection extends GenericModel {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date onDate;

    @ManyToOne(targetEntity= InspectionResultType.class, fetch = FetchType.EAGER)
    @JoinColumn(name="inspectionResultTypeId")
    private InspectionResultType inspectionResultType;

    @ManyToOne(targetEntity= AssetItem.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetItemId")
    AssetItem assetItem;

    @Column(columnDefinition = "TEXT")
    private String details;

    //    region GETTERS-SETTERS

    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public InspectionResultType getInspectionResultType() {
        return inspectionResultType;
    }

    public void setInspectionResultType(InspectionResultType inspectionResultType) {
        this.inspectionResultType = inspectionResultType;
    }

    public AssetItem getAssetItem() {
        return assetItem;
    }

    public void setAssetItem(AssetItem assetItem) {
        this.assetItem = assetItem;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
//    endregion
}
