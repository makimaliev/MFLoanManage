package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.*;

import kg.gov.mf.loan.task.model.GenericModel;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="collateralItemDetails")
public class CollateralItemDetails extends GenericModel{

	@Column(nullable=false, length=100)
	private String details1;
	
	@Column(nullable=false, length=100)
	private String details2;
	
	@Column(nullable=false, length=100)
	private String details3;
	
	@Column(nullable=false, length=100)
	private String details4;
	
	@Column(nullable=false, length=100)
	private String details5;
	
	@Column(nullable=false, length=100)
	private String details6;

	@Column(nullable=true, length=300)
	private String document;

	@Column(nullable=true, length=300)
	private String incomplete_reason;

	@Column(nullable=true, length=100)
	private String goods_type;

	@Column(nullable=false, length=100)
	private String goods_address;

	@Column(nullable=false, length=100)
	private String goods_id;

	@Column
	private long arrest_by;


	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date detailsDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date prodDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date explDate;

	@OneToOne(targetEntity=CollateralItem.class, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	CollateralItem collateralItem;
	
	public String getDetails1() {
		return details1;
	}

	public void setDetails1(String details1) {
		this.details1 = details1;
	}

	public String getDetails2() {
		return details2;
	}

	public void setDetails2(String details2) {
		this.details2 = details2;
	}

	public String getDetails3() {
		return details3;
	}

	public void setDetails3(String details3) {
		this.details3 = details3;
	}

	public String getDetails4() {
		return details4;
	}

	public void setDetails4(String details4) {
		this.details4 = details4;
	}

	public String getDetails5() {
		return details5;
	}

	public void setDetails5(String details5) {
		this.details5 = details5;
	}

	public String getDetails6() {
		return details6;
	}

	public void setDetails6(String details6) {
		this.details6 = details6;
	}

	public CollateralItem getCollateralItem() {
		return collateralItem;
	}

	public void setCollateralItem(CollateralItem collateralItem) {
		this.collateralItem = collateralItem;
	}


	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getIncomplete_reason() {
		return incomplete_reason;
	}

	public void setIncomplete_reason(String incomplete_reason) {
		this.incomplete_reason = incomplete_reason;
	}

	public String getGoods_type() {
		return goods_type;
	}

	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}

	public String getGoods_address() {
		return goods_address;
	}

	public void setGoods_address(String goods_address) {
		this.goods_address = goods_address;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public long getArrest_by() {
		return arrest_by;
	}

	public void setArrest_by(long arrest_by) {
		this.arrest_by = arrest_by;
	}

	public Date getProdDate() {
		return prodDate;
	}

	public void setProdDate(Date prodDate) {
		this.prodDate = prodDate;
	}

	public Date getExplDate() {
		return explDate;
	}

	public void setExplDate(Date explDate) {
		this.explDate = explDate;
	}

	public Date getDetailsDate() {
		return detailsDate;
	}

	public void setDetailsDate(Date detailsDate) {
		this.detailsDate = detailsDate;
	}
}
