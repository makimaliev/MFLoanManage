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

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="collateralItemArrestFree")
public class CollateralItemArrestFree extends GenericModel {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date onDate;
	
	private long arrestFreeBy;

	@Column(nullable=true, length=300)
	private String details;
	
	/*
	@ManyToOne(targetEntity=CollateralArrestFree.class, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralArrestFreeId")
	private CollateralArrestFree collateralArrestFree;
	*/
	
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

	/*
	public CollateralArrestFree getCollateralArrestFree() {
		return collateralArrestFree;
	}

	public void setCollateralArrestFree(CollateralArrestFree collateralArrestFree) {
		this.collateralArrestFree = collateralArrestFree;
	}
	*/

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
