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

public class PayRollArrayTest {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private Employee[] employees;

    @Before
    public void init() {
        employees = new Employee[2];
        
        List<Employee> mockEmployessList = new ArrayList<>();
        
        employeeDB = new EmployeeDB(mockEmployessList);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = new BankService(employee_salary);

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
        
        EmployeeDB employeeDB_intra = mock(EmployeeDB.class);
        
        BankService bankService_intra = mock(BankService.class);

        when(employeeDB_intra.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_intra));

        PayRoll payRoll_intra = new PayRoll(employees_intra, bankService_intra);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(2, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
    	employees = new Employee[1];
        employees[0] = mock(Employee.class);
        
        employeeDB = mock(EmployeeDB.class);
        
        bankService = mock(BankService.class);

        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees));

        payRoll = new PayRoll(employeeDB, bankService);
        
        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
    	employees = new Employee[1];
        String bankId = "ID0";
        int salary = 1000;
        employees[0] = createTestEmployee("Test Employee", "ID0", 1000);
        
        employeeDB = mock(EmployeeDB.class);
        
        bankService = mock(BankService.class);

        when(employeeDB.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees));

        payRoll = new PayRoll(employeeDB, bankService);
        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(bankId, salary);
    }
    
    @Test
    public void testAllEmployeesArePaidArray() {
        employees = createEmployees();
        
        List<Employee> mockEmployessList = new ArrayList<>();
        mockEmployessList.add(employees[0]);
        mockEmployessList.add(employees[1]);
        
        employeeDB = new EmployeeDB(mockEmployessList);
        
        bankService = mock(BankService.class);

        payRoll = new PayRoll(employeeDB, bankService);
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals(employees[0].getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees[1].getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees[0].getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees[1].getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }

    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    
    /**
     * creates an array of four Node instances, mocked by EasyMock.
     */
    private Employee[] createEmployees() {
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        
        return new Employee[]{employee1, employee2};
    }
}
