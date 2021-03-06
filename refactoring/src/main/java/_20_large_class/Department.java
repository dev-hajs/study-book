package _20_large_class;

import java.util.List;

public class Department extends Party {

    private List<Employee> staff;

    public Department(String name) {
        super(name);
    }

    public List<Employee> getStaff() {
        return staff;
    }

    @Override
    public double monthlyCost() {
        return this.staff.stream().mapToDouble(Employee::monthlyCost).sum();
    }

    public int headCount() {
        return this.staff.size();
    }
}
