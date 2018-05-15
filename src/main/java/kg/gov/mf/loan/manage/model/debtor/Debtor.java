package kg.gov.mf.loan.manage.model.debtor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.gov.mf.loan.manage.model.BaseModel;

import javax.persistence.*;

@Entity
@Table(name="debtor")
public class Debtor extends BaseModel {

	@Column(nullable=false, length = 200)
	private String name;

	@Enumerated(EnumType.STRING)
	private DebtorType debtorType;

	@Enumerated(EnumType.STRING)
	private OrganizationForm organizationForm;

	@Enumerated(EnumType.STRING)
	private WorkSector workSector;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ownerId", nullable = false)
	@JsonIgnore
	private Owner owner;

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

	public OrganizationForm getOrganizationForm() {
		return organizationForm;
	}

	public void setOrganizationForm(OrganizationForm organizationForm) {
		this.organizationForm = organizationForm;
	}

	public WorkSector getWorkSector() {
		return workSector;
	}

	public void setWorkSector(WorkSector workSector) {
		this.workSector = workSector;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
