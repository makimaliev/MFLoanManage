package kg.gov.mf.loan.manage.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import kg.gov.mf.loan.task.model.Catalog;

@Entity
@Table(name="appliedEntityState")
public class AppliedEntityState extends Catalog {
}
