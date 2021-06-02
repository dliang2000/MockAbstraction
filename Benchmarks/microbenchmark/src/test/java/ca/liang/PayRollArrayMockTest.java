package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

public class PayRollArrayMockTest {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private Employee[] employees_mock;
    
    // Contains mock object
    @Before
    public void init() {
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

	// this code really has to be in init() (which it is, so that's fine)
        employees_mock = new Employee[1];
        employees_mock[0] = mock(Employee.class);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_mock));

        payRoll = new PayRoll(employeeDB, bankService);
    }
    // total mock calls: 1

    @Test
    public void testSingleEmployee() {
        assertNumberOfPayments(1);
    }
    // total mock calls: 0
    
    @Test
    public void testEmployeesPaidIntra() {
        Employee[] employees_intra = new Employee[2];
        employees_intra[0] = mock(Employee.class);
        employees_intra[1] = mock(Employee.class);
        
        EmployeeDB employeeDB_intra = new EmployeeDB(Arrays.asList(employees_intra));
        BankService bankService_intra = mock(BankService.class);

        PayRoll payRoll_intra = new PayRoll(employeeDB_intra, bankService_intra);
	// not mock
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(2, numberOfPayments);
    }
    // total mock calls: 0
    
    // Contains mock object (ee, from mock-containing array)
    @Test
    public void testSingleEmployeeFieldArrayMock() {
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;

        Employee ee = employees_mock[0];
        // *mock*
        when(ee.getName()).thenReturn(employeeName);
        // *mock*
        assertEquals(ee.getName(), employeeName);
    }
    // total mock calls: 2
    
    // Contains mock object
    @Test
    public void testSingleEmployeeLocalArrayMock() {
        Employee[] employees_local = new Employee[1];
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;

        Employee e = mock(Employee.class);
        // *mock*
        when(e.getName()).thenReturn(employeeName);

        employees_local[0] = e;
        Employee ee = employees_local[0];
        // still *mock* (but requires arrays to know)
        assertEquals(ee.getName(), employeeName);
    }
    // total mock calls: 2

    // Contains mock object
    @Test
    public void testAllEmployeesArePaidArrayIntra() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);

        Employee[] employees_mock_intra = new Employee[]{employee1, employee2};

        EmployeeDB employeeDB_intra = mock(EmployeeDB.class);
        BankService bankService_intra = mock(BankService.class);

        // *mock*
        when(employeeDB_intra.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_mock_intra));

        payRoll = new PayRoll(employeeDB_intra, bankService_intra);

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        // *mock*
        verify(bankService_intra, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock* x4
        assertEquals(employees_mock_intra[0].getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees_mock_intra[1].getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees_mock_intra[0].getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees_mock_intra[1].getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 6
    
    // Contains mock object (both intra- and inter-procedural mocks)
    @Test
    public void testAllEmployeesArePaidArrayInter() {
    	// Inter-procedural ArrayMock, must understand effects of callee createEmployees.
    	Employee[] employees_mock_local = createEmployees();

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_mock_local));

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        // *mock*
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock* interprocedural
        assertEquals(employees_mock_local[0].getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees_mock_local[1].getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees_mock_local[0].getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees_mock_local[1].getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 6

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
    
    /**
     * creates an array of four Node instances, mocked by Mockito
     */
    private Employee[] createEmployees() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        
        return new Employee[]{employee1, employee2};
    }
    // total mock calls: 0 (it creates some but doesn't invoke on them)
}
