package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.ClassificationField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassificationFieldRepository extends JpaRepository<ClassificationField, Long> {

    ClassificationField findById(Long id);
    List<ClassificationField> findByTableId(Long id);
}
