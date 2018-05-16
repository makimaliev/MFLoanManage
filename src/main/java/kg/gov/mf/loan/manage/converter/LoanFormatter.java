package kg.gov.mf.loan.manage.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import kg.gov.mf.loan.manage.model.loan.Loan;
import kg.gov.mf.loan.manage.service.loan.LoanService;

@Service
public class LoanFormatter implements Formatter<Loan> {
	
	@Autowired
	LoanService loanService;

	@Override
	public String print(Loan object, Locale locale) {
		return (object != null ? (String.valueOf(object.getId())) : "");
	}

	@Override
	public Loan parse(String text, Locale locale) throws ParseException {
		long id = Integer.valueOf(text);
		if(id == 0) {
			Loan loan = new Loan();
			loan.setId(id);
			return loan;
		}
		else
			return this.loanService.getById(id);
	}

}
