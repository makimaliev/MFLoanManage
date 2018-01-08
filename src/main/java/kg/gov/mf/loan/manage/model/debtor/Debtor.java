package kg.gov.mf.loan.manage.model.debtor;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Entity
@Table(name="debtor")
public class Debtor {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length = 50)
	private String name;
	
	@OneToOne
	@JoinColumn(name="debtor_type_id")
	private DebtorType debtorType;
	
	@OneToOne
	@JoinColumn(name="org_form_id")
	private OrganizationForm orgForm;
	
	@OneToOne
	@JoinColumn(name="work_sector_id")
	private WorkSector workSector;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="debtor_id")
	private Set<Loan> loan;
	
	public Debtor() {
	}

	public Debtor(String name, DebtorType debtorType, OrganizationForm orgForm, WorkSector workSector) {
		this.name = name;
		this.debtorType = debtorType;
		this.orgForm = orgForm;
		this.workSector = workSector;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Set<Loan> getLoan() {
		return loan;
	}

	public void setLoan(Set<Loan> loan) {
		this.loan = loan;
	}
	
}
