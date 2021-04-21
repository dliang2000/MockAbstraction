package ca.liang;

import java.util.Arrays;
import java.util.List;

public class PayRoll {

    private EmployeeDB employees;

    private BankService bankService;

    public PayRoll(EmployeeDB employees, BankService bankService) {
        super();
        this.employees = employees;
        this.bankService = bankService;
    }
    
    public PayRoll(Employee[] employeeArr, BankService bankService) {
        super();
        this.employees = new EmployeeDB(Arrays.asList(employeeArr));
        this.bankService = bankService;
    }
    
    public int monthlyPayment() {
        List<Employee> employeeList = employees.getAllEmployees();
        
        for (Employee employee : employeeList) {
            bankService.makePayment(employee.getBankId(), employee.getSalary());
        }

        return employeeList.size();
    }
}

