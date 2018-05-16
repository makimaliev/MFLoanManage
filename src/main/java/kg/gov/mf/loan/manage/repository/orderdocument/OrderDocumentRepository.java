package kg.gov.mf.loan.manage.repository.orderdocument;

import kg.gov.mf.loan.manage.model.orderdocument.OrderDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDocumentRepository extends JpaRepository<OrderDocument, Long> {
}
