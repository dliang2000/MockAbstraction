package ca.liang;

public class RootDriver {
	public static void main(String[] argv) {
		ca.liang.PayRollAnnotationMockTest class1 = new ca.liang.PayRollAnnotationMockTest();
		class1.init();
		class1.testEmployeesPaidIntra();
		class1.testSingleEmployee();
		class1.testEmployeeIsPaid();
		class1.testBankService();
		ca.liang.PayRollArrayNoMockTest class2 = new ca.liang.PayRollArrayNoMockTest();
		class2.init();
		class2.testNoEmployees();
		class2.testSingleEmployeeLocalArrayNomock();
		ca.liang.PayRollArrayMockTest class3 = new ca.liang.PayRollArrayMockTest();
		class3.init();
		class3.testSingleEmployee();
		class3.testEmployeesPaidIntra();
		class3.testSingleEmployeeFieldArrayMock();
		class3.testSingleEmployeeLocalArrayMock();
		class3.testAllEmployeesArePaidArrayIntra();
		class3.testAllEmployeesArePaidArrayInter();
		ca.liang.PayRollMultipleEmployee2Test class4 = new ca.liang.PayRollMultipleEmployee2Test();
		class4.init();
		class4.testAllEmployeesArePaid();
		ca.liang.PayRollMockTest class5 = new ca.liang.PayRollMockTest();
		class5.init();
		class5.testNoEmployees();
		class5.testNoEmployeesIntra();
		class5.testAddAll();
		class5.testIteration();
		class5.testSingleEmployee();
		class5.testSingleEmployeeMockInter();
		class5.testEmployeeIsPaid();
		class5.testInteractionOrder();
		ca.liang.PayRollMultipleEmployeeTest class6 = new ca.liang.PayRollMultipleEmployeeTest();
		class6.init();
		class6.testAllEmployeesArePaid1();
		class6.testAllEmployeesArePaid2();
		ca.liang.DirtyTest class7 = new ca.liang.DirtyTest();
		class7.init();
		class7.testSingleEmployeeFieldArrayNomock();
	}
}