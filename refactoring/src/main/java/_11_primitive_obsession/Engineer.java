package _11_primitive_obsession;

public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "engineer";
    }
}
