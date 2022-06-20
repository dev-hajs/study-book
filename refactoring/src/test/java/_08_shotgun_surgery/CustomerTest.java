package _08_shotgun_surgery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void applyDiscount() {
        Customer customer = new Customer("jisoo", 0.5);
        assertEquals(50, customer.applyDiscount(100));

        customer.becomePreferred();
        assertEquals(47, customer.applyDiscount(100));
    }
}