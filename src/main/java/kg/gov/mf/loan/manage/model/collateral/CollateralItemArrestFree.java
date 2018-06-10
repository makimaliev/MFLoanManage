package kg.gov.mf.loan.manage.model.collateral;

import java.util.Date;

import javax.persistence.*;

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

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
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
