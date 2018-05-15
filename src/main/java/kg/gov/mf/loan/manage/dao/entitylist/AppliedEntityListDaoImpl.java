package kg.gov.mf.loan.manage.dao.entitylist;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Repository("appliedEntityListDao")
public class AppliedEntityListDaoImpl extends GenericDaoImpl<AppliedEntityList> implements AppliedEntityListDao {
}
