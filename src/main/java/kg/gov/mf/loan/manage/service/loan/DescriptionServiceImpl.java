package kg.gov.mf.loan.manage.service.loan;

import kg.gov.mf.loan.manage.model.loan.Description;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("descriptionService")
@Transactional
public class DescriptionServiceImpl extends GenericServiceImpl<Description> implements DescriptionService{
}
