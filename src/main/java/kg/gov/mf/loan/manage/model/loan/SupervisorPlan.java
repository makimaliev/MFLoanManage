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

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="supervisorPlan")
public class SupervisorPlan extends BaseModel {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date date;
	
	@Column(precision = 12, scale = 5)
	private Double amount;
	
	@Column(precision = 12, scale = 5)
	private Double principal;
	
	@Column(precision = 12, scale = 5)
	private Double interest;
	
	@Column(precision = 12, scale = 5)
	private Double penalty;
	
	@Column(precision = 12, scale = 5)
	private Double fee;
	
	@Column(nullable=true, length=50)
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanId", nullable = false)
    Loan loan;

	@Column(nullable=false)
	private long reg_by_id;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date reg_date;


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getPenalty() {
		return penalty;
	}

	public void setPenalty(Double penalty) {
		this.penalty = penalty;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public long getReg_by_id() {
		return reg_by_id;
	}

	public void setReg_by_id(long reg_by_id) {
		this.reg_by_id = reg_by_id;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
