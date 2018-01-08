package kg.gov.mf.loan.manage.service.documentpackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.documentpackage.DocumentPackageStateDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageState;

@Service("documentPackageStateService")
@Transactional
public class DocumentPackageStateServiceImpl implements DocumentPackageStateService{
	
	@Autowired
	private DocumentPackageStateDao stateDao;

	@Override
	public DocumentPackageState findById(long id) {
		return this.stateDao.findById(id);
	}

	@Override
	public DocumentPackageState findByName(String name) {
		return this.stateDao.findByName(name);
	}

	@Override
	public void save(DocumentPackageState state) {
		this.stateDao.save(state);
	}

	@Override
	public void update(DocumentPackageState state) {
		DocumentPackageState entity = this.stateDao.findById(state.getId());
        if(entity!=null){
            entity.setName(state.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.stateDao.deleteById(id);
	}

	@Override
	public List<DocumentPackageState> findAll() {
		return this.stateDao.findAll();
	}

	@Override
	public boolean isStateNameUnique(long id, String name) {
		DocumentPackageState state = findByName(name);
        return (state == null || ((id != 0L) && (state.getId() == id)));
	}

}
