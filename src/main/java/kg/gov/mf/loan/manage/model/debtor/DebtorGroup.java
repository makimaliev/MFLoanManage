package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "debtorGroup")
public class DebtorGroup extends GenericModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

    @OneToMany(mappedBy = "debtorGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DebtorSubGroup> debtorSubGroups = new HashSet<DebtorSubGroup>();

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

    public Set<DebtorSubGroup> getDebtorSubGroups() {
        return debtorSubGroups;
    }

    public void setDebtorSubGroups(Set<DebtorSubGroup> debtorSubGroups) {
        this.debtorSubGroups = debtorSubGroups;
    }

    //endregion
}
