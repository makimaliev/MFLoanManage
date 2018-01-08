package kg.gov.mf.loan.manage.model.collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_type")
public class EventType {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=20)	
	private String name;
	
	public EventType() {
	}

	public EventType(String name) {
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
