package kg.gov.mf.loan.manage.model.debtor;

import kg.gov.mf.loan.manage.model.loan.Loan;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class GenerateSummaryForm {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private List<Loan> loans;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }
}
