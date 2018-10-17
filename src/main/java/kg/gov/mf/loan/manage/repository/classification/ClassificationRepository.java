package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.Classification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationRepository extends JpaRepository<Classification, Long> {

    Classification findById(Long id);
}
