package kg.gov.mf.loan.manage.model.loan;

import kg.gov.mf.loan.manage.model.order.CreditOrder;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER,
        name = "loan_type_id",
        columnDefinition = "TINYINT(1)")
public abstract class BaseLoan {

    @Id
    private Long id;

    @OneToMany(mappedBy="parent",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<BaseLoan> children;

    @ManyToOne
    @JoinColumn
    private BaseLoan parent;

    @Column(nullable=false, length=150)
    private String regNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date regDate;

    @Column(precision = 12, scale = 5)
    private Double amount;

    @ManyToOne
    @JoinColumn
    private CreditOrder creditOrder;

    public Long getId() {
        return id;
    }
    protected void setId(Long id) {
        this.id = id;
    }

    @Transient
    public boolean isLeaf(){
        return (children == null || children.size() == 0);
    }

    @Transient
    public boolean isRoot() {
        return (parent == null);
    }

    public Set<BaseLoan> getChildren() {
        return children;
    }
    public void setChildren(Set<BaseLoan> children) {
        this.children = children;
    }

    public BaseLoan getParent() {
        return parent;
    }
    public void setParent(BaseLoan parent) {
        this.parent = parent;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CreditOrder getCreditOrder() {
        return creditOrder;
    }

    public void setCreditOrder(CreditOrder creditOrder) {
        this.creditOrder = creditOrder;
    }
}
