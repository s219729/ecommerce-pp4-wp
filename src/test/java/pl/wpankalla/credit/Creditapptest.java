package pl.wpankalla.credit;

import org.junit.
import java.math.BigDecimal;


public class Creditapptest {
    void itAllowsAssignCreditLimit(){
        CreditCard card = new CreditCard();
        card.assignLimit(BigDecimal.valueOf(1000));

        assert
    }
}
