package _04_long_parameter_list;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShipmentTest {

    @Test
    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        ShipOrder orderFormA = new ShipOrder(placedOn, "WA");

        Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.rushDeliveryDate(orderFormA));
        assertEquals(placedOn.plusDays(2), shipment.regularDeliveryDate(orderFormA));
    }

}