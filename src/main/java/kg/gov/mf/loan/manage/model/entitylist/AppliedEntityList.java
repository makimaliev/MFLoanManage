package kg.gov.mf.loan.manage.model.entitylist;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="appliedEntityList")
public class AppliedEntityList extends GenericModel{

	@Column(nullable=false, length = 20)
	private String listNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date listDate;

	@ManyToOne(targetEntity=AppliedEntityListState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="appliedEntityListStateId")
	private AppliedEntityListState appliedEntityListState;
	
	@ManyToOne(targetEntity=AppliedEntityListType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="appliedEntityListTypeId")
	private AppliedEntityListType appliedEntityListType;
	
	@OneToMany(mappedBy = "appliedEntityList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AppliedEntity> appliedEntities = new HashSet<AppliedEntity>();
	
	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.LAZY)
    @JoinColumn(name="creditOrderId")
    CreditOrder creditOrder;

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

	public Set<AppliedEntity> getAppliedEntities() {
		return appliedEntities;
	}

	public void setAppliedEntities(Set<AppliedEntity> appliedEntities) {
		this.appliedEntities = appliedEntities;
	}
}


