package kg.gov.mf.loan.manage.model.collateral;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.manage.model.Catalog;

@Entity
@Table(name="collateralItemType")
public class ItemType extends Catalog{
}
