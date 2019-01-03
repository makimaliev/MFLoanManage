package kg.gov.mf.loan.manage.repository.org;

import kg.gov.mf.loan.admin.org.model.Staff;
import kg.gov.mf.loan.admin.sys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    List<Staff> findByNameContains(String q);
    Staff findById(long id);

    List<Staff> findByOrganizationIdAndNameContains(long id, String q);

}
