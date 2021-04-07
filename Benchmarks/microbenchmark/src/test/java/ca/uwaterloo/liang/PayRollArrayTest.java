package ca.uwaterloo.liang;

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

    private EmployeeList employeeList;

    private BankService bankService;

    private Employee[] employees;

    @Before
    public void init() {
        employees = new Employee[2];
        
        List<Employee> employee_List = new ArrayList<>();

        employee_List.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employee_List.add(createTestEmployee("Test Employee2", "ID1", 2000));
        
        employeeList = new EmployeeList(employee_List);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        employee_salary.put("ID0", 1000);
        employee_salary.put("ID1", 2000);
        bankService = new BankService(employee_salary);

        when(employeeList.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees));

        payRoll = new PayRoll(employees, bankService);
    }

    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    
    @Test
    public void testNoEmployeesIntra() {
        Employee[] employees_intra = new Employee[2];
        employees_intra[0] = mock(Employee.class);
        employees_intra[1] = mock(Employee.class);
        
        EmployeeList emplyeeList_intra = (EmployeeList) Arrays.asList(employees_intra);
        
        BankService bankService_intra = mock(BankService.class);

        when(emplyeeList_intra.getAllEmployees()).thenReturn((List<Employee>) Arrays.asList(employees_intra));

        PayRoll payRoll_intra = new PayRoll(employees_intra, bankService_intra);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(0, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
        employees[0] = createTestEmployee("Test Employee", "ID0", 1000);

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        String employeeId = "ID0";
        int salary = 1000;
        employees[0] = createTestEmployee("Test Employee", "ID1", 1000);

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(employeeId, salary);
    }
    
    @Test
    public void testAllEmployeesArePaidArray() {
        employees = createEmployees();

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals("ID0", idCaptor.getAllValues().get(0));
        assertEquals("ID1", idCaptor.getAllValues().get(1));
        assertEquals(1000, salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(2000, salaryCaptor.getAllValues().get(1).intValue());
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
