package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="collateralItemArrestFree")
public class CollateralItemArrestFree extends BaseModel {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date onDate;
	
	private long arrestFreeBy;

	@Column(nullable=true, length=300)
	private String details;
	
	@OneToOne(targetEntity=CollateralItem.class, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	CollateralItem collateralItem;

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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}
}
