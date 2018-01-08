package kg.gov.mf.loan.manage.model.collection;

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
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collection")
public class Collection {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@ManyToOne
	private Loan loan;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="debtor_id")
	private Set<CollectionProcedure> procedure;
	
	public Collection() 
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Set<CollectionProcedure> getProcedure() {
		return procedure;
	}

	public void setProcedure(Set<CollectionProcedure> procedure) {
		this.procedure = procedure;
	}
	
}
