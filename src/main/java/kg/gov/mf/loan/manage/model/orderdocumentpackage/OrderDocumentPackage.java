package kg.gov.mf.loan.manage.model.orderdocumentpackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.BaseModel;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Entity
@Table(name="orderDocumentPackage")
public class OrderDocumentPackage extends BaseModel {

	@Column(nullable=false, length = 50)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creditOrderId", nullable = false)
    CreditOrder creditOrder;
	
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

}
