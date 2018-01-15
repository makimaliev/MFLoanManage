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

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="agreementTemplate")
public class AgreementTemplate extends GenericModel {

	@Column(name="name", nullable=false, length=50)
	private String name;
	
	@Column(name="created_by", nullable=false)
	private long createdBy;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	
	@Column(name="created_description", length=200)
	private String createdDescription;
	
	@Column(name="approved_by", nullable=false)
	private long approvedBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="approved_date", nullable=false)
	private Date approvedDate;
	
	@Column(name="approved_description", length=200)
	private String approvedDescription;
	
	@ManyToOne(targetEntity=OrderTerm.class, fetch = FetchType.EAGER)
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
