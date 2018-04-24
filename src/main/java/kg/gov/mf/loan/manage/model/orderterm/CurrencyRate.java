package kg.gov.mf.loan.manage.model.orderterm;

import javax.persistence.*;

@Entity
@Table(name="currency_rate")

public class CurrencyRate extends  Rate {

    @ManyToOne(targetEntity=OrderTermCurrency.class, fetch = FetchType.EAGER)
    @JoinColumn(name="currency_type_id")
    private OrderTermCurrency currency;

    public OrderTermCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(OrderTermCurrency currency) {
        this.currency = currency;
    }
}
