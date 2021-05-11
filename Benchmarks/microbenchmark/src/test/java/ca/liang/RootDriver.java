package ca.liang;

public class RootDriver {
	public static void main(String[] argv) {
		ca.liang.PayRollArrayNoMockTest class1 = new ca.liang.PayRollArrayNoMockTest();
		class1.init();
		class1.testNoEmployees();
		class1.testSingleEmployeeLocalArrayNomock();
		ca.liang.PayRollArrayMockTest class2 = new ca.liang.PayRollArrayMockTest();
		class2.init();
		class2.testSingleEmployee();
		class2.testEmployeesPaidIntra();
		class2.testSingleEmployeeFieldArrayMock();
		class2.testSingleEmployeeLocalArrayMock();
		class2.testAllEmployeesArePaidArrayIntra();
		class2.testAllEmployeesArePaidArray();
		ca.liang.PayRollMockTest class3 = new ca.liang.PayRollMockTest();
		class3.init();
		class3.testNoEmployees();
		class3.testNoEmployeesIntra();
		class3.testSingleEmployee();
		class3.testSingleEmployeeMock();
		class3.testEmployeeIsPaid();
		class3.testAllEmployeesArePaid1();
		class3.testAllEmployeesArePaid2();
		class3.testInteractionOrder();
		ca.liang.DirtyTest class4 = new ca.liang.DirtyTest();
		class4.init();
		class4.testSingleEmployeeFieldArrayNomock();
		ca.liang.PayRollAnnotationMockTest class5 = new ca.liang.PayRollAnnotationMockTest();
		class5.init();
		class5.testNoEmployees();
		class5.testEmployeesPaidIntra();
		class5.testSingleEmployee();
		class5.testEmployeeIsPaid();
	}
}