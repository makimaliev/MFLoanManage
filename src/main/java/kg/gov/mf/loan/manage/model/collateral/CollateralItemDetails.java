package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="collateral_item_details")
public class CollateralItemDetails {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="details1", nullable=false, length=100)
	private String details1;
	
	@Column(name="details2", nullable=false, length=100)
	private String details2;
	
	@Column(name="details3", nullable=false, length=100)
	private String details3;
	
	@Column(name="details4", nullable=false, length=100)
	private String details4;
	
	@Column(name="details5", nullable=false, length=100)
	private String details5;
	
	@Column(name="details6", nullable=false, length=100)
	private String details6;
	
	@ManyToOne
	private  CollateralItem collateralItem;
	
	public CollateralItemDetails()
	{
		
	}
	
	public CollateralItemDetails(String details1, String details2, String details3, String details4, String details5,
			String details6) {
		this.details1 = details1;
		this.details2 = details2;
		this.details3 = details3;
		this.details4 = details4;
		this.details5 = details5;
		this.details6 = details6;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
