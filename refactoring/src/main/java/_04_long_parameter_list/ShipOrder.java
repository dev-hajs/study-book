package _04_long_parameter_list;

import java.time.LocalDate;

public class ShipOrder {

    private LocalDate placedOn;
    private String deliveryState;

    public ShipOrder(LocalDate placedOn, String deliveryState) {
        this.placedOn = placedOn;
        this.deliveryState = deliveryState;
    }

    public LocalDate getPlacedOn() {
        return placedOn;
    }

    public String getDeliveryState() {
        return deliveryState;
    }
}
