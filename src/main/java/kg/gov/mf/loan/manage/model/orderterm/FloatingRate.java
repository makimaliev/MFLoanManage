package kg.gov.mf.loan.manage.model.orderterm;

import javax.persistence.*;

@Entity
@Table(name="floating_rate")

public class FloatingRate extends Rate{

    @ManyToOne(targetEntity=OrderTermFloatingRateType.class, fetch = FetchType.EAGER)
    @JoinColumn(name="floating_rate_type_id")
    private OrderTermFloatingRateType rateType;

    public OrderTermFloatingRateType getRateType() {
        return rateType;
    }

    public void setRateType(OrderTermFloatingRateType rateType) {
        this.rateType = rateType;
    }
}
