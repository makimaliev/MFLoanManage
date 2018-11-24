package kg.gov.mf.loan.manage.model.order;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;
import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Entity
@Table(name="creditOrder")
public class CreditOrder extends GenericModel {
	
	@Column(nullable=false, length = 100)
	private String regNumber;
	private String description;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date regDate;
	
	@ManyToOne(targetEntity=CreditOrderState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrderStateId")
	private CreditOrderState creditOrderState;
	
	@ManyToOne(targetEntity=CreditOrderType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="creditOrderTypeId")
	private CreditOrderType creditOrderType;
	
	@OneToMany(mappedBy = "creditOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<AppliedEntityList> appliedEntityLists = new HashSet<AppliedEntityList>();
	
	@OneToMany(mappedBy = "creditOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderDocumentPackage> orderDocumentPackages = new HashSet<OrderDocumentPackage>();
	
	@OneToMany(mappedBy = "creditOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderTerm> orderTerms = new HashSet<OrderTerm>();

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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

	public Set<AppliedEntityList> getAppliedEntityLists() {
		return appliedEntityLists;
	}

	public void setAppliedEntityLists(Set<AppliedEntityList> appliedEntityLists) {
		this.appliedEntityLists = appliedEntityLists;
	}

	public Set<OrderDocumentPackage> getOrderDocumentPackages() {
		return orderDocumentPackages;
	}

	public void setOrderDocumentPackages(Set<OrderDocumentPackage> orderDocumentPackages) {
		this.orderDocumentPackages = orderDocumentPackages;
	}

	public Set<OrderTerm> getOrderTerms() {
		return orderTerms;
	}

	public void setOrderTerms(Set<OrderTerm> orderTerms) {
		this.orderTerms = orderTerms;
	}
	
}