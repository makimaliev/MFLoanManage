package kg.gov.mf.loan.manage.service.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service("loanService")
@Transactional
public class LoanServiceImpl extends GenericServiceImpl<Loan> implements LoanService{

    @Autowired
    EntityManager entityManager;

    @Override
    public Loan getByVersion(Long version) {
        String baseQuery="select *\n" +
                "from loan where version="+version;
        Query query=entityManager.createNativeQuery(baseQuery,Loan.class);

        return (Loan) query.getSingleResult();
    }
}
