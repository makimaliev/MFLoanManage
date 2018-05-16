package kg.gov.mf.loan.manage.model.documentpackage;

import java.util.Date;
import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

@Entity
@Table(name="documentPackage")
public class DocumentPackage extends BaseModel {

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

	@Enumerated(EnumType.STRING)
	private DocumentPackageState documentPackageState;

	@Enumerated(EnumType.STRING)
	private DocumentPackageType documentPackageType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "appliedEntityId", nullable = false)
	AppliedEntity appliedEntity;

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
}
