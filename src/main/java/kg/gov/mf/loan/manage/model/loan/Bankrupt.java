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

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="bankrupt")
public class Bankrupt extends GenericModel{
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="started_on_date", nullable=false)
	private Date startedOnDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="finished_on_date", nullable=false)
	private Date finishedOnDate;
	
	@ManyToOne(targetEntity=Loan.class, fetch = FetchType.EAGER)
    @JoinColumn(name="loanId")
    Loan loan;

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
