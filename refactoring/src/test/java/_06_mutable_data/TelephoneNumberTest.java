package _06_mutable_data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    void testEquals() {
        TelephoneNumber number1 = new TelephoneNumber("123", "123");
        TelephoneNumber number2 = new TelephoneNumber("123", "123");
        assertEquals(number1, number2);
    }
}