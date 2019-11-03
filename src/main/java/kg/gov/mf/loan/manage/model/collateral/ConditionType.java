package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.task.model.Catalog;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="collateralConditionType")
public class ConditionType extends Catalog{

    @OneToMany(mappedBy = "conditionType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ConditionSubType> conditionSubTypes = new HashSet<ConditionSubType>();

    public Set<ConditionSubType> getConditionSubTypes() {
        return conditionSubTypes;
    }

    public void setConditionSubTypes(Set<ConditionSubType> conditionSubTypes) {
        this.conditionSubTypes = conditionSubTypes;
    }
}
