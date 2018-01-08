package kg.gov.mf.loan.manage.model.entitydocument;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Entity
@Table(name="entity_document")
public class EntityDocument {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=50)	
	private String name;
	
	@Column(name="completed_by", nullable=false)
	private long completedBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="completed_date", nullable=false)
	private Date completedDate;
	
	@Column(name="completed_description", length = 100)
	private String completedDescription;
	
	@Column(name="approved_by", nullable=false)
	private long approvedBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="approved_date", nullable=false)
	private Date approvedDate;
	
	@Column(name="approved_description", length = 100)
	private String approvedDescription;
	
	@Column(name="registered_number", length = 20)
	private String registeredNumber;
	
	@Temporal(TemporalType.DATE)
	@Column(name="registered_date", nullable=false)
	private Date registeredDate;
	
	@Column(name="registered_description", length = 100)
	private String registeredDescription;
	
	@OneToOne
	@JoinColumn(name="entity_document_registered_by_id")
	private EntityDocumentRegisteredBy registeredBy;
	
	@OneToOne
	@JoinColumn(name="entity_document_state_id")
	private EntityDocumentState entityDocumentState;
	
	@ManyToOne
	private DocumentPackage documentPackage;
	
	public EntityDocument()
	{
		
	}
	
	public EntityDocument(String name, long completedBy, Date completedDate, String completedDescription, long approvedBy,
			Date approvedDate, String approvedDescription, String registeredNumber, Date registeredDate,
			String registeredDescription, EntityDocumentRegisteredBy registeredBy,
			EntityDocumentState entityDocumentState) {
		this.name = name;
		this.completedBy = completedBy;
		this.completedDate = completedDate;
		this.completedDescription = completedDescription;
		this.approvedBy = approvedBy;
		this.approvedDate = approvedDate;
		this.approvedDescription = approvedDescription;
		this.registeredNumber = registeredNumber;
		this.registeredDate = registeredDate;
		this.registeredDescription = registeredDescription;
		this.registeredBy = registeredBy;
		this.entityDocumentState = entityDocumentState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCompletedBy() {
		return completedBy;
	}

	public void setCompletedBy(long completedBy) {
		this.completedBy = completedBy;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public String getCompletedDescription() {
		return completedDescription;
	}

	public void setCompletedDescription(String completedDescription) {
		this.completedDescription = completedDescription;
	}

	public long getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(long approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getApprovedDescription() {
		return approvedDescription;
	}

	public void setApprovedDescription(String approvedDescription) {
		this.approvedDescription = approvedDescription;
	}

	public String getRegisteredNumber() {
		return registeredNumber;
	}

	public void setRegisteredNumber(String registeredNumber) {
		this.registeredNumber = registeredNumber;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getRegisteredDescription() {
		return registeredDescription;
	}

	public void setRegisteredDescription(String registeredDescription) {
		this.registeredDescription = registeredDescription;
	}

	public EntityDocumentRegisteredBy getRegisteredBy() {
		return registeredBy;
	}

	public void setRegisteredBy(EntityDocumentRegisteredBy registeredBy) {
		this.registeredBy = registeredBy;
	}

	public EntityDocumentState getEntityDocumentState() {
		return entityDocumentState;
	}

	public void setEntityDocumentState(EntityDocumentState entityDocumentState) {
		this.entityDocumentState = entityDocumentState;
	}

	public DocumentPackage getDocumentPackage() {
		return documentPackage;
	}

	public void setDocumentPackage(DocumentPackage documentPackage) {
		this.documentPackage = documentPackage;
	}

}
