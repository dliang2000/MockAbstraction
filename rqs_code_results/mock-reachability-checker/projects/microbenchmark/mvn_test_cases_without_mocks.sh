mvn -Dtest=PayRollArrayNoMockTest\#testNoEmployees+testSingleEmployeeLocalArrayNomock test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/PayRollArrayNoMockTest.exec

mvn -Dtest=PayRollArrayMockTest\#testSingleEmployee test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/PayRollArrayMockTest.exec

mvn -Dtest=PayRollMockMarginalCollectionsTest\#testDescendingSet+testPQ1+testPQ2+testPQ3+testPQ4+testTS+testTS1 test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/PayRollMockMarginalCollectionsTest.exec

mvn -Dtest=PayRollMockTest\#testNoEmployees+testSingleEmployee+testSingleEmployeeMockCallout+testSingleEmployeeMockInter test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/PayRollMockTest.exec


mvn -Dtest=DirtyTest\#testSingleEmployeeFieldArrayNomock test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/DirtyTest.exec

mvn -Dtest=PayRollAnnotationMockTest\#testSingleEmployee test
cp target/jacoco.exec execFiles/
mv execFiles/jacoco.exec execFiles/PayRollAnnotationMockTest.exec
