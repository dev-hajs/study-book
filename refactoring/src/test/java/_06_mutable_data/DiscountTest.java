package _06_mutable_data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void getDiscount() {
        Discount discount = new Discount(100);
        assertEquals(100, discount.getDiscountedTotal());

        discount.setDiscount(10);
        assertEquals(90, discount.getDiscountedTotal());
    }
}