package kg.gov.mf.loan.manage.model.debtor;

import javax.persistence.*;

import kg.gov.mf.loan.admin.org.model.Address;
import kg.gov.mf.loan.admin.org.model.Organization;
import kg.gov.mf.loan.admin.org.model.Person;
import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="owner")
public class Owner extends GenericModel{

	private long entityId;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private OwnerType ownerType;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name="addressId")
	private Address address;
	
	public Owner() {
	}
	
	public Owner(OwnerType type, Person p)
	{
		this.ownerType = type;
		this.entityId = p.getId();
		this.name = p.getName();
		this.address = p.getAddress();
	}
	
	public Owner(OwnerType type, Organization o)
	{
		this.ownerType = type;
		this.entityId = o.getId();
		this.name = o.getName();
		this.address = o.getAddress();
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
