package kg.gov.mf.loan.manage.repository.order;

import kg.gov.mf.loan.manage.model.order.CreditOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditOrderRepository extends JpaRepository<CreditOrder, Long> {
}
