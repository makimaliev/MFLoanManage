package kg.gov.mf.loan.manage.model.entity;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Entity
@Table(name="appliedEntity")
public class AppliedEntity extends BaseModel {
	
	@Column(nullable=false, length=40)
	private String name;

	@Enumerated(EnumType.STRING)
	private AppliedEntityState appliedEntityState;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appliedEntityListId", nullable = false)
	AppliedEntityList appliedEntityList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppliedEntityState getAppliedEntityState() {
		return appliedEntityState;
	}

	public void setAppliedEntityState(AppliedEntityState appliedEntityState) {
		this.appliedEntityState = appliedEntityState;
	}

	public AppliedEntityList getAppliedEntityList() {
		return appliedEntityList;
	}

	public void setAppliedEntityList(AppliedEntityList appliedEntityList) {
		this.appliedEntityList = appliedEntityList;
	}
}
