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
        
        employeeList = new EmployeeList(employee_List);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = new BankService(employee_salary);

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
    	Employee test_employee = createTestEmployee("Test Employee", "ID0", 1000);
        employees.add(test_employee);
        
        List<Employee> employee_List = new ArrayList<>();
        employee_List.add(test_employee);
        employeeList = new EmployeeList(employee_List);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = new BankService(employee_salary);
        employee_salary.put("ID0", 1000);

        payRoll = new PayRoll(employeeList, bankService);

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        String bankId = "ID0";
        int salary = 1000;
        
        employees.add(createTestEmployee("Test Employee", bankId, salary));;
        
        List<Employee> employee_List = new ArrayList<>();
        employee_List.add(createTestEmployee("Test Employee1", bankId, salary));
        employeeList = new EmployeeList(employee_List);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = mock(BankService.class);

        payRoll = new PayRoll(employeeList, bankService);

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(bankId, salary);
    }

    @Test
    public void testAllEmployeesArePaid() {
        employees.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employees.add(createTestEmployee("Test Employee2", "ID1", 2000));
        
        List<Employee> employee_List = new ArrayList<>();
        employee_List.add(employees.get(0));
        employee_List.add(employees.get(1));
        employeeList = new EmployeeList(employee_List);
        
        bankService = mock(BankService.class);

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
    
    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
}
