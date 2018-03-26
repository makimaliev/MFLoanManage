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
@Table(name="collateralItemInspectionResult")
public class CollateralItemInspectionResult extends GenericModel {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date onDate;
	
	@ManyToOne(targetEntity=InspectionResultType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="inspectionResultTypeId")
	private InspectionResultType inspectionResultType;
	
	@ManyToOne(targetEntity=CollateralItem.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collateralItemId")
	CollateralItem collateralItem;

	private String details;

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public InspectionResultType getInspectionResultType() {
		return inspectionResultType;
	}

	public void setInspectionResultType(InspectionResultType inspectionResultType) {
		this.inspectionResultType = inspectionResultType;
	}

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
