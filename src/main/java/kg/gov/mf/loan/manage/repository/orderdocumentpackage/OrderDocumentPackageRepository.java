package kg.gov.mf.loan.manage.repository.orderdocumentpackage;

import kg.gov.mf.loan.manage.model.orderdocumentpackage.OrderDocumentPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDocumentPackageRepository extends JpaRepository<OrderDocumentPackage, Long>{
}
