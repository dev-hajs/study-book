package _07_divergent_change;

public class Person {

    private TelePhoneNumber telePhoneNumber;

    private String name;

    public Person(TelePhoneNumber telePhoneNumber, String name) {
        this.telePhoneNumber = telePhoneNumber;
        this.name = name;
    }

    public String telephoneNumber() {
        return this.telePhoneNumber.toString();
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelePhoneNumber getTelePhoneNumber() {
        return telePhoneNumber;
    }
}
