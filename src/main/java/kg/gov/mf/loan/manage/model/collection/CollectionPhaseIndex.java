package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "collectionPhaseIndex")
public class CollectionPhaseIndex extends GenericModel{

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;
    @OneToMany(mappedBy = "collectionPhaseIndex", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CollectionPhaseSubIndex> collectionPhaseSubIndices = new HashSet<CollectionPhaseSubIndex>();

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

    public Set<CollectionPhaseSubIndex> getCollectionPhaseSubIndices() {
        return collectionPhaseSubIndices;
    }

    public void setCollectionPhaseSubIndices(Set<CollectionPhaseSubIndex> collectionPhaseSubIndices) {
        this.collectionPhaseSubIndices = collectionPhaseSubIndices;
    }
}
