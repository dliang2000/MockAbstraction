package ca.liang;

public class Driver {
	public static void main(String[] argv) {
		ca.liang.PayRollArrayMockTest class1 = new ca.liang.PayRollArrayMockTest();
		class1.testNoEmployees();
		class1.testEmployeesPaidIntra();
		class1.testSingleEmployee();
		class1.testEmployeeIsPaid();
		class1.testAllEmployeesArePaidArray();
		ca.liang.PayRollMockTest class2 = new ca.liang.PayRollMockTest();
		class2.testNoEmployees();
		class2.testNoEmployeesIntra();
		class2.testSingleEmployee();
		class2.testEmployeeIsPaid();
		class2.testAllEmployeesArePaid1();
		class2.testAllEmployeesArePaid2();
		class2.testInteractionOrder();
		ca.liang.PayRollTest class3 = new ca.liang.PayRollTest();
		class3.testNoEmployees();
		class3.testNoEmployeesIntra();
		class3.testSingleEmployee();
		class3.testEmployeeIsPaid();
		class3.testAllEmployeesArePaid();
		ca.liang.PayRollArrayTest class4 = new ca.liang.PayRollArrayTest();
		class4.testNoEmployees();
		class4.testEmployeesPaidIntra();
		class4.testSingleEmployee();
		class4.testEmployeeIsPaid();
		class4.testAllEmployeesArePaidArray();
	}
}