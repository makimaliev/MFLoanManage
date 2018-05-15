package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="inspectionResultType")
public class InspectionResultType extends BaseModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
