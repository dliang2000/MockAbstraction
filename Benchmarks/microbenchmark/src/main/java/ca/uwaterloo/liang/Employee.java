package ca.uwaterloo.liang;

public class Employee {
    private String name;
    private String bankId;
    private int salary;

    public Employee(String name, String bankId, int salary) {
        this.name = name;
        this.bankId = bankId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getBankId() {
        return bankId;
    }

    public int getSalary() {
        return salary;
    }
}
