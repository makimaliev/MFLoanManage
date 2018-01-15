package kg.gov.mf.loan.manage.model.debtor;

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
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="debtor")
public class Debtor extends GenericModel{

	@Column(name="name", nullable=false, length = 50)
	private String name;
	
	@ManyToOne(targetEntity=DebtorType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="debtor_type_id")
	private DebtorType debtorType;
	
	@ManyToOne(targetEntity=OrganizationForm.class, fetch = FetchType.EAGER)
	@JoinColumn(name="org_form_id")
	private OrganizationForm orgForm;
	
	@ManyToOne(targetEntity=WorkSector.class, fetch = FetchType.EAGER)
	@JoinColumn(name="work_sector_id")
	WorkSector workSector;
	
	@OneToMany(mappedBy = "debtor", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<Loan> loans = new HashSet<Loan>();

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
	
}
