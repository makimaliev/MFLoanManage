package kg.gov.mf.loan.manage.repository.orderterm;

import kg.gov.mf.loan.manage.model.orderterm.AgreementTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementTemplateRepository extends JpaRepository<AgreementTemplate, Long> {
}
