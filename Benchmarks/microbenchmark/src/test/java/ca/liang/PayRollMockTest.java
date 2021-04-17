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

    private EmployeeList employeeList;

    private BankService bankService;

    private List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<Employee>();
        
        employeeList = mock(EmployeeList.class);
        bankService = mock(BankService.class);

        when(employeeList.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeList, bankService);
    }

    @Test
    public void testNoEmployees() {
        assertNumberOfPayments(0);
    }
    
    @Test
    public void testNoEmployeesIntra() {
        List<Employee> employees_intra = new ArrayList<Employee>();

        EmployeeList employeeList_intra = mock(EmployeeList.class);
        BankService bankService_intra = mock(BankService.class);

        when(employeeList_intra.getAllEmployees()).thenReturn(employees_intra);

        PayRoll payRoll_intra = new PayRoll(employeeList_intra, bankService_intra);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(0, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
        employees.add(createTestEmployee("Test Employee", "ID0", 1000));

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        String bankId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", bankId, salary));

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(bankId, salary);
    }

    @Test
    public void testAllEmployeesArePaid() {
        employees = createEmployees();
        
        List<Employee> employee_list = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        employee_list.add(employee1);
        employee_list.add(employee2);
        
        employees = employee_list;
        
        employeeList = mock(EmployeeList.class);
        bankService = mock(BankService.class);

        when(employeeList.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeList, bankService);
        
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals(employees.get(0).getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees.get(1).getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees.get(0).getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees.get(1).getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    
    
    @Test
    public void testInteractionOrder() {
        String bankId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", bankId, salary));

        assertNumberOfPayments(1);
        
        InOrder inOrder = inOrder(employeeList, bankService);
        inOrder.verify(employeeList).getAllEmployees();
        inOrder.verify(bankService).makePayment(bankId, salary);
    }

    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
    
    private List<Employee> createEmployees() {
    	List<Employee> employee_list = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        employee_list.add(employee1);
        employee_list.add(employee2);
        return employee_list;
    }
}
