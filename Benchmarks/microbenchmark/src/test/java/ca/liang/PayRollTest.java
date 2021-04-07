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

public class PayRollTest {

    private PayRoll payRoll;

    private EmployeeList employeeList;

    private BankService bankService;

    private List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<Employee>();
        
        List<Employee> employee_List = new ArrayList<>();

        employee_List.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employee_List.add(createTestEmployee("Test Employee2", "ID1", 2000));
        
        employeeList = new EmployeeList(employee_List);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        employee_salary.put("ID0", 1000);
        employee_salary.put("ID1", 2000);
        bankService = new BankService(employee_salary);

        //when(employeeList.getAllEmployees()).thenReturn(employees);

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
        String employeeId = "ID0";
        int salary = 1000;

        employees.add(createTestEmployee("Test Employee", employeeId, salary));

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(employeeId, salary);
    }

    @Test
    public void testAllEmployeesArePaid() {
        employees.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employees.add(createTestEmployee("Test Employee2", "ID1", 2000));

        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        assertEquals("ID0", idCaptor.getAllValues().get(0));
        assertEquals("ID1", idCaptor.getAllValues().get(1));
        assertEquals(1000, salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(2000, salaryCaptor.getAllValues().get(1).intValue());
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
}
