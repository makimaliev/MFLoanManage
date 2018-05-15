package kg.gov.mf.loan.manage.repository.documentpackage;

import kg.gov.mf.loan.manage.model.documentpackage.DocumentPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentPackageRepository extends JpaRepository<DocumentPackage, Long> {
}
