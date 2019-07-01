package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.task.model.GenericModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "description")
public class Description extends GenericModel {

    @Column(columnDefinition = "TEXT")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
