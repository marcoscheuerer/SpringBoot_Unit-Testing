package mao.linatrix.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll()
    {
        System.out.println("@AfterAll executes only once after all methods execution in the class");
    }

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach");
    }

    @Test
    void testEqualsAndNotEquals() {

        System.out.println("Running test: testEqualsAndNotEquals");

        // set up
        int expected = 6;
        int unexpected = 10;

        // execute
        int actual = demoUtils.add(2, 4);

        // assert
        assertEquals(expected, actual, "2 + 4 must be 6");
        assertNotEquals(unexpected, actual, "2 + 4 must not be 10");
    }

    @Test
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");

        // set up
        String str1 = null;
        String str2 = "luv2code";

        // execute

        // assert
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

}
