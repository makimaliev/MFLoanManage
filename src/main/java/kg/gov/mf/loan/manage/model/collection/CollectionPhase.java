package kg.gov.mf.loan.manage.model.collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.GenericModel;
import kg.gov.mf.loan.manage.model.loan.Loan;

@Entity
@Table(name="collectionPhase")
public class CollectionPhase extends GenericModel{

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date startDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date closeDate;
	
	private long lastEvent;
	private long lastStatusId;
	
	@ManyToOne(targetEntity=CollectionProcedure.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collectionProcedureId")
	CollectionProcedure collectionProcedure;
	
	@ManyToOne(targetEntity=PhaseStatus.class, fetch = FetchType.EAGER)
	@JoinColumn(name="phaseStatusId")
	private PhaseStatus phaseStatus;
	
	@ManyToOne(targetEntity=PhaseType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="phaseTypeId")
	private PhaseType phaseType;
	
	@OneToMany(mappedBy = "collectionPhase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Loan> loans = new HashSet<Loan>();
	
	@OneToMany(mappedBy = "collectionPhase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CollectionEvent> collectionEvents = new HashSet<CollectionEvent>();
	
	@OneToOne(mappedBy = "collectionPhase", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private PhaseDetails phaseDetails;

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

	public long getLastEvent() {
		return lastEvent;
	}

	public void setLastEvent(long lastEvent) {
		this.lastEvent = lastEvent;
	}

	public long getLastStatusId() {
		return lastStatusId;
	}

	public void setLastStatusId(long lastStatusId) {
		this.lastStatusId = lastStatusId;
	}

	public CollectionProcedure getCollectionProcedure() {
		return collectionProcedure;
	}

	public void setCollectionProcedure(CollectionProcedure collectionProcedure) {
		this.collectionProcedure = collectionProcedure;
	}

	public PhaseStatus getPhaseStatus() {
		return phaseStatus;
	}

	public void setPhaseStatus(PhaseStatus phaseStatus) {
		this.phaseStatus = phaseStatus;
	}

	public PhaseType getPhaseType() {
		return phaseType;
	}

	public void setPhaseType(PhaseType phaseType) {
		this.phaseType = phaseType;
	}

	public Set<CollectionEvent> getCollectionEvents() {
		return collectionEvents;
	}

	public void setCollectionEvents(Set<CollectionEvent> collectionEvents) {
		this.collectionEvents = collectionEvents;
	}

	public Set<Loan> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	public PhaseDetails getPhaseDetails() {
		return phaseDetails;
	}

	public void setPhaseDetails(PhaseDetails phaseDetails) {
		this.phaseDetails = phaseDetails;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 83 * hash + Objects.hashCode(this.getId());
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CollectionPhase other = (CollectionPhase) obj;


		if(this.getId()!=0)
		if (!Objects.equals(this.getId(), other.getId())) {
			return false;
		}

		if (!Objects.equals(this.startDate, other.startDate)) {
			return false;
		}

		return true;
	}
	
}
