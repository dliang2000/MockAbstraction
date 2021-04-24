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

    private Employee[] employees_nomock;
    private Employee[] employees_mock;

    @Before
    public void init() {
        employees_nomock = new Employee[0];
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        // this is actually incorrect mock usage code I think,
        // shouldn't leave mocks around between classes.
        // but it investigates how the analysis works.
        employees_mock = new Employee[1];
        employees_mock[0] = mock(Employee.class);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_nomock));

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
        
        BankService bankService_intra = mock(BankService.class);

        PayRoll payRoll_intra = new PayRoll(employees_intra, bankService_intra);
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(2, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployeeFieldArrayNomock() {
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;
        employees_nomock = new Employee[1];
        employees_nomock[0] = new Employee(employeeName, employeeID, salary);

        Employee e = employees_nomock[0];
        assertEquals(e.getName(), employeeName);
    }

    @Test
    public void testSingleEmployeeFieldArrayMock() {
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;

        Employee ee = employees_mock[0];
        when(ee.getName()).thenReturn(employeeName);
        assertEquals(ee.getName(), employeeName);
    }

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

    @Test
    public void testSingleEmployeeLocalArrayMock() {
        Employee[] employees_local = new Employee[1];
        String employeeName = "Test Employee";
        String employeeID = "ID0";
        int salary = 1000;

        Employee e = mock(Employee.class);
        // mock
        when(e.getName()).thenReturn(employeeName);

        employees_local[0] = e;
        Employee ee = employees_local[0];
        // still mock (but requires arrays to know)
        assertEquals(ee.getName(), employeeName);
    }

    @Test
    public void testAllEmployeesArePaidArrayIntra() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);

        employees_mock = new Employee[]{employee1, employee2};

        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_mock));

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        // *mock*
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock*
        assertEquals(employees_mock[0].getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees_mock[1].getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees_mock[0].getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees_mock[1].getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }

    @Test
    public void testAllEmployeesArePaidArray() {
        employees_mock = createEmployees();
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

        // *mock*
        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_mock));

        payRoll = new PayRoll(employeeDB, bankService);
        
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        // *mock*
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock* interprocedural
        assertEquals(employees_mock[0].getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees_mock[1].getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees_mock[0].getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees_mock[1].getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }

    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    
    /**
     * creates an array of four Node instances, mocked by Mockito
     */
    private Employee[] createEmployees() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        
        return new Employee[]{employee1, employee2};
    }
}
