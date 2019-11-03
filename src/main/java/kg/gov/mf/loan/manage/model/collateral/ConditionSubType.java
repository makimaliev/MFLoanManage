package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.task.model.Catalog;

import javax.persistence.*;

@Entity
@Table(name="conditionSubType")
public class ConditionSubType extends Catalog {

    @ManyToOne(targetEntity=ConditionType.class, fetch = FetchType.EAGER)
    @JoinColumn(name="conditionTypeId")
    ConditionType conditionType;

    public ConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(ConditionType conditionType) {
        this.conditionType = conditionType;
    }
}
