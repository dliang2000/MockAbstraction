package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DirtyTest {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private Employee[] employees_nomock;
    
    // Creates mock objects but doesn't put any mocks in the array.
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
    public void testSingleEmployeeFieldArrayNomock() {
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;
        // this writes to the field, we probably don't actually want this in the test, but we do want it as a test of our fieldwrite-detecting analysis
        employees_nomock = new Employee[1];
        employees_nomock[0] = new Employee(employeeName, employeeID, salary);

        Employee e = employees_nomock[0];
    // not mock
        assertEquals(e.getName(), employeeName);
    }
    // total mock calls: 0
    
}
