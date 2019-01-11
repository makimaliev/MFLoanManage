package kg.gov.mf.loan.manage.model.collection;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.*;

@Entity
public class CollectionPhaseSubIndex extends GenericModel {

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

    @ManyToOne(targetEntity=CollectionPhaseIndex.class, fetch = FetchType.LAZY)
    @JoinColumn(name="collectionPhaseIndexId")
    CollectionPhaseIndex collectionPhaseIndex;

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

    public CollectionPhaseIndex getCollectionPhaseIndex() {
        return collectionPhaseIndex;
    }

    public void setCollectionPhaseIndex(CollectionPhaseIndex collectionPhaseIndex) {
        this.collectionPhaseIndex = collectionPhaseIndex;
    }
}
