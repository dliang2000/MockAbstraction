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

    private EmployeeDB employeeDB;

    private BankService bankService;

    private List<Employee> employees;

    @Before
    public void init() {
        employees = new ArrayList<Employee>();
        
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
    public void testNoEmployeesIntra() {
        List<Employee> employees_intra = new ArrayList<Employee>();

        EmployeeDB employeeDB_intra = mock(EmployeeDB.class);
        BankService bankService_intra = mock(BankService.class);

        when(employeeDB_intra.getAllEmployees()).thenReturn(employees_intra);

        PayRoll payRoll_intra = new PayRoll(employeeDB_intra, bankService_intra);
        
        int numberOfPayments = payRoll_intra.monthlyPayment();
        assertEquals(0, numberOfPayments);
    }
    
    @Test
    public void testSingleEmployee() {
    	Employee test_employee = createTestEmployee("Test Employee", "ID0", 1000);
        employees.add(test_employee);
        
        List<Employee> mockEmployessList = new ArrayList<>();
        mockEmployessList.add(test_employee);
        employeeDB = new EmployeeDB(mockEmployessList);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = new BankService(employee_salary);
        employee_salary.put("ID0", 1000);

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(1);
    }

    @Test
    public void testEmployeeIsPaid() {
        String bankId = "ID0";
        int salary = 1000;
        
        employees.add(createTestEmployee("Test Employee", bankId, salary));;
        
        List<Employee> mockEmployessList = new ArrayList<>();
        mockEmployessList.add(createTestEmployee("Test Employee1", bankId, salary));
        employeeDB = new EmployeeDB(mockEmployessList);
        
        Map<String, Integer> employee_salary = new HashMap<String, Integer>();
        
        bankService = mock(BankService.class);

        payRoll = new PayRoll(employeeDB, bankService);

        assertNumberOfPayments(1);

        verify(bankService, times(1)).makePayment(bankId, salary);
    }

    @Test
    public void testAllEmployeesArePaid() {
        employees.add(createTestEmployee("Test Employee1", "ID0", 1000));
        employees.add(createTestEmployee("Test Employee2", "ID1", 2000));
        
        List<Employee> mockEmployessList = new ArrayList<>();
        mockEmployessList.add(employees.get(0));
        mockEmployessList.add(employees.get(1));
        employeeDB = new EmployeeDB(mockEmployessList);
        
        bankService = mock(BankService.class);

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
    
    private void assertNumberOfPayments(int expected) {
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }

    private Employee createTestEmployee(String name, String id, int salary) {
        return new Employee(name, id, salary);
    }
}
