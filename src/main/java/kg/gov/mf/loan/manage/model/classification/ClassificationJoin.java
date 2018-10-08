package kg.gov.mf.loan.manage.model.classification;

import javax.persistence.*;

@Entity
@Table(name="classification_join")
public class ClassificationJoin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="left_table_name", nullable=false)
    private String leftTableName;

    @Column(name="right_table_name", nullable=false)
    private String rightTableName;

    @Column(name="join_text", nullable=false)
    private String joinText;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeftTableName() {
        return leftTableName;
    }

    public void setLeftTableName(String leftTableName) {
        this.leftTableName = leftTableName;
    }

    public String getRightTableName() {
        return rightTableName;
    }

    public void setRightTableName(String rightTableName) {
        this.rightTableName = rightTableName;
    }

    public String getJoinText() {
        return joinText;
    }

    public void setJoinText(String joinText) {
        this.joinText = joinText;
    }
}
