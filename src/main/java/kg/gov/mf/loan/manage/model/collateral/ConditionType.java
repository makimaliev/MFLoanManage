package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.Catalog;

@Entity
@Table(name="collateralConditionType")
public class ConditionType extends Catalog{
}
