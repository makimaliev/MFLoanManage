package kg.gov.mf.loan.manage.repository.debtor;

import kg.gov.mf.loan.manage.model.debtor.Owner;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long>{
    List<Owner> findByNameContains(String q);
    List<Owner> findByName(String name);
}
