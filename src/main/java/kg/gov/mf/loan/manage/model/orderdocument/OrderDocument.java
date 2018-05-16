package kg.gov.mf.loan.manage.model.orderdocument;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;

@Entity
@Table(name="orderDocument")
public class OrderDocument extends BaseModel {

	@Column(nullable=false, length=50)	
	private String name;

	@Enumerated(EnumType.STRING)
	private OrderDocumentType orderDocumentType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderDocumentPackageId", nullable = false)
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
