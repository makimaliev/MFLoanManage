package kg.gov.mf.loan.manage.model.orderdocument;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Entity
@Table(name="orderDocument")
public class OrderDocument extends GenericModel {

	@Column(name="name", nullable=false, length=50)	
	private String name;
	
	@ManyToOne(targetEntity=OrderDocumentType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="order_document_type_id")
	private OrderDocumentType orderDocumentType;
	
	@ManyToOne(targetEntity=OrderDocumentPackage.class, fetch = FetchType.EAGER)
    @JoinColumn(name="orderDocumentPackageId")
	OrderDocumentPackage orderDocumentPackage;

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
