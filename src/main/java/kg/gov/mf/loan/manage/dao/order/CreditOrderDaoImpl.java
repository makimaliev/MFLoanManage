package kg.gov.mf.loan.manage.dao.order;

import org.springframework.stereotype.Repository;

import kg.gov.mf.loan.manage.dao.GenericDaoImpl;
import kg.gov.mf.loan.manage.model.order.CreditOrder;

@Repository("creditOrderDao")
public class CreditOrderDaoImpl extends GenericDaoImpl<CreditOrder> implements CreditOrderDao{
}
