package kg.gov.mf.loan.manage.service.documentpackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kg.gov.mf.loan.manage.dao.documentpackage.DocumentPackageTypeDao;
import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackageType;

@Service("documentPackageTypeService")
@Transactional
public class DocumentPackageTypeServiceImpl implements DocumentPackageTypeService{
	
	@Autowired
	private DocumentPackageTypeDao typeDao;

	@Override
	public DocumentPackageType findById(long id) {
		return this.typeDao.findById(id);
	}

	@Override
	public DocumentPackageType findByName(String name) {
		return this.typeDao.findByName(name);
	}

	@Override
	public void save(DocumentPackageType type) {
		this.typeDao.save(type);
	}

	@Override
	public void update(DocumentPackageType type) {
		DocumentPackageType entity = this.typeDao.findById(type.getId());
        if(entity!=null){
            entity.setName(type.getName());
        }
	}

	@Override
	public void deleteById(long id) {
		this.typeDao.deleteById(id);
	}

	@Override
	public List<DocumentPackageType> findAll() {
		return this.typeDao.findAll();
	}

	@Override
	public boolean isTypeNameUnique(long id, String name) {
		DocumentPackageType type = findByName(name);
        return (type == null || ((id != 0L) && (type.getId() == id)));
	}

}
