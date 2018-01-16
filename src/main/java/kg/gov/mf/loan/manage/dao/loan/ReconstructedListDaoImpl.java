package kg.gov.mf.loan.manage.dao.loan;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.loan.ReconstructedList;

@Repository("reconstructedListDao")
public class ReconstructedListDaoImpl extends GenericDaoImpl<ReconstructedList> implements ReconstructedListDao {
}
