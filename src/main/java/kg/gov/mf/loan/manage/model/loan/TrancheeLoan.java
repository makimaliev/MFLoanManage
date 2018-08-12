package kg.gov.mf.loan.manage.model.loan;

import javax.persistence.*;
import java.util.Set;

@Entity
@DiscriminatorValue("2")
public class TrancheeLoan extends Loan {

    @Override
    public Double totalAmount() {

        Double result = this.getAmount();

        if(this.isRoot())
        {
            Set<Loan> subLoans = this.getChildren();
            for (Loan sub: subLoans
                    ) {
                result = result + sub.getAmount();
            }
        }

        return result;
    }
}
