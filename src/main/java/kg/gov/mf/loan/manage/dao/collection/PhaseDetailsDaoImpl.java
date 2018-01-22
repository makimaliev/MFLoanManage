package kg.gov.mf.loan.manage.dao.collection;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.collection.PhaseDetails;

@Repository("phaseDetailsDao")
public class PhaseDetailsDaoImpl extends GenericDaoImpl<PhaseDetails> implements PhaseDetailsDao {
}
