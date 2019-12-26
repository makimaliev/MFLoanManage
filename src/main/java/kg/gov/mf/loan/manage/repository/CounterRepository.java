package kg.gov.mf.loan.manage.repository;

import kg.gov.mf.loan.manage.model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends JpaRepository<Counter,Long> {
    public Counter getByEntityNameEquals(String name);
}
