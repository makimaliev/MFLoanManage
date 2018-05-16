package kg.gov.mf.loan.manage.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import kg.gov.mf.loan.manage.model.debtor.WorkSector;
import kg.gov.mf.loan.manage.service.debtor.WorkSectorService;

@Service
public class WorkSectorFormatter implements Formatter<WorkSector> {

	@Autowired
	WorkSectorService sectorService;
	
	@Override
	public String print(WorkSector object, Locale locale) {
		return (object != null ? (String.valueOf(object.getId())) : "");
	}

	@Override
	public WorkSector parse(String text, Locale locale) throws ParseException {
		long id = Integer.valueOf(text);
		if(id == 0) {
			WorkSector sector = new WorkSector();
			sector.setId(id);
			return sector;
		}
		else
			return this.sectorService.getById(id);
	}
}
