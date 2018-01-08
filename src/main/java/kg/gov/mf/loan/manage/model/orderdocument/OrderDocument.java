package kg.gov.mf.loan.manage.model.orderdocument;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Entity
@Table(name="order_document")
public class OrderDocument {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=50)	
	private String name;
	
	@OneToOne
	@JoinColumn(name="order_document_type_id")
	private OrderDocumentType orderDocumentType;
	
	@ManyToOne
	private OrderDocumentPackage orderDocumentPackage;
	
	public OrderDocument() {
	}

	public OrderDocument(String name, OrderDocumentType orderDocumentType) {
		this.name = name;
		this.orderDocumentType = orderDocumentType;
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

	public OrderDocumentType getOrderDocumentType() {
		return orderDocumentType;
	}

	public void setOrderDocumentType(OrderDocumentType orderDocumentType) {
		this.orderDocumentType = orderDocumentType;
	}

	public OrderDocumentPackage getOrderDocumentPackage() {
		return orderDocumentPackage;
	}

	public void setOrderDocumentPackage(OrderDocumentPackage orderDocumentPackage) {
		this.orderDocumentPackage = orderDocumentPackage;
	}
}
