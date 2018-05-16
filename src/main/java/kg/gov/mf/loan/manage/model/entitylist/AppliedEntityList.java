package kg.gov.mf.loan.manage.model.entitylist;

import java.util.Date;
import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="appliedEntityList")
public class AppliedEntityList extends BaseModel {

	@Column(nullable=false, length = 20)
	private String listNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date listDate;

	@Enumerated(EnumType.STRING)
	private AppliedEntityListState appliedEntityListState;

	@Enumerated(EnumType.STRING)
	private AppliedEntityListType appliedEntityListType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creditOrderId", nullable = false)
	private CreditOrder creditOrder;

	public String getListNumber() {
		return listNumber;
	}

	public void setListNumber(String listNumber) {
		this.listNumber = listNumber;
	}

	public Date getListDate() {
		return listDate;
	}

	public void setListDate(Date listDate) {
		this.listDate = listDate;
	}

	public AppliedEntityListState getAppliedEntityListState() {
		return appliedEntityListState;
	}

	public void setAppliedEntityListState(AppliedEntityListState appliedEntityListState) {
		this.appliedEntityListState = appliedEntityListState;
	}

	public AppliedEntityListType getAppliedEntityListType() {
		return appliedEntityListType;
	}

	public void setAppliedEntityListType(AppliedEntityListType appliedEntityListType) {
		this.appliedEntityListType = appliedEntityListType;
	}

	public CreditOrder getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(CreditOrder creditOrder) {
		this.creditOrder = creditOrder;
	}
}


