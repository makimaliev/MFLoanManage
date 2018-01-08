package kg.gov.mf.loan.manage.model.entitylist;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="applied_entity_list")
public class AppliedEntityList {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="list_number", nullable=false, length = 20)
	private String listNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="list_date", nullable=false)
	private Date listDate;
	
	@OneToOne
	@JoinColumn(name="applied_entity_list_state_id")
	private AppliedEntityListState appliedEntityListState;
	
	@OneToOne
	@JoinColumn(name="applied_entity_list_type_id")
	private AppliedEntityListType appliedEntityListType;
	
	@ManyToOne
	private CreditOrder creditOrder;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="appliedEntityList_id")
	private Set<AppliedEntity> appliedEntity;
	
	public AppliedEntityList()
	{
		
	}
	
	public AppliedEntityList(String listNumber, Date listDate, AppliedEntityListState appliedEntityListState,
			AppliedEntityListType appliedEntityListType) {
		this.listNumber = listNumber;
		this.listDate = listDate;
		this.appliedEntityListState = appliedEntityListState;
		this.appliedEntityListType = appliedEntityListType;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "AppliedEntityList [id=" + id + ", listNumber=" + listNumber + ", listDate=" + listDate
				+ ", appliedEntityListState=" + appliedEntityListState + ", appliedEntityListType="
				+ appliedEntityListType + "]";
	}

	public Set<AppliedEntity> getAppliedEntity() {
		return appliedEntity;
	}

	public void setAppliedEntity(Set<AppliedEntity> appliedEntity) {
		this.appliedEntity = appliedEntity;
	}
}
