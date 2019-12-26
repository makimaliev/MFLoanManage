package kg.gov.mf.loan.manage.model.asset;

import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "asset")
public class Asset extends GenericModel {

    private String number;
    private String name;

    private Double amount1;
    private Double amount2;
    private Double amount3;
    private Double amount4;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(targetEntity=AssetType.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetTypeId")
    private AssetType assetType;

    @ManyToOne(targetEntity=AssetStatus.class, fetch = FetchType.LAZY)
    @JoinColumn(name="assetStatusId")
    private AssetStatus assetStatus;

    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AssetItem> assetItems;

    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AssetExpense> assetExpenses;

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> loanIds=new HashSet<Long>();

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> toDebtorIds=new HashSet<Long>();

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> paymentIds=new HashSet<Long>();

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> secondaryPaymentIds=new HashSet<Long>();

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> fromLoanIds=new HashSet<Long>();

    @Column(nullable = true)
    @ElementCollection(targetClass=Long.class)
    private Set<Long> fromDebtorIds=new HashSet<Long>();

    private Long phase_id;

    //region GETTERS-SETTERS

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount1() {
        return amount1;
    }

    public void setAmount1(Double amount1) {
        this.amount1 = amount1;
    }

    public Double getAmount2() {
        return amount2;
    }

    public void setAmount2(Double amount2) {
        this.amount2 = amount2;
    }

    public Double getAmount3() {
        return amount3;
    }

    public void setAmount3(Double amount3) {
        this.amount3 = amount3;
    }

    public Double getAmount4() {
        return amount4;
    }

    public void setAmount4(Double amount4) {
        this.amount4 = amount4;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public void setAssetType(AssetType assetType) {
        this.assetType = assetType;
    }

    public AssetStatus getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }

    public Set<AssetItem> getAssetItems() {
        return assetItems;
    }

    public void setAssetItems(Set<AssetItem> assetItems) {
        this.assetItems = assetItems;
    }

    public Set<AssetExpense> getAssetExpenses() {
        return assetExpenses;
    }

    public void setAssetExpenses(Set<AssetExpense> assetExpenses) {
        this.assetExpenses = assetExpenses;
    }

    public Set<Long> getLoanIds() {
        return loanIds;
    }

    public void setLoanIds(Set<Long> loanIds) {
        this.loanIds = loanIds;
    }

    public Set<Long> getToDebtorIds() {
        return toDebtorIds;
    }

    public void setToDebtorIds(Set<Long> toDebtorIds) {
        this.toDebtorIds = toDebtorIds;
    }

    public Set<Long> getPaymentIds() {
        return paymentIds;
    }

    public void setPaymentIds(Set<Long> paymentIds) {
        this.paymentIds = paymentIds;
    }

    public Set<Long> getSecondaryPaymentIds() {
        return secondaryPaymentIds;
    }

    public void setSecondaryPaymentIds(Set<Long> secondaryPaymentIds) {
        this.secondaryPaymentIds = secondaryPaymentIds;
    }

    public Set<Long> getFromLoanIds() {
        return fromLoanIds;
    }

    public void setFromLoanIds(Set<Long> fromLoanIds) {
        this.fromLoanIds = fromLoanIds;
    }

    public Set<Long> getFromDebtorIds() {
        return fromDebtorIds;
    }

    public void setFromDebtorIds(Set<Long> fromDebtorIds) {
        this.fromDebtorIds = fromDebtorIds;
    }

    public Long getPhase_id() {
        return phase_id;
    }

    public void setPhase_id(Long phase_id) {
        this.phase_id = phase_id;
    }
//endregion

}
