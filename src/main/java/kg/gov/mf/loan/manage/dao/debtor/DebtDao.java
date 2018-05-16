package kg.gov.mf.loan.manage.dao.debtor;

import kg.gov.mf.loan.manage.model.debtor.Debtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DebtDao extends JpaRepository<Debtor, Long>, JpaSpecificationExecutor<Debtor>{
}
