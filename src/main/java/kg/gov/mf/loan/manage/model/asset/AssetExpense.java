package kg.gov.mf.loan.manage.model.asset;

import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "asset_expense")
public class AssetExpense extends GenericModel {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;

    private Double amount;

    @Column(columnDefinition = "TEXT")
    private String details;

    @ManyToOne(targetEntity=Asset.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetId")
    Asset asset;

    @ManyToOne(targetEntity=AssetExpenseType.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetExpenseType")
    private AssetExpenseType assetExpenseType;

    // region GETTERS-SETTERS

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public AssetExpenseType getAssetExpenseType() {
        return assetExpenseType;
    }

    public void setAssetExpenseType(AssetExpenseType assetExpenseType) {
        this.assetExpenseType = assetExpenseType;
    }
    // endregion
}
