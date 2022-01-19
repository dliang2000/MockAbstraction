package ca.liang;

public class RootDriver {
	public static void main(String[] argv) {
//		ca.liang.PayRollAnnotationMockTest class1 = new ca.liang.PayRollAnnotationMockTest();
//		class1.init();
//		class1.testEmployeesPaidIntra();
//		class1.testSingleEmployee();
//		class1.testEmployeeIsPaid();
//		class1.testBankService();
//		ca.liang.PayRollArrayNoMockTest class2 = new ca.liang.PayRollArrayNoMockTest();
//		class2.init();
//		class2.testNoEmployees();
//		class2.testSingleEmployeeLocalArrayNomock();
//		ca.liang.PayRollArrayMockTest class3 = new ca.liang.PayRollArrayMockTest();
//		class3.init();
//		class3.testSingleEmployee();
//		class3.testEmployeesPaidIntra();
//		class3.testSingleEmployeeFieldArrayMock();
//		class3.testSingleEmployeeLocalArrayMock();
//		class3.testAllEmployeesArePaidArrayIntra();
//		class3.testAllEmployeesArePaidArrayInter();
//		ca.liang.PayRollMultipleEmployee2Test class4 = new ca.liang.PayRollMultipleEmployee2Test();
//		class4.init();
//		class4.testAllEmployeesArePaid();
//		ca.liang.PayRollMockMarginalCollectionsTest class5 = new ca.liang.PayRollMockMarginalCollectionsTest();
//		class5.init();
//		class5.test0();
//		class5.test1();
//		class5.test2();
//		class5.test3();
//		class5.test4();
//		class5.test5();
//		class5.test6();
//		class5.testPQ1();
//		class5.testPQ2();
//		class5.testPQ3();
//		class5.testPQ4();
//		class5.testTS();
//		class5.testTS1();
//		class5.testDQ();
//		class5.testDescendingSet();
//		class5.testFloorCeiling();
//		class5.testHigherLower();
//		class5.testHeadSet();
//		class5.testTailSet();
//		class5.testSubSet();
		ca.liang.PayRollMockTest class6 = new ca.liang.PayRollMockTest();
		class6.init();
		class6.testMerge();
		class6.testNoEmployees();
		class6.testNoEmployeesIntra();
		class6.testAddAll();
		class6.testIteration();
		class6.testVector();
		class6.testVector2();
		class6.testVectorToArray();
		class6.testArrayToVector();
		class6.testSingleEmployee();
		class6.testSingleEmployeeMockInter();
		class6.testSingleEmployeeMockCallout();
		class6.testEmployeeIsPaid();
		class6.testEmployeeIsPaid_singleVerify();
		class6.testInteractionOrder();
//		ca.liang.PayRollMultipleEmployeeTest class7 = new ca.liang.PayRollMultipleEmployeeTest();
//		class7.init();
//		class7.testAllEmployeesArePaid1();
//		class7.testAllEmployeesArePaid2();
//		ca.liang.DirtyTest class8 = new ca.liang.DirtyTest();
//		class8.init();
//		class8.testSingleEmployeeFieldArrayNomock();

		B objB = new B();
		C objC = new C();
		D objD = new D();
		//All classes can access the method of class A
		objB.methodA();
		objC.methodA();
		objD.methodA();

        objB.methodB();
		objC.methodC();
		objD.methodD();
	}
}
