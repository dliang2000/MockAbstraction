package ca.liang;

public class RootDriver {
	public static void main(String[] argv) {
		ca.liang.PayRollTest class1 = new ca.liang.PayRollTest();
		class1.init();
		class1.testNoEmployees();
		class1.testNoEmployeesIntra();
		class1.testSingleEmployee();
		class1.testEmployeeIsPaid();
		class1.testAllEmployeesArePaid();
		ca.liang.PayRollArrayMockTest class2 = new ca.liang.PayRollArrayMockTest();
		class2.init();
		class2.testNoEmployees();
		class2.testEmployeesPaidIntra();
		class2.testSingleEmployeeFieldArrayNomock();
		class2.testSingleEmployeeFieldArrayMock();
		class2.testSingleEmployeeLocalArrayNomock();
		class2.testSingleEmployeeLocalArrayMock();
		class2.testAllEmployeesArePaidArrayIntra();
		class2.testAllEmployeesArePaidArray();
		ca.liang.PayRollArrayTest class3 = new ca.liang.PayRollArrayTest();
		class3.init();
		class3.testNoEmployees();
		class3.testEmployeesPaidIntra();
		class3.testSingleEmployee();
		class3.testEmployeeIsPaid();
		class3.testAllEmployeesArePaidArray();
		ca.liang.PayRollAnnotationMockTest class4 = new ca.liang.PayRollAnnotationMockTest();
		class4.init();
		class4.testNoEmployees();
		class4.testEmployeesPaidIntra();
		class4.testSingleEmployee();
		class4.testEmployeeIsPaid();
		ca.liang.PayRollMockTest class5 = new ca.liang.PayRollMockTest();
		class5.init();
		class5.testNoEmployees();
		class5.testNoEmployeesIntra();
		class5.testSingleEmployee();
		class5.testEmployeeIsPaid();
		class5.testAllEmployeesArePaid1();
		class5.testAllEmployeesArePaid2();
		class5.testInteractionOrder();
		ca.liang.RootDriver class6 = new ca.liang.RootDriver();
	}
}