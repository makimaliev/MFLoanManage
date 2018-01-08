package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="collateral_item_arrest_free")
public class CollateralItemArrestFree {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="on_date", nullable=false)
	private Date onDate;
	
	@Column(name="arrest_fee_by")
	private long arrestFreeBy;
	
	@OneToOne
	@JoinColumn(name="collateralArrestFree_id")
	private CollateralArrestFree collateralArrestFree;
	
	@ManyToOne
	private CollateralItem collateralItem;
	
	public CollateralItemArrestFree()
	{
		
	}
	
	public CollateralItemArrestFree(Date onDate, long arrestFreeBy, CollateralArrestFree collateralArrestFree) {
		this.onDate = onDate;
		this.arrestFreeBy = arrestFreeBy;
		this.collateralArrestFree = collateralArrestFree;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public long getArrestFreeBy() {
		return arrestFreeBy;
	}

	public void setArrestFreeBy(long arrestFreeBy) {
		this.arrestFreeBy = arrestFreeBy;
	}

	public CollateralArrestFree getCollateralArrestFree() {
		return collateralArrestFree;
	}

	public void setCollateralArrestFree(CollateralArrestFree collateralArrestFree) {
		this.collateralArrestFree = collateralArrestFree;
	}

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}
	
}
