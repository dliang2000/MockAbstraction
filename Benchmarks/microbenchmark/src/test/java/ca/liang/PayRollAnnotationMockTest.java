package ca.liang;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class PayRollAnnotationMockTest {
    
    private PayRoll payRoll;
    
    @Mock
    private EmployeeDB employeeDB;
    
    @Mock
    private BankService bankService;

    private Employee[] employees;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        payRoll = new PayRoll(employeeDB, bankService);
    }
    
    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    
    @Test
    public void testEmployeesPaidIntra() {
        Employee[] employees_intra = new Employee[2];
        employees_intra[0] = mock(Employee.class);
        employees_intra[1] = mock(Employee.class);
        
        EmployeeDB employeeDB_intra = new EmployeeDB(Arrays.asList(employees_intra));

        // would be *mock* if uncommented
        //when(employeeDB_intra.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_intra));

        PayRoll payRoll_intra = new PayRoll(employees_intra, bankService);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(2, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
        employees = new Employee[1];
        employees[0] = createTestEmployee("Test Employee", "ID0", 1000);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees));

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        employees = new Employee[1];
        String employeeId = "ID0";
        int salary = 1000;
        employees[0] = createTestEmployee("Test Employee", employeeId, salary);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees));

        payRoll = new PayRoll(employeeDB, bankService);
        
        assertNumberOfPayments(1);

        // *mock*
        verify(bankService, times(1)).makePayment(employeeId, salary);
    }
    // total mocks: 2
    
    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    
}
