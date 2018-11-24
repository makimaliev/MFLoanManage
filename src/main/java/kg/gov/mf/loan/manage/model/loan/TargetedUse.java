package kg.gov.mf.loan.manage.model.loan;

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
@Table(name="targetedUse")
public class TargetedUse extends GenericModel{

	private long targetedUseResultId;
	
	private long createdById;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date createdDate;
	
	private long approvedById;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date approvedDate;
	
	private long checkedById;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date checkedDate;
	
	private long attachmentId;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.LAZY)
    @JoinColumn(name="loanId")
    Loan loan;

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
