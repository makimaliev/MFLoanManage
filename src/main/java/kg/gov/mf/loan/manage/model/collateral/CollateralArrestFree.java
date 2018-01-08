package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="collateral_arrest_free")
public class CollateralArrestFree {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=20)	
	private String name;
	
	@ManyToOne
	private CollateralAgreement collateralAgreement;
	
	public CollateralArrestFree() {
	}

	public CollateralArrestFree(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public void setCollateralAgreement(CollateralAgreement collateralAgreement) {
		this.collateralAgreement = collateralAgreement;
	}
	
}
