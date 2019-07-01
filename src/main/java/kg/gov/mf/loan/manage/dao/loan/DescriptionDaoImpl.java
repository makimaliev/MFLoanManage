package kg.gov.mf.loan.manage.dao.loan;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.Description;
import org.springframework.stereotype.Repository;

@Repository("descriptionDao")
public class DescriptionDaoImpl extends GenericDaoImpl<Description> implements DescriptionDao{
}
