package kg.gov.mf.loan.manage.repository.debtor;

import com.querydsl.core.types.dsl.BooleanExpression;
import kg.gov.mf.loan.manage.model.debtor.Debtor;
import kg.gov.mf.loan.manage.model.debtor.Owner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtorRepository extends JpaRepository<Debtor, Long>, QueryDslPredicateExecutor {
    Page<Debtor> findByOwner(Owner owner, Pageable pageable);
}
