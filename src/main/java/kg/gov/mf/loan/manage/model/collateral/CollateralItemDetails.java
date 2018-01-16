package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="collateralItemDetails")
public class CollateralItemDetails extends GenericModel{

	@Column(nullable=false, length=100)
	private String details1;
	
	@Column(nullable=false, length=100)
	private String details2;
	
	@Column(nullable=false, length=100)
	private String details3;
	
	@Column(nullable=false, length=100)
	private String details4;
	
	@Column(nullable=false, length=100)
	private String details5;
	
	@Column(nullable=false, length=100)
	private String details6;
	
	@ManyToOne(targetEntity=CollateralItem.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralItemId")
	CollateralItem collateralItem;

	public String getDetails1() {
		return details1;
	}

	public void setDetails1(String details1) {
		this.details1 = details1;
	}

	public String getDetails2() {
		return details2;
	}

	public void setDetails2(String details2) {
		this.details2 = details2;
	}

	public String getDetails3() {
		return details3;
	}

	public void setDetails3(String details3) {
		this.details3 = details3;
	}

	public String getDetails4() {
		return details4;
	}

	public void setDetails4(String details4) {
		this.details4 = details4;
	}

	public String getDetails5() {
		return details5;
	}

	public void setDetails5(String details5) {
		this.details5 = details5;
	}

	public String getDetails6() {
		return details6;
	}

	public void setDetails6(String details6) {
		this.details6 = details6;
	}

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}
}
