package kg.gov.mf.loan.manage.model.loan;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@DiscriminatorValue("3")
public class RestructuredLoan extends Loan{

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date restructureDate;

    private String restructureDescription;

    public Date getRestructureDate() {
        return restructureDate;
    }

    public void setRestructureDate(Date restructureDate) {
        this.restructureDate = restructureDate;
    }

    public String getRestructureDescription() {
        return restructureDescription;
    }

    public void setRestructureDescription(String restructureDescription) {
        this.restructureDescription = restructureDescription;
    }
}
