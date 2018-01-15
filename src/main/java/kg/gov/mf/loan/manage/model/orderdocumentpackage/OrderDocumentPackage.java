package kg.gov.mf.loan.manage.model.orderdocumentpackage;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.order.CreditOrder;
import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;

@Entity
@Table(name="orderDocumentPackage")
public class OrderDocumentPackage extends GenericModel {

	@Column(name="name", nullable=false, length = 50)
	private String name;
	
	@ManyToOne(targetEntity=CreditOrder.class, fetch = FetchType.EAGER)
    @JoinColumn(name="creditOrderId")
    CreditOrder creditOrder;
	
	@OneToMany(mappedBy = "orderDocumentPackage", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<OrderDocument> orderDocuments = new HashSet<OrderDocument>();

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

	public Set<OrderDocument> getOrderDocuments() {
		return orderDocuments;
	}

	public void setOrderDocuments(Set<OrderDocument> orderDocuments) {
		this.orderDocuments = orderDocuments;
	}
}
