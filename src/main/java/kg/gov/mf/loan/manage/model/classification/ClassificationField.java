package kg.gov.mf.loan.manage.model.classification;

import javax.persistence.*;

@Entity
@Table(name="classification_field")
public class ClassificationField {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private ClassificationTable table;

    @Column(name="field_actual_name")
    private String fieldActualName;

    @Column(name="field_output_name")
    private String fieldOutputName;

    @Column(name="lookup_table_name")
    private String lookupTableName;

    @Column(name="field_type")
    private String field_type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClassificationTable getTable() {
        return table;
    }

    public void setTable(ClassificationTable table) {
        this.table = table;
    }

    public String getFieldActualName() {
        return fieldActualName;
    }

    public void setFieldActualName(String fieldActualName) {
        this.fieldActualName = fieldActualName;
    }

    public String getFieldOutputName() {
        return fieldOutputName;
    }

    public void setFieldOutputName(String fieldOutputName) {
        this.fieldOutputName = fieldOutputName;
    }

    public String getLookupTableName() {
        return lookupTableName;
    }

    public void setLookupTableName(String lookupTableName) {
        this.lookupTableName = lookupTableName;
    }

    public String getField_type() {
        return field_type;
    }

    public void setField_type(String field_type) {
        this.field_type = field_type;
    }
}
