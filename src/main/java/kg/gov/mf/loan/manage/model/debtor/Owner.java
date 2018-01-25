package kg.gov.mf.loan.manage.model.debtor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import kg.gov.mf.loan.admin.org.model.Organization;
import kg.gov.mf.loan.admin.org.model.Person;
import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="debtorOwner")
public class Owner extends GenericModel{

	private long entityId;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private OwnerType ownerType;
	
	public Owner() {
	}
	
	public Owner(OwnerType type, Person p)
	{
		this.ownerType = type;
		this.entityId = p.getId();
		this.name = p.getName();
	}
	
	public Owner(OwnerType type, Organization o)
	{
		this.ownerType = type;
		this.entityId = o.getId();
		this.name = o.getName();
	}
	
	public void setEntityId(long entityId)
	{
		this.entityId = entityId;
	}
	
	public long getEntityId(){
		return this.entityId;
	}

	public OwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(OwnerType ownerType) {
		this.ownerType = ownerType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
