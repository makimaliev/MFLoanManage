package kg.gov.mf.loan.manage.repository.entitydocument;

import kg.gov.mf.loan.manage.model.entitydocument.EntityDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityDocumentRepository extends JpaRepository<EntityDocument, Long> {
}
