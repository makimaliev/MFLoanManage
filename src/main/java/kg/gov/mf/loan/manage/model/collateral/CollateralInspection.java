package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.GenericModel;

@Entity
@Table(name="collateralInspection")
public class CollateralInspection extends GenericModel{

	@Column(nullable=false, length=20)	
	private String name;
	
	/*
	@ManyToOne(targetEntity=CollateralAgreement.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralAgreementId")
	CollateralAgreement collateralAgreement;
	*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public void setCollateralAgreement(CollateralAgreement collateralAgreement) {
		this.collateralAgreement = collateralAgreement;
	}
	*/
	
	
}
