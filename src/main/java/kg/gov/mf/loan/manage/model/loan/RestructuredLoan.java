package kg.gov.mf.loan.manage.model.loan;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("3")
public class RestructuredLoan extends BaseLoan{

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
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
