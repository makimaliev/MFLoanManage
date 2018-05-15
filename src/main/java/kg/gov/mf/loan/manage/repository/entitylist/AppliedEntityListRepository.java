package kg.gov.mf.loan.manage.repository.entitylist;

import kg.gov.mf.loan.manage.model.entitylist.AppliedEntityList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppliedEntityListRepository extends JpaRepository<AppliedEntityList, Long>{
}
