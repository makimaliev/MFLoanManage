package kg.gov.mf.loan.manage.dao.orderterm;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.orderterm.OrderTerm;

@Repository("orderTermDao")
public class OrderTermDaoImpl extends GenericDaoImpl<OrderTerm> implements OrderTermDao {

    @Override
    public OrderTerm getById(Long id)
    {
        OrderTerm result = super.getById(id);
        Hibernate.initialize(result.getAgreementTemplates());
        return result;
    }

}
