package kg.gov.mf.loan.manage.repository;

import kg.gov.mf.loan.manage.model.ManageCounter;
import kg.gov.mf.loan.manage.model.ManageCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManageCounterRepository extends JpaRepository<ManageCounter,Long> {
    public ManageCounter getByEntityNameEquals(String name);
}
