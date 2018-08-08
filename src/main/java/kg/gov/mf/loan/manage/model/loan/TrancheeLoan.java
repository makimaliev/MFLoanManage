package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.*;

@Entity
@DiscriminatorValue("2")
public class TrancheeLoan extends Loan {
}
