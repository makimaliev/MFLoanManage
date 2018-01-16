package kg.gov.mf.loan.manage.service.collateral;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.model.collateral.ItemType;
import kg.gov.mf.loan.manage.service.GenericServiceImpl;

@Service("itemTypeService")
@Transactional
public class ItemTypeServiceImpl extends GenericServiceImpl<ItemType> implements ItemTypeService{
}
