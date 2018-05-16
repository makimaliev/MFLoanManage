package kg.gov.mf.loan.manage.model;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public abstract class BaseModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
