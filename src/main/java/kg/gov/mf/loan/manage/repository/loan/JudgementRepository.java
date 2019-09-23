package kg.gov.mf.loan.manage.repository.loan;

import kg.gov.mf.loan.manage.model.loan.Judgement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JudgementRepository extends JpaRepository<Judgement, Long> {

    List<Judgement> findAllByLoanId(Long loanId);
}
