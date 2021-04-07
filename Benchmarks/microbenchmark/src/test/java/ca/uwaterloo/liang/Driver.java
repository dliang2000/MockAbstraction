package ca.uwaterloo.liang;

public class Driver {
	public static void main(String[] argv) {
		ca.uwaterloo.liang.PayRollTest class1 = new ca.uwaterloo.liang.PayRollTest();
		class1.testNoEmployees();
		class1.testNoEmployeesIntra();
		class1.testSingleEmployee();
		class1.testEmployeeIsPaid();
		class1.testAllEmployeesArePaid();
		class1.testInteractionOrder();
		ca.uwaterloo.liang.PayRollArrayTest class2 = new ca.uwaterloo.liang.PayRollArrayTest();
		class2.testNoEmployees();
		class2.testNoEmployeesIntra();
		class2.testSingleEmployee();
		class2.testEmployeeIsPaid();
		class2.testAllEmployeesArePaidArray();
	}
}