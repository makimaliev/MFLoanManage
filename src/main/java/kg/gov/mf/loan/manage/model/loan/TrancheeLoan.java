package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class TrancheeLoan extends Loan {
}
