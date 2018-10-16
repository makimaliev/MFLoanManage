package kg.gov.mf.loan.manage.model.classification;

import javax.persistence.*;

@Entity
@Table(name="classification_result")
public class ClassificationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="entity_id")
    private Long entityId;

    @Column(name="classification_id")
    private Long classificationId;
}
