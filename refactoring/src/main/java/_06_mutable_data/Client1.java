package _06_mutable_data;

public class Client1 extends ReadingClient {

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
