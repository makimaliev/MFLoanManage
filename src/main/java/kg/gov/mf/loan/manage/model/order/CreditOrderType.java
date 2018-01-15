package kg.gov.mf.loan.manage.model.order;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.Catalog;

@Entity
@Table(name="creditOrderType")
public class CreditOrderType extends Catalog {
}