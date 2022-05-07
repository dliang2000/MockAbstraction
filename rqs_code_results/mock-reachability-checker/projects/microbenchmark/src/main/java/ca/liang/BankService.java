package ca.liang;

import java.util.Map;

public class BankService {
    private Map<String, Integer> employee_salary;
    public BankService(Map<String, Integer> employee_salary) {
        super();
        this.employee_salary = employee_salary;
    }
    
    public void makePayment(String bankId, int salary) {
        employee_salary.put(bankId, employee_salary.getOrDefault(bankId, 0) + salary);
    }
}
