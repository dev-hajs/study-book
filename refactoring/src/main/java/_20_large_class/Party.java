package _20_large_class;

public abstract class Party {

    protected String name;

    public Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double annualCost() {
        return this.monthlyCost() * 12;
    }

    abstract protected double monthlyCost();
}
