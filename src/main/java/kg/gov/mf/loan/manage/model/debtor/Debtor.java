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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.loan.Loan;
import org.hibernate.search.annotations.*;

@Indexed
@Entity
@Table(name="debtor")
public class Debtor extends GenericModel{

	@Column(nullable=false, length = 200)
    @Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
	private String name;
	
	@ManyToOne(targetEntity=DebtorType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="debtorTypeId")
	private DebtorType debtorType;
	
	@ManyToOne(targetEntity=OrganizationForm.class, fetch = FetchType.EAGER)
	@JoinColumn(name="orgFormId")
	private OrganizationForm orgForm;
	
	@ManyToOne(targetEntity=WorkSector.class, fetch = FetchType.EAGER)
	@JoinColumn(name="workSectorId")
	WorkSector workSector;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="ownerId")
    Owner owner;
	
	@OneToMany(mappedBy = "debtor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
