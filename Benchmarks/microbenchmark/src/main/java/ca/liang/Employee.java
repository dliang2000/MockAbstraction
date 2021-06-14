package ca.liang;

public class Employee implements Comparable<Employee> {
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

    public int compareTo(Employee o) {
	return salary - o.salary;
    }
}
