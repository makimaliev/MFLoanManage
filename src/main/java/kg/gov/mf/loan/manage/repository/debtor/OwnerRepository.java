package kg.gov.mf.loan.manage.repository.debtor;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long>{
}
