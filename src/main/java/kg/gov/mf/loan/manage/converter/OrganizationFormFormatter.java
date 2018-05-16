package kg.gov.mf.loan.manage.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import kg.gov.mf.loan.manage.model.debtor.OrganizationForm;
import kg.gov.mf.loan.manage.service.debtor.OrganizationFormService;

@Service
public class OrganizationFormFormatter implements Formatter<OrganizationForm> {

	@Autowired
	OrganizationFormService formService;
	
	@Override
	public String print(OrganizationForm object, Locale locale) {
		return (object != null ? (String.valueOf(object.getId())) : "");
	}

	@Override
	public OrganizationForm parse(String text, Locale locale) throws ParseException {
		long id = Integer.valueOf(text);
		if(id == 0) {
			OrganizationForm form = new OrganizationForm();
			form.setId(id);
			return form;
		}
		else
			return this.formService.getById(id);
	}
}
