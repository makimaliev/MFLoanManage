package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.Classificator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificatorRepository extends JpaRepository<Classificator, Long> {

    Classificator findById(Long id);
}
