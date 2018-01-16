package kg.gov.mf.loan.manage.model.documentpackage;

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
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;

@Entity
@Table(name="documentPackage")
public class DocumentPackage extends GenericModel{

	@Column(nullable=false, length = 50)
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date completedDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date approvedDate;
	
	@Column(precision = 12, scale = 5)
	private Double completedRatio;
	
	@Column(precision = 12, scale = 5)
	private Double approvedRatio;
	
	@Column(precision = 12, scale = 5)
	private Double registeredRatio;
	
	private long orderDocumentPackageId;
	
	@ManyToOne(targetEntity=DocumentPackageState.class, fetch = FetchType.EAGER)
	@JoinColumn(name="documentPackageStateId")
	private DocumentPackageState documentPackageState;
	
	@ManyToOne(targetEntity=DocumentPackageType.class, fetch = FetchType.EAGER)
	@JoinColumn(name="documentPackageTypeId")
	private DocumentPackageType documentPackageType;
	
	@ManyToOne(targetEntity=AppliedEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name="appliedEntityId")
	AppliedEntity appliedEntity;
	
	@OneToMany(mappedBy = "documentPackage", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true)
    private Set<EntityDocument> entityDocuments = new HashSet<EntityDocument>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Double getCompletedRatio() {
		return completedRatio;
	}

	public void setCompletedRatio(Double completedRatio) {
		this.completedRatio = completedRatio;
	}

	public Double getApprovedRatio() {
		return approvedRatio;
	}

	public void setApprovedRatio(Double approvedRatio) {
		this.approvedRatio = approvedRatio;
	}

	public Double getRegisteredRatio() {
		return registeredRatio;
	}

	public void setRegisteredRatio(Double registeredRatio) {
		this.registeredRatio = registeredRatio;
	}

	public long getOrderDocumentPackageId() {
		return orderDocumentPackageId;
	}

	public void setOrderDocumentPackageId(long orderDocumentPackageId) {
		this.orderDocumentPackageId = orderDocumentPackageId;
	}

	public DocumentPackageState getDocumentPackageState() {
		return documentPackageState;
	}

	public void setDocumentPackageState(DocumentPackageState documentPackageState) {
		this.documentPackageState = documentPackageState;
	}

	public DocumentPackageType getDocumentPackageType() {
		return documentPackageType;
	}

	public void setDocumentPackageType(DocumentPackageType documentPackageType) {
		this.documentPackageType = documentPackageType;
	}

	public AppliedEntity getAppliedEntity() {
		return appliedEntity;
	}

	public void setAppliedEntity(AppliedEntity appliedEntity) {
		this.appliedEntity = appliedEntity;
	}

	public Set<EntityDocument> getEntityDocuments() {
		return entityDocuments;
	}

	public void setEntityDocuments(Set<EntityDocument> entityDocuments) {
		this.entityDocuments = entityDocuments;
	}

}
