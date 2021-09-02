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
import org.junit.experimental.categories.Category;
import org.mockito.ArgumentCaptor;

public class PayRollMultipleEmployee2Test {
    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private List<Employee> employees;
    
    // Contains Mock object
    @Before
    public void init() {
        employees = new ArrayList<Employee>();
        
        ArrayList<Employee> mockEmployessList = new ArrayList<Employee>();
        Employee employee1 = mock(Employee.class);
        Employee employee2 = mock(Employee.class);
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
    @Category(MockTests.class)
    @Test
    public void testAllEmployeesArePaid() {
        assertNumberOfPayments(2);

        ArgumentCaptor<String> idCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Integer> salaryCaptor = ArgumentCaptor.forClass(Integer.class);

        // *mock* call below, verify(bankService).makePayment
        verify(bankService, times(2)).makePayment(idCaptor.capture(), salaryCaptor.capture());

        // *mock* x4 calls below because employees is a collection containing mocks
        assertEquals(employees.get(0).getBankId(), idCaptor.getAllValues().get(0));
        assertEquals(employees.get(1).getBankId(), idCaptor.getAllValues().get(1));
        assertEquals(employees.get(0).getSalary(), salaryCaptor.getAllValues().get(0).intValue());
        assertEquals(employees.get(1).getSalary(), salaryCaptor.getAllValues().get(1).intValue());
    }
    // total mock calls: 5
    
    private void assertNumberOfPayments(int expected) {
    // not mock
        int numberOfPayments = payRoll.monthlyPayment();
        assertEquals(expected, numberOfPayments);
    }
    // total mock calls: 0
}
