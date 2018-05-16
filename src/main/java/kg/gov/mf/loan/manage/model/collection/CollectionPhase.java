package kg.gov.mf.loan.manage.model.collection;

import java.util.Date;
import java.util.Objects;
import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="collectionPhase")
public class CollectionPhase extends BaseModel {

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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "collectionProcedureId", nullable = false)
	CollectionProcedure collectionProcedure;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phaseStatusId", nullable = false)
	private PhaseStatus phaseStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "phaseTypeId", nullable = false)
	private PhaseType phaseType;

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
