package kg.gov.mf.loan.manage.model.orderterm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.task.model.GenericModel;

@Entity
@Table(name="agreementTemplate")
public class AgreementTemplate extends GenericModel {

	@Column(nullable=false, length=50)
	private String name;
	
	@Column(nullable=false)
	private long createdBy;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date createdDate;
	
	@Column(length=200)
	private String createdDescription;
	
	@Column(nullable=false)
	private long approvedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date approvedDate;
	
	@Column(length=200)
	private String approvedDescription;
	
	@ManyToOne(targetEntity=OrderTerm.class, fetch = FetchType.LAZY)
    @JoinColumn(name="orderTermId")
    OrderTerm orderTerm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedDescription() {
		return createdDescription;
	}

	public void setCreatedDescription(String createdDescription) {
		this.createdDescription = createdDescription;
	}

	public long getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(long approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getApprovedDescription() {
		return approvedDescription;
	}

	public void setApprovedDescription(String approvedDescription) {
		this.approvedDescription = approvedDescription;
	}

	public OrderTerm getOrderTerm() {
		return orderTerm;
	}

	public void setOrderTerm(OrderTerm orderTerm) {
		this.orderTerm = orderTerm;
	}
}
