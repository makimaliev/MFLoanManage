package kg.gov.mf.loan.manage.service.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.loan.TargetedUseDao;
import kg.gov.mf.loan.manage.model.loan.TargetedUse;

@Service("targetedUseService")
@Transactional
public class TargetedUseServiceImpl implements TargetedUseService{
	
	@Autowired
	private TargetedUseDao tuDao;

	@Override
	public TargetedUse findById(long id) {
		return this.tuDao.findById(id);
	}

	@Override
	public void save(TargetedUse tu) {
		this.tuDao.save(tu);
	}

	@Override
	public void update(TargetedUse tu) {
		TargetedUse entity = this.tuDao.findById(tu.getId());
        if(entity!=null){
        	entity.setTargetedUseResultId(tu.getTargetedUseResultId());
        	entity.setCreatedById(tu.getCreatedById());
        	entity.setCreatedDate(tu.getCreatedDate());
        	entity.setApprovedById(tu.getApprovedById());
        	entity.setApprovedDate(tu.getApprovedDate());
        	entity.setCheckedById(tu.getCheckedById());
        	entity.setCheckedDate(tu.getCheckedDate());
        	entity.setAttachmentId(tu.getAttachmentId());
        }
	}

	@Override
	public void deleteById(long id) {
		this.tuDao.deleteById(id);
	}

	@Override
	public List<TargetedUse> findAll() {
		return this.tuDao.findAll();
	}

}
