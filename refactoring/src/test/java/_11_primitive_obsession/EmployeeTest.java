package _11_primitive_obsession;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void employeeType() {
        assertEquals("engineer", Employee.createEmployee("jisu", "engineer").getType());
        assertEquals("manager", Employee.createEmployee("jisu", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("jisu", "wrong type"));
    }

}