package kg.gov.mf.loan.manage.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Entity
@Table(name="appliedEntity")
public class AppliedEntity extends GenericModel {

	@OneToOne
	@JoinColumn(name="ownerId")
	Owner owner;
	
	@ManyToOne(targetEntity=AppliedEntityState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="appliedEntityStateId")
	private AppliedEntityState appliedEntityState;
	
	@OneToMany(mappedBy = "appliedEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<DocumentPackage> documentPackages = new HashSet<DocumentPackage>();
	
	@ManyToOne(targetEntity=AppliedEntityList.class, fetch = FetchType.LAZY)
    @JoinColumn(name="appliedEntityListId")
	AppliedEntityList appliedEntityList;

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
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
