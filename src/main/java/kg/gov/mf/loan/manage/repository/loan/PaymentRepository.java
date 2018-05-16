package kg.gov.mf.loan.manage.repository.loan;

import kg.gov.mf.loan.manage.model.loan.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
}
