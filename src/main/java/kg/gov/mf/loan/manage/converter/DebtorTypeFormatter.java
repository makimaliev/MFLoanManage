package kg.gov.mf.loan.manage.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import kg.gov.mf.loan.manage.model.debtor.DebtorType;
import kg.gov.mf.loan.manage.service.debtor.DebtorTypeService;

@Service
public class DebtorTypeFormatter implements Formatter<DebtorType> {

	@Autowired
	DebtorTypeService debtorTypeService;

	@Override
	public String print(DebtorType object, Locale locale) {
		return (object != null ? (String.valueOf(object.getId())) : "");
	}

	@Override
	public DebtorType parse(String text, Locale locale) throws ParseException {
		long id = Integer.valueOf(text);
		if(id == 0) {
			DebtorType type = new DebtorType();
			type.setId(id);
			return type;
		}
		else
			return this.debtorTypeService.getById(id);
	}

}
