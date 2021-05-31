package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class PayRollMultipleEmployeeTest {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private List<Employee> employees;
    
    // Contains Mock object
    @Before
    public void init() {
        employees = new ArrayList<Employee>();
        
        List<Employee> mockEmployessList = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        // this is not a mock, it's a list of mocks
        mockEmployessList.add(employee1);
        mockEmployessList.add(employee2);

        employees = mockEmployessList;
        
        employeeDB = mock(EmployeeDB.class);
        bankService = mock(BankService.class);

    // *mock* call below, employeeDB.getAllEmployees()
        when(employeeDB.getAllEmployees()).thenReturn(employees);

        payRoll = new PayRoll(employeeDB, bankService);
    }
    // total mock calls: 1
    
    // Contains mock object
    @Test
    public void testAllEmployeesArePaid1() {
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

	// *mock* call to makePayment
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock* calls (4) to getBankId and getSalary through a container
        // note: things that come from getAllValues().get(N) are not actually mocks
        assertEquals(employees.get(0).getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees.get(1).getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees.get(0).getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees.get(1).getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 5
    
    // Contains mock object
    // this is the same as testAllEmployeesArePaid1 except the declared type of mockEmployessList is ArrayList<Employee> 
    // and not List<Employee>
    @Test
    public void testAllEmployeesArePaid2() {
        ArrayList<Employee> mockEmployessList = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
        mockEmployessList.add(employee1);
        mockEmployessList.add(employee2);

        employees = mockEmployessList;

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
    
    private void assertNumberOfPayments(int expected) {
    // not mock
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }
    // total mock calls: 0
}
