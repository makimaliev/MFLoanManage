package kg.gov.mf.loan.manage.model.classification;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="classification_table")
public class ClassificationTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="table", fetch=FetchType.EAGER)
    private Set<ClassificationField> fields;

    @Column(name="table_actual_name", nullable=false)
    private String tableActualName;

    @Column(name="table_output_name", nullable=false)
    private String tableOutputName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<ClassificationField> getFields() {
        return fields;
    }

    public void setFields(Set<ClassificationField> fields) {
        this.fields = fields;
    }

    public String getTableActualName() {
        return tableActualName;
    }

    public void setTableActualName(String tableActualName) {
        this.tableActualName = tableActualName;
    }

    public String getTableOutputName() {
        return tableOutputName;
    }

    public void setTableOutputName(String tableOutputName) {
        this.tableOutputName = tableOutputName;
    }
}
