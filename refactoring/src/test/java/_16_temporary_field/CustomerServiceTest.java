package _16_temporary_field;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    CustomerService customerService = new CustomerService();
    Customer unknown = new Customer("unknown", null, null);

    BillingPlan jisooBillingPlan = new BillingPlan();
    Customer jisoo = new Customer("jisoo", jisooBillingPlan, new PaymentHistory(1));

    @Test
    void customerName() {
        String unknownCustomerName = customerService.customerName(new Site(unknown));
        assertEquals("occupant", unknownCustomerName);

        String customer = customerService.customerName(new Site(jisoo));
        assertEquals("jisoo", customer);
    }

    @Test
    void billingPlan() {
        assertTrue((customerService.billingPlan(new Site(unknown)) instanceof BasicBillingPlan));

        assertEquals(jisooBillingPlan, customerService.billingPlan(new Site(jisoo)));
    }

    @Test
    void weeksDelinquent() {
        assertEquals(1, customerService.weeksDelinquent(new Site(jisoo)));

        assertEquals(0, customerService.weeksDelinquent(new Site(unknown)));
    }



}