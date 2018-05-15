package kg.gov.mf.loan.manage.model.orderterm;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.BaseModel;

@Entity
@Table(name="orderTermFund")
public class OrderTermFund extends BaseModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
