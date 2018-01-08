package kg.gov.mf.loan.manage.service.entitylist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.entitylist.AppliedEntityListDao;
import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;

@Service("appliedEntityListService")
@Transactional
public class AppliedEntityListServiceImpl implements AppliedEntityListService{
	
	@Autowired
	private AppliedEntityListDao listDao;

	@Override
	public AppliedEntityList findById(long id) {
		return this.listDao.findById(id);
	}

	@Override
	public AppliedEntityList findByListNumber(String listNumber) {
		return this.listDao.findByListNumber(listNumber);
	}

	@Override
	public void save(AppliedEntityList list) {
		this.listDao.save(list);
	}

	@Override
	public void update(AppliedEntityList list) {
		AppliedEntityList entity = this.listDao.findById(list.getId());
        if(entity!=null){
        	entity.setListNumber(list.getListNumber());
        	entity.setListDate(list.getListDate());
        	entity.setAppliedEntityListState(list.getAppliedEntityListState());
        	entity.setAppliedEntityListType(list.getAppliedEntityListType());
        }
	}

	@Override
	public void deleteById(long id) {
		this.listDao.deleteById(id);
	}

	@Override
	public List<AppliedEntityList> findAll() {
		return this.listDao.findAll();
	}

}
