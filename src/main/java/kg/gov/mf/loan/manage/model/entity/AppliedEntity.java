package kg.gov.mf.loan.manage.model.entity;

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

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Entity
@Table(name="appliedEntity")
public class AppliedEntity extends GenericModel {
	
	@Column(name="name", nullable=false, length=40)
	private String name;
	
	@ManyToOne(targetEntity=AppliedEntityState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="applied_entity_state_id")
	private AppliedEntityState appliedEntityState;
	
	@OneToMany(mappedBy = "appliedEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<DocumentPackage> documentPackages = new HashSet<DocumentPackage>();
	
	@ManyToOne(targetEntity=AppliedEntityList.class, fetch = FetchType.EAGER)
    @JoinColumn(name="appliedEntityListId")
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

	public Set<DocumentPackage> getDocumentPackages() {
		return documentPackages;
	}

	public void setDocumentPackages(Set<DocumentPackage> documentPackages) {
		this.documentPackages = documentPackages;
	}
	
}
