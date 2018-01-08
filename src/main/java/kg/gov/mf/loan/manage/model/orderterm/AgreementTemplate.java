package kg.gov.mf.loan.manage.model.orderterm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="agreement_template")
public class AgreementTemplate {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=50)
	private String name;
	
	@ManyToOne
	private OrderTerm orderTerm;
	
	@Column(name="created_by", nullable=false)
	private long createdBy;
	
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
	
	public AgreementTemplate()
	{
		
	}
	
	public AgreementTemplate(String name, long createdBy, Date createdDate, String createdDescription, long approvedBy,
			Date approvedDate, String approvedDescription) {
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.createdDescription = createdDescription;
		this.approvedBy = approvedBy;
		this.approvedDate = approvedDate;
		this.approvedDescription = approvedDescription;
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

	public OrderTerm getOrderTerm() {
		return orderTerm;
	}

	public void setOrderTerm(OrderTerm orderTerm) {
		this.orderTerm = orderTerm;
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
	
}
