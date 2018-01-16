package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(targetEntity=CollateralArrestFree.class, fetch = FetchType.EAGER)
	@JoinColumn(name="collateralArrestFreeId")
	private CollateralArrestFree collateralArrestFree;
	
	@ManyToOne(targetEntity=CollateralItem.class, fetch = FetchType.EAGER)
    @JoinColumn(name="collateralItemId")
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
