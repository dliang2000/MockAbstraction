package ca.liang;

import java.util.List;

public class EmployeeDB {
    private List<Employee> employees;
    
    public EmployeeDB(List<Employee> employees) {
        super();
        this.employees = employees;
    }
    public List<Employee> getAllEmployees() {
        return employees;
    }
}
