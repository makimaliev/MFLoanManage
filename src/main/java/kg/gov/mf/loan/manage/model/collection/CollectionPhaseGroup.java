package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "collectionPhaseGroup")
public class CollectionPhaseGroup extends GenericModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
