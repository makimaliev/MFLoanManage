package kg.gov.mf.loan.manage.model.orderdocument;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.Catalog;

@Entity
@Table(name="orderDocumentType")
public class OrderDocumentType extends Catalog{
}
