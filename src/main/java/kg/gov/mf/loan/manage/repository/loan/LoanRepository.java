package kg.gov.mf.loan.manage.repository.loan;

import kg.gov.mf.loan.manage.model.loan.Loan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

    Page<Loan> findByDebtorId(Long debtorId, Pageable pageable);

    List<Loan> findByDebtorId(Long debtorId);

    List<Loan> findByRegNumberContains(String q);

    Loan findByRegNumber(String regNumber);

    List<Loan> findByDebtorIdAndRegNumberContains(Long id,String q);
    List<Loan> findByDebtorIdAndParent(Long debtorId,Loan parent);
}
