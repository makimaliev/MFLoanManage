package kg.gov.mf.loan.manage.service;

import org.springframework.stereotype.Service;

@Service("mfLoan")
public class MFLoanImpl implements MFLoanInterface {

	@Override
	public String welcome() {
		return "H E L L O from service layer";
	}

}
