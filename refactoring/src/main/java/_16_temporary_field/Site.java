package _16_temporary_field;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer.getName().equals("unknown") ? new UnknownCustomer() : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
