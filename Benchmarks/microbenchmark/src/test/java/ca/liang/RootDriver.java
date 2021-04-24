package ca.liang;

public class RootDriver {
	public static void main(String[] argv) {
		ca.liang.PayRollArrayMockTest class1 = new ca.liang.PayRollArrayMockTest();
		class1.init();
		class1.testNoEmployees();
		class1.testEmployeesPaidIntra();
		class1.testSingleEmployeeFieldArrayNomock();
		class1.testSingleEmployeeFieldArrayMock();
		class1.testSingleEmployeeLocalArrayNomock();
		class1.testSingleEmployeeLocalArrayMock();
		class1.testAllEmployeesArePaidArrayIntra();
		class1.testAllEmployeesArePaidArray();
		ca.liang.PayRollMockTest class2 = new ca.liang.PayRollMockTest();
		class2.init();
		class2.testNoEmployees();
		class2.testNoEmployeesIntra();
		class2.testSingleEmployee();
		class2.testEmployeeIsPaid();
		class2.testAllEmployeesArePaid1();
		class2.testAllEmployeesArePaid2();
		class2.testInteractionOrder();
		ca.liang.PayRollAnnotationMockTest class3 = new ca.liang.PayRollAnnotationMockTest();
		class3.init();
		class3.testNoEmployees();
		class3.testEmployeesPaidIntra();
		class3.testSingleEmployee();
		class3.testEmployeeIsPaid();
	}
}