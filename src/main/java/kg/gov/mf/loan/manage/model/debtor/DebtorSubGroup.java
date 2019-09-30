package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;

@Entity
@Table(name = "debtorSubGroup")
public class DebtorSubGroup extends GenericModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

    @ManyToOne(targetEntity=DebtorGroup.class, fetch = FetchType.LAZY)
    @JoinColumn(name="debtorGroupId")
    DebtorGroup debtorGroup;

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

    public DebtorGroup getDebtorGroup() {
        return debtorGroup;
    }

    public void setDebtorGroup(DebtorGroup debtorGroup) {
        this.debtorGroup = debtorGroup;
    }

    //endregion

}
