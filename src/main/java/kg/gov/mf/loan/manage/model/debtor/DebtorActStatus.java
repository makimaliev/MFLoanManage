package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "debtor_act_status")
public class DebtorActStatus extends GenericModel {

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
