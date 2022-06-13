package _06_mutable_data;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void getTotalOutstanding() {
        Billing billing = new Billing(new Customer("jisoo", List.of(new Invoice(20), new Invoice(30))), new EmailGateway());
        assertEquals(50d, billing.totalOutstanding());
    }
}