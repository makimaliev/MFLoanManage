package kg.gov.mf.loan.manage.converter;

import kg.gov.mf.loan.manage.model.collection.PhaseStatus;
import kg.gov.mf.loan.manage.service.collection.PhaseStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class PhaseStatusFormatter implements Formatter<PhaseStatus> {

    @Autowired
    PhaseStatusService phaseStatusService;

    @Override
    public String print(PhaseStatus object, Locale locale) {
        return (object != null ? (String.valueOf(object.getId())) : "");
    }

    @Override
    public PhaseStatus parse(String text, Locale locale) throws ParseException {
        long id = Integer.valueOf(text);
        if(id == 0) {
            PhaseStatus status = new PhaseStatus();
            status.setId(id);
            return status;
        }
        else
            return this.phaseStatusService.getById(id);
    }

}
