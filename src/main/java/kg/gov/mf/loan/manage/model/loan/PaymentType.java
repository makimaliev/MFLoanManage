package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.task.model.Catalog;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="paymentType")
@Audited
public class PaymentType extends Catalog{
}
