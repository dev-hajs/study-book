package _11_primitive_obsession.swtiches;

public class FullTimeEmployee extends Employee {

    @Override
    public int vacationHours() {
        return 120;
    }

    @Override
    public boolean canAccessTo(String project) {
        return true;
    }
}
