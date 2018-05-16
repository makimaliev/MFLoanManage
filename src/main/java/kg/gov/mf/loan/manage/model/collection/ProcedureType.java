package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="procedureType")
public class ProcedureType extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
