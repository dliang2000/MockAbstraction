package ca.uwaterloo.liang;

import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;
    
    public EmployeeList(List<Employee> employeeList) {
        super();
        this.employeeList = employeeList;
    }
    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}
