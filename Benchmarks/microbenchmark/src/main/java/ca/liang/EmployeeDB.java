package ca.liang;

import java.util.List;

public class EmployeeDB {
    private List<Employee> employees;
    
    public EmployeeDB(List<Employee> employees) {
        super();
        this.employees = employees;
    }
    public void targetA() {
        targetB();
    }
    public void targetB() {
        targetC();
    }
    public void targetC() {
        return;
    }
    public List<Employee> getAllEmployees() {
        targetA();
        return employees;
    }
    public int getEmployeeCount() {
        return employees.size();
    }
}
