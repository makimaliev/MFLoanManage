package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.ClassificationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationTableRepository extends JpaRepository<ClassificationTable, Long> {

    ClassificationTable findById(Long id);

}
