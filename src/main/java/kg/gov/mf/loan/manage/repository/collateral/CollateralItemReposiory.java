package kg.gov.mf.loan.manage.repository.collateral;

import kg.gov.mf.loan.manage.model.collateral.CollateralItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollateralItemReposiory extends JpaRepository<CollateralItem, Long>{
}
