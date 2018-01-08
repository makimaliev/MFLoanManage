package kg.gov.mf.loan.manage.model.loan;

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
@Table(name="targeted_use")
public class TargetedUse {

	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="targeted_use_result_id")
	private long targetedUseResultId;
	
	@Column(name="created_by_id")
	private long createdById;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	
	@Column(name="approved_by_id")
	private long approvedById;
	
	@Temporal(TemporalType.DATE)
	@Column(name="approved_date", nullable=false)
	private Date approvedDate;
	
	@Column(name="checked_by_id")
	private long checkedById;
	
	@Temporal(TemporalType.DATE)
	@Column(name="checked_date", nullable=false)
	private Date checkedDate;
	
	@Column(name="attachmentId")
	private long attachmentId;
	
	@ManyToOne
	private Loan loan;
	
	public TargetedUse()
	{
		
	}

	public TargetedUse(long targetedUseResultId, long createdById, Date createdDate, long approvedById,
			Date approvedDate, long checkedById, Date checkedDate, long attachmentId) {
		this.targetedUseResultId = targetedUseResultId;
		this.createdById = createdById;
		this.createdDate = createdDate;
		this.approvedById = approvedById;
		this.approvedDate = approvedDate;
		this.checkedById = checkedById;
		this.checkedDate = checkedDate;
		this.attachmentId = attachmentId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTargetedUseResultId() {
		return targetedUseResultId;
	}

	public void setTargetedUseResultId(long targetedUseResultId) {
		this.targetedUseResultId = targetedUseResultId;
	}

	public long getCreatedById() {
		return createdById;
	}

	public void setCreatedById(long createdById) {
		this.createdById = createdById;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getApprovedById() {
		return approvedById;
	}

	public void setApprovedById(long approvedById) {
		this.approvedById = approvedById;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public long getCheckedById() {
		return checkedById;
	}

	public void setCheckedById(long checkedById) {
		this.checkedById = checkedById;
	}

	public Date getCheckedDate() {
		return checkedDate;
	}

	public void setCheckedDate(Date checkedDate) {
		this.checkedDate = checkedDate;
	}

	public long getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
