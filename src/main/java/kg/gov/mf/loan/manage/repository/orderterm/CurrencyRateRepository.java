package kg.gov.mf.loan.manage.repository.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long>{
}
