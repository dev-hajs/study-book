package _06_mutable_data;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void discount() {
        Order order = new Order();
        assertEquals(50d, order.discount(50d, 100));
        assertEquals(51d - 2, order.discount(51d, 100));
        assertEquals(50d - 1, order.discount(50d, 101));
        assertEquals(51d - 2 - 1, order.discount(51d, 101));
    }
}