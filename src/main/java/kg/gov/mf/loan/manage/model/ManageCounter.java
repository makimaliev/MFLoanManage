package kg.gov.mf.loan.manage.model;

import kg.gov.mf.loan.task.model.Catalog;

import javax.persistence.*;

@Entity
@Table(name = "manage_counter")
public class ManageCounter extends Catalog {

    private String entityName;
    private Long number;

    //region get-set

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    //endregion
}
