package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

public class PayRollMockTest {

    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private List<Employee> employees;
    
    // Contains Mock object
    @Before
    public void init() {
        employees = new ArrayList<Employee>();

        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

	// *mock* call below, employeeDB.getAllEmployees()
        when(employeeDB.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeDB, bankService);
    }
    // total mock calls: 1

    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    // total mock calls: 0
    
    // Contains mock object
    @Test
    public void testNoEmployeesIntra() {
        List<Employee> employees_intra = new ArrayList<Employee>();

        EmployeeDB employeeDB_intra = mock(EmployeeDB.class);
        BankService bankService_intra = mock(BankService.class);

	// *mock* call below employeeDB_intra.getAllEmployees()
        when(employeeDB_intra.getAllEmployees()).thenReturn(employees_intra);

        PayRoll payRoll_intra = new PayRoll(employeeDB_intra, bankService_intra);

	// not a mock call, we have a real PayRoll object
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(0, numberOfPayments);
    }
    // total mock calls: 1

    // Contains mock object
    @Test
    public void testAddAll() {
        List<Employee> employees1_intra = new ArrayList<Employee>();
        List<Employee> employees2_intra = new ArrayList<Employee>();

        Employee e = mock(Employee.class);
        when(e.getName()).thenReturn("J. Doe");
        assertEquals(e.getName(), "J. Doe");

        employees1_intra.add(e);
        employees2_intra.addAll(employees1_intra);

        Employee e1 = employees1_intra.get(0);
	    // *mock* call below
        assertEquals(e1.getName(), "J. Doe");

	    Employee e2 = employees2_intra.get(0);
	    // *mock* call below
        assertEquals(e2.getName(), "J. Doe");
    }
    // total mock calls: 4

    @Test
    public void testSingleEmployee() {
	// not a mock call on employees
        employees.add(createTestEmployee("Test Employee", "ID0", 1000));
        assertNumberOfPayments(1);
    }
    // total mock calls: 0
    
    // Contains inter-procedural mock object 
    @Test
    public void testSingleEmployeeMockInter() {
    	Employee e = createMockEmployee();
    	assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1
    
    // Contains mock object (from verify() call)
    @Test
    public void testEmployeeIsPaid() {
        String bankId = "ID0";
        int salary = 1000;

	// not a mock call on employees
        employees.add(createTestEmployee("Test Employee", bankId, salary));

        assertNumberOfPayments(1);

	// makePayment is a *mock* call on what gets returned from verify(), which is a mock verification object
        verify(bankService, times(1)).makePayment(bankId, salary);
    }
    // total mock calls: 1

    // Contains mock object (from verify() call)
    @Test
    public void testEmployeeIsPaid_singleVerify() {
        String bankId = "ID0";
        int salary = 1000;

	// not a mock call on employees
        employees.add(createTestEmployee("Test Employee", bankId, salary));

        assertNumberOfPayments(1);

	// makePayment is a *mock* call on what gets returned from verify(), which is a mock verification object
        verify(bankService).makePayment(bankId, salary);
    }
    // total mock calls: 1
    
    // tests marking fields (employeeDB, bankService) as mock-containing (due to init)
    @Test
    public void testInteractionOrder() {
        String bankId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", bankId, salary));

        assertNumberOfPayments(1);

        InOrder inOrder = inOrder(employeeDB, bankService);
	// these calls below are on mock-verify objects
        inOrder.verify(employeeDB).getAllEmployees();
        inOrder.verify(bankService).makePayment(bankId, salary);
    }
    // total mock calls: 2

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

    private Employee createMockEmployee() {
    	Employee e = mock(Employee.class);
    	when(e.getName()).thenReturn("J. Doe");
    	when(e.getBankId()).thenReturn("ID21");
    	when(e.getSalary()).thenReturn(234);
    	return e;
    }
    // total mock calls: 3
}
