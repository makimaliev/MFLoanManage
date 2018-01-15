package kg.gov.mf.loan.manage.model.entitydocument;

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
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Entity
@Table(name="entity_document")
public class EntityDocument extends GenericModel {
	
	@Column(name="name", nullable=false, length=50)	
	private String name;
	
	@Column(name="completed_by", nullable=false)
	private long completedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="completed_date", nullable=false)
	private Date completedDate;
	
	@Column(name="completed_description", length = 100)
	private String completedDescription;
	
	@Column(name="approved_by", nullable=false)
	private long approvedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="approved_date", nullable=false)
	private Date approvedDate;
	
	@Column(name="approved_description", length = 100)
	private String approvedDescription;
	
	@Column(name="registered_number", length = 20)
	private String registeredNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="registered_date", nullable=false)
	private Date registeredDate;
	
	@Column(name="registered_description", length = 100)
	private String registeredDescription;
	
	@ManyToOne(targetEntity=EntityDocumentRegisteredBy.class, fetch = FetchType.EAGER)
	@JoinColumn(name="entity_document_registered_by_id")
	private EntityDocumentRegisteredBy registeredBy;
	
	@ManyToOne(targetEntity=EntityDocumentState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="entity_document_state_id")
	private EntityDocumentState entityDocumentState;
	
	@ManyToOne(targetEntity=DocumentPackage.class, fetch = FetchType.EAGER)
    @JoinColumn(name="documentPackageId")
	DocumentPackage documentPackage;

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
