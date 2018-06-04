package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.manage.model.loan.Loan;

import java.util.Set;

public class CollectionPhaseForm {

    private Set<Loan> loans;

    private CollectionPhase collectionPhase;

    public Set<Loan> getLoans() {
        return loans;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }

    public CollectionPhase getCollectionPhase() {
        return collectionPhase;
    }

    public void setCollectionPhase(CollectionPhase collectionPhase) {
        this.collectionPhase = collectionPhase;
    }
}
