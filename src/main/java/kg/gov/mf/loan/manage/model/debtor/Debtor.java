package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="debtor")
public class Debtor extends GenericModel{

	@Column(nullable=false, length = 200)
	private String name;
	
	@ManyToOne(targetEntity=DebtorType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="debtorTypeId")
	private DebtorType debtorType;
	
	@ManyToOne(targetEntity=OrganizationForm.class, fetch = FetchType.LAZY)
	@JoinColumn(name="orgFormId")
	private OrganizationForm orgForm;
	
	@ManyToOne(targetEntity=WorkSector.class, fetch = FetchType.LAZY)
	@JoinColumn(name="workSectorId")
	WorkSector workSector;
	
	@OneToOne
    @JoinColumn(name="ownerId")
    Owner owner;

	@Column
	private long address_id;
	
	@OneToMany(mappedBy = "debtor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Loan> loans;

	@Column(columnDefinition = "TEXT")
	private String description;

	@ManyToOne(targetEntity=DebtorGroup.class, fetch = FetchType.LAZY)
	@JoinColumn(name="debtorGroupId")
	DebtorGroup debtorGroup;

	@ManyToOne(targetEntity=DebtorSubGroup.class, fetch = FetchType.LAZY)
	@JoinColumn(name="debtorSubGroupId")
	DebtorSubGroup debtorSubGroup;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DebtorType getDebtorType() {
		return debtorType;
	}

	public void setDebtorType(DebtorType debtorType) {
		this.debtorType = debtorType;
	}

	public OrganizationForm getOrgForm() {
		return orgForm;
	}

	public void setOrgForm(OrganizationForm orgForm) {
		this.orgForm = orgForm;
	}

	public WorkSector getWorkSector() {
		return workSector;
	}

	public void setWorkSector(WorkSector workSector) {
		this.workSector = workSector;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DebtorGroup getDebtorGroup() {
		return debtorGroup;
	}

	public void setDebtorGroup(DebtorGroup debtorGroup) {
		this.debtorGroup = debtorGroup;
	}

	public DebtorSubGroup getDebtorSubGroup() {
		return debtorSubGroup;
	}

	public void setDebtorSubGroup(DebtorSubGroup debtorSubGroup) {
		this.debtorSubGroup = debtorSubGroup;
	}
}
