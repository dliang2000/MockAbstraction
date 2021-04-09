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
		class2.testAllEmployeesArePaid();
		class2.testInteractionOrder();
		ca.liang.PayRollTest class3 = new ca.liang.PayRollTest();
		class3.testNoEmployees();
		class3.testNoEmployeesIntra();
		class3.testSingleEmployee();
		class3.testEmployeeIsPaid();
		class3.testAllEmployeesArePaid();
		ca.liang.Driver class4 = new ca.liang.Driver();
		ca.liang.PayRollArrayTest class5 = new ca.liang.PayRollArrayTest();
		class5.testNoEmployees();
		class5.testEmployeesPaidIntra();
		class5.testSingleEmployee();
		class5.testEmployeeIsPaid();
		class5.testAllEmployeesArePaidArray();
	}
}