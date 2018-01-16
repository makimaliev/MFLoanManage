package kg.gov.mf.loan.manage.service.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.ReconstructedList;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("reconstructedListService")
@Transactional
public class ReconstructedListServiceImpl extends GenericServiceImpl<ReconstructedList> implements ReconstructedListService{
}
