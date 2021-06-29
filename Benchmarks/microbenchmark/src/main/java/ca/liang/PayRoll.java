package ca.liang;

import java.util.Arrays;
import java.util.List;

public class PayRoll {

    private EmployeeDB employees;

    // note: this field really does sometimes get initialized with mocks in our tests
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
        // potentially a mock call
        List<Employee> employeeList = employees.getAllEmployees();
        
        for (Employee employee : employeeList) {
            // potentially mock, due to our tests
            bankService.makePayment(employee.getBankId(), employee.getSalary());
        }

        return employeeList.size();
    }
    // total mock calls: 2
}
