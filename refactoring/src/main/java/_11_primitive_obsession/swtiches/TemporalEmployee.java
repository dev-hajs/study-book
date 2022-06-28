package _11_primitive_obsession.swtiches;

import java.util.List;

public class TemporalEmployee extends Employee {

    public TemporalEmployee(List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 32;
    }
}
