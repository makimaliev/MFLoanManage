package kg.gov.mf.loan.manage.dao.entity;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.entity.AppliedEntity;

@Repository("appliedEntityDao")
public class AppliedEntityDaoImpl extends GenericDaoImpl<AppliedEntity> implements AppliedEntityDao {
}
