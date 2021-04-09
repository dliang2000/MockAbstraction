package ca.liang;

import java.util.Arrays;
import java.util.List;

public class PayRoll {

    private EmployeeList employeeList;

    private BankService bankService;

    public PayRoll(EmployeeList employeeList, BankService bankService) {
        super();
        this.employeeList = employeeList;
        this.bankService = bankService;
    }
    
    public PayRoll(Employee[] employeeArr, BankService bankService) {
        super();
        this.employeeList = new EmployeeList(Arrays.asList(employeeArr));
        this.bankService = bankService;
    }
    
    public int monthlyPayment() {
        List<Employee> employees = employeeList.getAllEmployees();
        
        for (Employee employee : employees) {
            bankService.makePayment(employee.getBankId(), employee.getSalary());
        }

        return employees.size();
    }
}

