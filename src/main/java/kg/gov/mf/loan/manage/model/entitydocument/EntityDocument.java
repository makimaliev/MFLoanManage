package kg.gov.mf.loan.manage.model.entitydocument;

import java.util.Date;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;

@Entity
@Table(name="entityDocument")
public class EntityDocument extends BaseModel {
	
	@Column(nullable=false, length=50)	
	private String name;
	
	@Column(nullable=false)
	private long completedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date completedDate;
	
	@Column(length = 100)
	private String completedDescription;
	
	@Column(nullable=false)
	private long approvedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date approvedDate;
	
	@Column(length = 100)
	private String approvedDescription;
	
	@Column(length = 20)
	private String registeredNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date registeredDate;
	
	@Column(length = 100)
	private String registeredDescription;

	@Enumerated(EnumType.STRING)
	private EntityDocumentRegisteredBy registeredBy;

	@Enumerated(EnumType.STRING)
	private EntityDocumentState entityDocumentState;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documentPackageId", nullable = false)
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
