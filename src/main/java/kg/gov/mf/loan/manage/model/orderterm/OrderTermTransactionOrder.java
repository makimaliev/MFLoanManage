package kg.gov.mf.loan.manage.model.orderterm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_term_transaction_order")
public class OrderTermTransactionOrder {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=40)
	private String name;
	
	public OrderTermTransactionOrder() {
	}

	public OrderTermTransactionOrder(String name) {
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
