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
@Table(name="reconstructed_list")
public class ReconstructedList {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="on_date", nullable=false)
	private Date onDate;
	
	@Column(name="old_loan_id")
	private long oldLoanId;
	
	@ManyToOne
	private Loan loan;
	
	public ReconstructedList()
	{
		
	}

	public ReconstructedList(Date onDate, long oldLoanId) {
		this.onDate = onDate;
		this.oldLoanId = oldLoanId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public long getOldLoanId() {
		return oldLoanId;
	}

	public void setOldLoanId(long oldLoanId) {
		this.oldLoanId = oldLoanId;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
