## Run Tests with different groups

We will explain how to run tests with different groups:
- All Test Cases
- Test Cases with no mock objects
- Test Cases with mock objects.

Define two interfaces in test suite:
- NoMockTests
- MockTests

Makse sure to include maven-surefile-plugin and jacoco-maven-plugin in pom.xml file.

Define Category for each test case (or test class) in the following manner (from https://github.com/junit-team/junit4/wiki/categories):

```java
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class A {
  @Test
  public void a() {
    fail();
  }

  @Category(SlowTests.class)
  @Test
  public void b() {
  }
}

@Category({SlowTests.class, FastTests.class})
public class B {
  @Test
  public void c() {

  }
}

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite {
  // Will run A.b and B.c, but not A.a
}

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@ExcludeCategory(FastTests.class)
@SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite {
  // Will run A.b, but not A.a or B.c
}
```

### Maven command
- All tests:
```bash
mvn clean test
```

- Test Cases with no mock objects:
```bash
mvn clean test -Dgroups='x.y.z.NoMockTests'
```

- Test Cases with mock objects:
```bash
mvn clean test -Dgroups='x.y.z.MockTests'
```
