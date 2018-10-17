package kg.gov.mf.loan.manage.model.classification;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="classification")
public class Classification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="entity_field", nullable=false)
    private String entityField;

    @Column(name="entity_type", nullable=false)
    private String entityType;

    @Column(name="query")
    private String query;

    @Column(name="input_fields")
    private String inputFields;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Classificator classificator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntityField() {
        return entityField;
    }

    public void setEntityField(String entityField) {
        this.entityField = entityField;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getInputFields() {
        return inputFields;
    }

    public void setInputFields(String inputFields) {
        this.inputFields = inputFields;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Classificator getClassificator() {
        return classificator;
    }

    public void setClassificator(Classificator classificator) {
        this.classificator = classificator;
    }
}
