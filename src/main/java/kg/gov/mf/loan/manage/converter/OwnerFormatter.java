package kg.gov.mf.loan.manage.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import kg.gov.mf.loan.manage.service.debtor.OwnerService;

@Service
public class OwnerFormatter implements Formatter<Owner> {

	@Autowired
	OwnerService ownerService;
	
	@Override
	public String print(Owner object, Locale locale) {
		return (object != null ? (String.valueOf(object.getId())) : "");
	}

	@Override
	public Owner parse(String text, Locale locale) throws ParseException {
		long id = Integer.valueOf(text);
		if(id == 0) {
			Owner owner = new Owner();
			owner.setId(id);
			return owner;
		}
		else
			return this.ownerService.getById(id);
	}
}