package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;

@Entity
@Table(name = "debtor_act_needed")
public class DebtorActNeeded extends GenericModel {

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

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
}
