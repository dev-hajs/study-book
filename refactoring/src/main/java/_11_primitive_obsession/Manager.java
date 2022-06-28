package _11_primitive_obsession;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "manager";
    }
}
