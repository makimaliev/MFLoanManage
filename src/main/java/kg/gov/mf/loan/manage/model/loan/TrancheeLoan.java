package kg.gov.mf.loan.manage.model.loan;

import org.hibernate.envers.Audited;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
@Audited
public class TrancheeLoan extends Loan {
}
