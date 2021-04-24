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
    
    @Test
    public void testSingleEmployee() {
	// not a mock call on employees
        employees.add(createTestEmployee("Test Employee", "ID0", 1000));
        assertNumberOfPayments(1);
    }
    // total mock calls: 0

    @Test
    public void testSingleEmployeeMock() {
	Employee e = createMockEmployee();
	assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 0

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

    @Test
    public void testAllEmployeesArePaid1() {
        List<Employee> mockEmployessList = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
	// this is not a mock, it's a list of mocks
        mockEmployessList.add(employee1);
        mockEmployessList.add(employee2);

        employees = mockEmployessList;
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

	// *mock* call to getAllEmployees(), but the edge isn't in the micro call graph.
	// there is, however, a VirtualMethodInvocation in there
	// note also that employeeDB is a field, so we have to record mockness to/from the heap
        when(employeeDB.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

	// *mock* call to makePayment
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

	// *mock* calls (4) to getBankId and getSalary through a container
	// note: things that come from getAllValues().get(N) are not actually mocks, FIXME
        assertEquals(employees.get(0).getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees.get(1).getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees.get(0).getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees.get(1).getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 6

    // this is the same as testAllEmployeesArePaid1 except the declared type of mockEmployessList is ArrayList<Employee> and not List<Employee>
    @Test
    public void testAllEmployeesArePaid2() {
        ArrayList<Employee> mockEmployessList = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        mockEmployessList.add(employee1);
        mockEmployessList.add(employee2);

        employees = mockEmployessList;
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        when(employeeDB.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeDB, bankService);
        
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals(employees.get(0).getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees.get(1).getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees.get(0).getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees.get(1).getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 6

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

    // populates a real list containing mocks
    private List<Employee> createEmployees() {
    	List<Employee> employee_list = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        employee_list.add(employee1);
        employee_list.add(employee2);
        return employee_list;
    }
    // total mock calls: 0
}
