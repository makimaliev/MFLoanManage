package kg.gov.mf.loan.manage.repository.entity;

import kg.gov.mf.loan.manage.model.entity.AppliedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliedEntityRepository extends JpaRepository<AppliedEntity, Long>{
}
