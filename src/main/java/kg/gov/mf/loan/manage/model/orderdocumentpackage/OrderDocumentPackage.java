package kg.gov.mf.loan.manage.model.orderdocumentpackage;

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

import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

@Entity
@Table(name="order_document_package")
public class OrderDocumentPackage {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length = 50)
	private String name;
	
	@ManyToOne
	private CreditOrder creditOrder;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="orderDocumentPackage_id")
	private Set<OrderDocument> orderDocument;

	public OrderDocumentPackage() {
	}
	
	public OrderDocumentPackage(String name) {
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

	public CreditOrder getCreditOrder() {
		return creditOrder;
	}

	public void setCreditOrder(CreditOrder creditOrder) {
		this.creditOrder = creditOrder;
	}

	public Set<OrderDocument> getOrderDocument() {
		return orderDocument;
	}

	public void setOrderDocument(Set<OrderDocument> orderDocument) {
		this.orderDocument = orderDocument;
	}
}
