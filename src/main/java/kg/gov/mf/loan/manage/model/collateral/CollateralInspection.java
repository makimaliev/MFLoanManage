package kg.gov.mf.loan.manage.model.collateral;

import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="collateralInspection")
public class CollateralInspection extends BaseModel {

	@Column(nullable=false, length=20)	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
