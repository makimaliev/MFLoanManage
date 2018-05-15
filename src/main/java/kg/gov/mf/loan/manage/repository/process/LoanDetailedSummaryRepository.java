package kg.gov.mf.loan.manage.repository.process;

import kg.gov.mf.loan.manage.model.process.LoanDetailedSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanDetailedSummaryRepository extends JpaRepository<LoanDetailedSummary, Long> {
}
