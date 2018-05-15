package kg.gov.mf.loan.manage.repository.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.OrderTermFloatingRateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTermFloatingRateTypeRepository extends JpaRepository<OrderTermFloatingRateType, Long>{
}
