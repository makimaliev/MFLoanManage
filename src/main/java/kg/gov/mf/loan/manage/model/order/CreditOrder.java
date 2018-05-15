package kg.gov.mf.loan.manage.model.order;

import java.util.Date;

import javax.persistence.*;

import kg.gov.mf.loan.manage.model.BaseModel;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="creditOrder")
public class CreditOrder extends BaseModel {
	
	@Column(nullable=false, length = 100)
	private String regNumber;
	private String description;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
	@Column(nullable=true)
	private Date regDate;

	@Enumerated(EnumType.STRING)
	private CreditOrderState creditOrderState;

	@Enumerated(EnumType.STRING)
	private CreditOrderType creditOrderType;
	
	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public CreditOrderState getCreditOrderState() {
		return creditOrderState;
	}

	public void setCreditOrderState(CreditOrderState creditOrderState) {
		this.creditOrderState = creditOrderState;
	}

	public CreditOrderType getCreditOrderType() {
		return creditOrderType;
	}

	public void setCreditOrderType(CreditOrderType creditOrderType) {
		this.creditOrderType = creditOrderType;
	}
}