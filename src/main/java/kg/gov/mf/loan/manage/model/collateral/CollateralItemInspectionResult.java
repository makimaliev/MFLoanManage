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
@Table(name="collateral_item_inspection_result")
public class CollateralItemInspectionResult {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="on_date", nullable=false)
	private Date onDate;
	
	@ManyToOne
	private CollateralItem collateralItem;
	
	@OneToOne
	@JoinColumn(name="inspectionResultType_id")
	private InspectionResultType inspectionResultType;
	
	@OneToOne
	@JoinColumn(name="collateralInspection_id")
	private CollateralInspection collateralInspection;
	
	public CollateralItemInspectionResult()
	{
		
	}
	
	public CollateralItemInspectionResult(Date onDate, InspectionResultType inspectionResultType,
			CollateralInspection collateralInspection) {
		this.onDate = onDate;
		this.inspectionResultType = inspectionResultType;
		this.collateralInspection = collateralInspection;
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

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}

	public InspectionResultType getInspectionResultType() {
		return inspectionResultType;
	}

	public void setInspectionResultType(InspectionResultType inspectionResultType) {
		this.inspectionResultType = inspectionResultType;
	}

	public CollateralInspection getCollateralInspection() {
		return collateralInspection;
	}

	public void setCollateralInspection(CollateralInspection collateralInspection) {
		this.collateralInspection = collateralInspection;
	}
	
}
