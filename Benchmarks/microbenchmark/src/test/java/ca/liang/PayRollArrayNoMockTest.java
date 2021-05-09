package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PayRollArrayNoMockTest {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private Employee[] employees_nomock;
    
    // Contains mock object
    @Before
    public void init() {
        employees_nomock = new Employee[0];
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_nomock));

        payRoll = new PayRoll(employeeDB, bankService);
    }
    // total mock calls: 1
    

    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    // total mock calls: 0
    
    @Test
    public void testSingleEmployeeFieldArrayNomock() {
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;
        employees_nomock = new Employee[1];
        employees_nomock[0] = new Employee(employeeName, employeeID, salary);

        Employee e = employees_nomock[0];
	// not mock
        assertEquals(e.getName(), employeeName);
    }
    // total mock calls: 0
    
    @Test
    public void testSingleEmployeeLocalArrayNomock() {
        Employee[] employees_nomock = new Employee[1];
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;
        employees_nomock[0] = new Employee(employeeName, employeeID, salary);
        Employee e = employees_nomock[0];
        assertEquals(e.getName(), employeeName);
    }
    // total mock calls: 0
    
    private void assertNumberOfPayments(int expected) {
	// not mock
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }
    // total mock calls: 0

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    // total mock calls: 0
    
}
