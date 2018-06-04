package kg.gov.mf.loan.manage.model.collection;

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

import kg.gov.mf.loan.manage.model.GenericModel;

@Entity
@Table(name="collectionProcedure")
public class CollectionProcedure extends GenericModel{

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date closeDate;
	
	private long lastPhase;
	private long lastStatusId;

	@ManyToOne(targetEntity=ProcedureStatus.class, fetch = FetchType.EAGER)
	@JoinColumn(name="procedureStatusId")
	private ProcedureStatus procedureStatus;
	
	@ManyToOne(targetEntity=ProcedureType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="procedureTypeId")
	private ProcedureType procedureType;
	
	@OneToMany(mappedBy = "collectionProcedure", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<CollectionPhase> collectionPhases = new HashSet<CollectionPhase>();

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public long getLastPhase() {
		return lastPhase;
	}

	public void setLastPhase(long lastPhase) {
		this.lastPhase = lastPhase;
	}

	public long getLastStatusId() {
		return lastStatusId;
	}

	public void setLastStatusId(long lastStatusId) {
		this.lastStatusId = lastStatusId;
	}

	public ProcedureStatus getProcedureStatus() {
		return procedureStatus;
	}

	public void setProcedureStatus(ProcedureStatus procedureStatus) {
		this.procedureStatus = procedureStatus;
	}

	public ProcedureType getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(ProcedureType procedureType) {
		this.procedureType = procedureType;
	}

	public Set<CollectionPhase> getCollectionPhases() {
		return collectionPhases;
	}

	public void setCollectionPhases(Set<CollectionPhase> collectionPhases) {
		this.collectionPhases = collectionPhases;
	}
	
}
