package kg.gov.mf.loan.manage.repository.order;

import kg.gov.mf.loan.manage.model.order.CreditOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditOrderRepository extends JpaRepository<CreditOrder, Long> {

    List<CreditOrder> findByRegNumberContains(String q);

    CreditOrder findByRegNumber(String regNumber);
}
