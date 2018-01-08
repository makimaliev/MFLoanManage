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
@Table(name="bankrupt")
public class Bankrupt {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="started_on_date", nullable=false)
	private Date startedOnDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="finished_on_date", nullable=false)
	private Date finishedOnDate;
	
	@ManyToOne
	private Loan loan;
	
	public Bankrupt()
	{
		
	}

	public Bankrupt(Date startedOnDate, Date finishedOnDate) {
		this.startedOnDate = startedOnDate;
		this.finishedOnDate = finishedOnDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartedOnDate() {
		return startedOnDate;
	}

	public void setStartedOnDate(Date startedOnDate) {
		this.startedOnDate = startedOnDate;
	}

	public Date getFinishedOnDate() {
		return finishedOnDate;
	}

	public void setFinishedOnDate(Date finishedOnDate) {
		this.finishedOnDate = finishedOnDate;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
}
