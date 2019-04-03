package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="collectionPhase")
public class CollectionPhase extends GenericModel{

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date startDate;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date closeDate;
	
	private long lastEvent;
	private long lastStatusId;

	private String docNumber;
	private String resultDocNumber;

	
	@ManyToOne(targetEntity=CollectionProcedure.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collectionProcedureId")
	CollectionProcedure collectionProcedure;
	
	@ManyToOne(targetEntity=PhaseStatus.class, fetch = FetchType.LAZY)
	@JoinColumn(name="phaseStatusId")
	private PhaseStatus phaseStatus;
	
	@ManyToOne(targetEntity=PhaseType.class, fetch = FetchType.LAZY)
	@JoinColumn(name="phaseTypeId")
	private PhaseType phaseType;

	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinTable(
			name="loanCollectionPhase",
			joinColumns = { @JoinColumn(name = "collectionPhaseId") },
			inverseJoinColumns = { @JoinColumn(name = "loanId") })
	Set<Loan> loans = new HashSet<Loan>();
	
	@OneToMany(mappedBy = "collectionPhase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CollectionEvent> collectionEvents = new HashSet<CollectionEvent>();
	
	@OneToMany(mappedBy = "collectionPhase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PhaseDetails> phaseDetails = new HashSet<PhaseDetails>();

	@ManyToOne(targetEntity=CollectionPhaseGroup.class, fetch = FetchType.LAZY)
	@JoinColumn(name="collectionPhaseGroupId")
	CollectionPhaseGroup collectionPhaseGroup;

	@ManyToOne(targetEntity=CollectionPhaseIndex.class, fetch = FetchType.LAZY)
	@JoinColumn(name="collectionPhaseIndexId")
	CollectionPhaseIndex collectionPhaseIndex;

	private Long department_id;
	private Long sub_index_id;
	private Double start_amount;
	private Double close_amount;
	private Double paid;

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date paymentFromDate;

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

	public Set<PhaseDetails> getPhaseDetails() {
		return phaseDetails;
	}

	public void setPhaseDetails(Set<PhaseDetails> phaseDetails) {
		this.phaseDetails = phaseDetails;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getResultDocNumber() {
		return resultDocNumber;
	}

	public void setResultDocNumber(String resultDocNumber) {
		this.resultDocNumber = resultDocNumber;
	}

	public CollectionPhaseGroup getCollectionPhaseGroup() {
		return collectionPhaseGroup;
	}

	public void setCollectionPhaseGroup(CollectionPhaseGroup collectionPhaseGroup) {
		this.collectionPhaseGroup = collectionPhaseGroup;
	}

	public CollectionPhaseIndex getCollectionPhaseIndex() {
		return collectionPhaseIndex;
	}

	public void setCollectionPhaseIndex(CollectionPhaseIndex collectionPhaseIndex) {
		this.collectionPhaseIndex = collectionPhaseIndex;
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

	public Long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}

	public Long getSub_index_id() {
		return sub_index_id;
	}

	public void setSub_index_id(Long sub_index_id) {
		this.sub_index_id = sub_index_id;
	}

	public Double getStart_amount() {
		return start_amount;
	}

	public void setStart_amount(Double start_amount) {
		this.start_amount = start_amount;
	}

	public Double getClose_amount() {
		return close_amount;
	}

	public void setClose_amount(Double close_amount) {
		this.close_amount = close_amount;
	}

	public Double getPaid() {
		return paid;
	}

	public void setPaid(Double paid) {
		this.paid = paid;
	}

	public Date getPaymentFromDate() {
		return paymentFromDate;
	}

	public void setPaymentFromDate(Date paymentFromDate) {
		this.paymentFromDate = paymentFromDate;
	}
}
