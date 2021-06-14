package ca.liang;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Deque;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

public class PayRollMockMarginalCollectionsTest {

    private PayRoll payRoll;

    private EmployeeDB employeeDB;

    private BankService bankService;

    private List<Employee> employees0;

    private Deque<Employee> employees1;
    private Deque<Employee> employees2;
    private Deque<Employee> employees3;
    private Deque<Employee> employees4;
    private Deque<Employee> employees5;
    private Deque<Employee> employees6;

    private SortedSet<Employee> ss;
    private PriorityQueue<Employee> pq, pq1, pq2;
    private TreeSet<Employee> ts;
    private Deque<Employee> dq, dq1, dq2, dq3, dq4;

    @Before
    public void init() {
        employees0 = new ArrayList<Employee>();

        employees1 = new ArrayDeque<Employee>();
        employees2 = new ArrayDeque<Employee>();
        employees3 = new ArrayDeque<Employee>();
        employees4 = new ArrayDeque<Employee>();
        employees5 = new ArrayDeque<Employee>();
        employees6 = new ArrayDeque<Employee>();

        Employee e = mock(Employee.class);
        // *mock*
        when(e.getName()).thenReturn("J. Doe");
        // *mock*
        when(e.getSalary()).thenReturn(5);

        employees0.add(e);
        employees1.addFirst(e);
        employees2.addLast(e);
        employees3.offerFirst(e);
        employees4.offerLast(e);
        employees5.offer(e);
        employees6.push(e);

        pq = new PriorityQueue<Employee>();
        pq.add(e);
        pq1 = new PriorityQueue<Employee>(pq);

        ss = new TreeSet<Employee>();
        ss.add(e);
        pq2 = new PriorityQueue<Employee>(ss);

        ts = new TreeSet<Employee>(ss);

        dq = new ArrayDeque<Employee>();
        // *mock* x5
        when(e.getName()).thenReturn("J. Doe");
        when(e.getName()).thenReturn("J. Doe");
        when(e.getName()).thenReturn("J. Doe");
        when(e.getName()).thenReturn("J. Doe");
        when(e.getName()).thenReturn("J. Doe");
        dq.add(e);

        Employee ee = mock(Employee.class);
        // *mock*
        when(ee.getName()).thenReturn("J. Doe");

        dq1 = new ArrayDeque<Employee>();
        dq1.add(ee);

        Employee eee = mock(Employee.class);
        // *mock*
        when(eee.getName()).thenReturn("J. Doe");

        dq2 = new ArrayDeque<Employee>();
        dq2.add(eee);

        Employee ee3 = mock(Employee.class);
        // *mock*
        when(ee3.getName()).thenReturn("J. Doe");

        dq3 = new ArrayDeque<Employee>();
        dq3.add(ee3);

        Employee ee4 = mock(Employee.class);
        // *mock*
        when(ee4.getName()).thenReturn("J. Doe");

        dq4 = new ArrayDeque<Employee>();
        dq4.add(eee);
    }
    // total mock calls: 11

    // calibration test
    @Test
    public void test0() {
        Employee e = employees0.get(0);
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test1() {
        Employee e = employees1.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test2() {
        Employee e = employees2.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test3() {
        Employee e = employees3.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test4() {
        Employee e = employees4.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test5() {
        Employee e = employees5.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void test6() {
        Employee e = employees6.pop();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testPQ1() {
        Employee e = pq1.peek();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testPQ2() {
        Employee e = pq2.poll();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testPQ3() {
        Employee e = pq2.element();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testPQ4() {
        Employee e = pq2.remove();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testTS() {
        Employee e = ts.first();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testTS1() {
        Employee e = ts.last();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testDQ() {
        Employee e2 = dq.peekLast();
        // *mock*
        assertEquals(e2.getName(), "J. Doe");

        Employee e3 = dq.peekFirst();
        // *mock*
        assertEquals(e3.getName(), "J. Doe");

        Employee e4 = dq.getFirst();
        // *mock*
        assertEquals(e4.getName(), "J. Doe");

        Employee e5 = dq.getLast();
        // *mock*
        assertEquals(e5.getName(), "J. Doe");

        Employee ee3 = dq.removeFirst();
        // *mock*
        assertEquals(ee3.getName(), "J. Doe");

        Employee e = dq3.pollFirst();
        // *mock*
        assertEquals(e.getName(), "J. Doe");

        Employee e1 = dq4.pollLast();
        // *mock*
        assertEquals(e1.getName(), "J. Doe");

        Employee ee4 = dq1.removeLast();
        // *mock*
        assertEquals(ee4.getName(), "J. Doe");

        Employee ee5 = dq2.pop();
        // *mock*
        assertEquals(ee5.getName(), "J. Doe");
    }
    // total mock calls: 9

    @Test
    public void testDescendingSet() {
        // check descendingSet
        NavigableSet<Employee> ds = ts.descendingSet();
        Employee e = ds.first();
        // *mock*
        assertEquals(e.getName(), "J. Doe");
    }
    // total mock calls: 1

    @Test
    public void testFloorCeiling() {
        TreeSet<Employee> ts_intra = new TreeSet<Employee>();

        Employee e0 = new Employee("P", "", 5);
        Employee e1 = new Employee("Q", "", 1);

        Employee em = mock(Employee.class);
        // *mock* x3
        when(em.getSalary()).thenReturn(5);
        when(em.getName()).thenReturn("R");
        when(em.compareTo(any(Employee.class))).thenReturn(0);
        ts_intra.add(em);

        Employee e2 = ts_intra.floor(e0);
        // *mock*
        assertEquals(e2.getName(), "R");

        Employee e3 = ts_intra.ceiling(e1);
        // *mock*
        assertEquals(e2.getName(), "R");
    }
    // total mock calls: 5

    @Test
    public void testHigherLower() {
        TreeSet<Employee> ts_intra = new TreeSet<Employee>();

        Employee e0 = new Employee("P", "", 10);
        Employee e1 = new Employee("Q", "", 1);

        Employee em = mock(Employee.class);
        // *mock* x2
        when(em.getSalary()).thenReturn(5);
        when(em.getName()).thenReturn("R");
        ts_intra.add(em);

        Employee e2 = ts_intra.lower(e1);
        // *mock*
        assertEquals(e2.getName(), "R");

        Employee e3 = ts_intra.higher(e0);
        // *mock*
        assertEquals(e2.getName(), "R");
    }
    // total mock calls: 4

    @Test
    public void testHeadSet() {
        TreeSet<Employee> ts_intra = new TreeSet<Employee>();

        Employee e0 = new Employee("P", "", 10);
        Employee e1 = new Employee("Q", "", 1);

        Employee em = mock(Employee.class);
        // *mock* x2
        when(em.getSalary()).thenReturn(5);
        when(em.getName()).thenReturn("R");
        ts_intra.add(e1);
        ts_intra.add(em);

        SortedSet<Employee> sse = ts_intra.headSet(e0);
        // *mock*
        assertEquals(sse.first().getName(), "Q");

        NavigableSet<Employee> ssei = ts_intra.headSet(e0, false);
        // *mock*
        assertEquals(ssei.first().getName(), "Q");
    }
    // total mock calls: 4

    @Test
    public void testTailSet() {
        TreeSet<Employee> ts_intra = new TreeSet<Employee>();

        Employee e0 = new Employee("P", "", 10);
        Employee e1 = new Employee("Q", "", 1);

        Employee em = mock(Employee.class);
        // *mock* x2
        when(em.getSalary()).thenReturn(5);
        when(em.getName()).thenReturn("R");
        ts_intra.add(em);
        ts_intra.add(e0);

        SortedSet<Employee> sse = ts_intra.tailSet(e1);
        // *mock*
        assertEquals(sse.first().getName(), "P");

        NavigableSet<Employee> ssei = ts_intra.tailSet(e1, true);
        // *mock*
        assertEquals(ssei.first().getName(), "P");
    }
    // total mock calls: 4

    @Test
    public void testSubSet() {
        TreeSet<Employee> ts_intra = new TreeSet<Employee>();

        Employee e0 = new Employee("P_", "", 1);
        Employee e1 = new Employee("Q_", "", 10);

        Employee em = mock(Employee.class);
        // *mock* x3
        when(em.getSalary()).thenReturn(5);
        when(em.getName()).thenReturn("R_");
        ts_intra.add(e1);
        ts_intra.add(em);
        ts_intra.add(e0);

        SortedSet<Employee> sse = ts_intra.subSet(e0, e1);
        // *mock*
        sse.first().getName();

        SortedSet<Employee> sse1 = ts_intra.subSet(e0, false, e1, true);
        // *mock*
        sse1.first().getName();

    }
    // total mock calls: 5
}
