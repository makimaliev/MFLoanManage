package kg.gov.mf.loan.manage.model.order;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Entity
@Table(name="credit_order")
public class CreditOrder {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="reg_number", nullable=false, length = 20)
	private String regNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="reg_date", nullable=false)
	private Date regDate;
	
	@Column(name="description")
	private String description;
	
	@OneToOne
	@JoinColumn(name="credit_order_state_id")
	private CreditOrderState creditOrderState;
	
	@OneToOne
	@JoinColumn(name="credit_order_type_id")
	private CreditOrderType creditOrderType;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrder_id")
	private Set<AppliedEntityList> appliedEntityList;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrder_id")
	private Set<OrderDocumentPackage> orderDocumentPackage;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrder_id")
	private Set<OrderTerm> orderTerm;
	
	public CreditOrder()
	{
		
	}
	
	public CreditOrder(String regNumber, Date regDate, String description,
			CreditOrderState creditOrderState, CreditOrderType creditOrderType) {
		this.regNumber = regNumber;
		this.regDate = regDate;
		this.description = description;
		this.creditOrderState = creditOrderState;
		this.creditOrderType = creditOrderType;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRegNumber() {
		return regNumber;
	}
	
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public CreditOrderState getCreditOrderState() {
		return creditOrderState;
	}
	
	public void setCreditOrderState(CreditOrderState creditOrderState) {
		this.creditOrderState = creditOrderState;
	}
	
	public CreditOrderType getCreditOrderType() {
		return creditOrderType;
	}
	
	public void setCreditOrderType(CreditOrderType creditOrderType) {
		this.creditOrderType = creditOrderType;
	}

	@Override
	public String toString() {
		return "CreditOrder [id=" + id + ", regNumber=" + regNumber + ", regDate=" + regDate + ", description="
				+ description + ", creditOrderState=" + creditOrderState + ", creditOrderType=" + creditOrderType + "]";
	}
	
	public Set<AppliedEntityList> getAppliedEntityList() {
		return appliedEntityList;
	}

	public void setAppliedEntityList(Set<AppliedEntityList> appliedEntityList) {
		this.appliedEntityList = appliedEntityList;
	}

	public Set<OrderDocumentPackage> getOrderDocumentPackage() {
		return orderDocumentPackage;
	}

	public void setOrderDocumentPackage(Set<OrderDocumentPackage> orderDocumentPackage) {
		this.orderDocumentPackage = orderDocumentPackage;
	}

	public Set<OrderTerm> getOrderTerm() {
		return orderTerm;
	}

	public void setOrderTerm(Set<OrderTerm> orderTerm) {
		this.orderTerm = orderTerm;
	}
}
