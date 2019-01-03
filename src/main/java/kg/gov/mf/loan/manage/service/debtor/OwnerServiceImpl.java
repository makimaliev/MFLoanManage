package kg.gov.mf.loan.manage.service.debtor;

import kg.gov.mf.loan.manage.dao.debtor.OwnerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("debtorOwnerService")
@Transactional
public class OwnerServiceImpl extends GenericServiceImpl<Owner> implements OwnerService{

    @Autowired
    OwnerDao ownerDao;

    @Override
    public Owner getByEntityId(Long id,String ownerType) {
        return ownerDao.getByEntityId(id,ownerType);
    }
}
