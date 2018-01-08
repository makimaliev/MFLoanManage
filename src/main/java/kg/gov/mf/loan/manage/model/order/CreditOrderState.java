package kg.gov.mf.loan.manage.model.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="credit_order_state")
public class CreditOrderState {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@NotEmpty
	@Column(name="name", unique=true, nullable=false, length=20)
	private String name;
	
	public CreditOrderState()
	{
		
	}
	
	public CreditOrderState(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CreditOrderState(String name) {
		this.name = name;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditOrderState other = (CreditOrderState) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreditOrderState [id=" + id + ", name=" + name + "]";
	}
}