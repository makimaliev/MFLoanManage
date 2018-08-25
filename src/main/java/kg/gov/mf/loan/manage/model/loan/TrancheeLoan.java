package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("2")
public class TrancheeLoan extends Loan {
}
