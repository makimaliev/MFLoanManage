package kg.gov.mf.loan.manage.repository.org;

import kg.gov.mf.loan.admin.org.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    List<Staff> findByNameContains(String q);
    Staff findById(long id);
}
