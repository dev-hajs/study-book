package _11_primitive_obsession;

public class Salesman extends Employee {

    public Salesman(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "salesman";
    }
}
