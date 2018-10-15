package kg.gov.mf.loan.manage.repository.classification;

import kg.gov.mf.loan.manage.model.classification.ClassificationJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationJoinRepository extends JpaRepository<ClassificationJoin, Long> {

    ClassificationJoin findById(Long id);
    ClassificationJoin findByLeftTableNameAndRightTableName(String t1, String t2);
}
