package kg.gov.mf.loan.manage.converter;

import kg.gov.mf.loan.manage.model.collection.PhaseType;
import kg.gov.mf.loan.manage.service.collection.PhaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Locale;

@Service
public class PhaseTypeFormatter implements Formatter<PhaseType> {

    @Autowired
    PhaseTypeService phaseTypeService;

    @Override
    public String print(PhaseType object, Locale locale) {
        return (object != null ? (String.valueOf(object.getId())) : "");
    }

    @Override
    public PhaseType parse(String text, Locale locale) throws ParseException {
        long id = Integer.valueOf(text);
        if(id == 0) {
            PhaseType type = new PhaseType();
            type.setId(id);
            return type;
        }
        else
            return this.phaseTypeService.getById(id);
    }

}
