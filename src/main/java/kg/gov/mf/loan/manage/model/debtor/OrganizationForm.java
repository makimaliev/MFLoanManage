package kg.gov.mf.loan.manage.model.debtor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="org_form")
public class OrganizationForm {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=20)	
	private String name;
	
	public OrganizationForm() {
	}
	
	public OrganizationForm(String name) {
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
