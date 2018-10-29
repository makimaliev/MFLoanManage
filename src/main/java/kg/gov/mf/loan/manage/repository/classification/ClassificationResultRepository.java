package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.ClassificationResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationResultRepository extends JpaRepository<ClassificationResult, Long> {

    ClassificationResult findByEntityIdAndAndClassificationId(Long entityId, Long clId);
}
