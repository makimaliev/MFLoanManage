package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.Catalog;

@Entity
@Table(name="paymentType")
public class PaymentType extends Catalog{
}
