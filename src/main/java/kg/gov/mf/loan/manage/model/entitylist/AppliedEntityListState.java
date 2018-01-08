package kg.gov.mf.loan.manage.model.entitylist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="applied_entity_list_state")
public class AppliedEntityListState {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@NotEmpty
	@Column(name="name", nullable=false, length=20)	
	private String name;
	
	public AppliedEntityListState()
	{
		
	}
	
	public AppliedEntityListState(String name) {
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
	
}
