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
		ca.liang.PayRollMultipleEmployee2Test class3 = new ca.liang.PayRollMultipleEmployee2Test();
		class3.init();
		class3.testAllEmployeesArePaid();
		ca.liang.PayRollMultipleEmployeeTest class4 = new ca.liang.PayRollMultipleEmployeeTest();
		class4.init();
		class4.testAllEmployeesArePaid1();
		class4.testAllEmployeesArePaid2();
		ca.liang.PayRollMockTest class5 = new ca.liang.PayRollMockTest();
		class5.init();
		class5.testNoEmployees();
		class5.testNoEmployeesIntra();
		class5.testSingleEmployee();
		class5.testSingleEmployeeMock();
		class5.testEmployeeIsPaid();
		class5.testInteractionOrder();
		ca.liang.DirtyTest class6 = new ca.liang.DirtyTest();
		class6.init();
		class6.testSingleEmployeeFieldArrayNomock();
		ca.liang.PayRollAnnotationMockTest class7 = new ca.liang.PayRollAnnotationMockTest();
		class7.init();
		class7.testEmployeesPaidIntra();
		class7.testSingleEmployee();
		class7.testEmployeeIsPaid();
	}
}