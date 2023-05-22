package mao.linatrix.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @Test
//    @DisplayName("Equals And Not Equals")
    void test_Equals_And_Not_Equals() {

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
//    @DisplayName("Null And Not Null")
    void test_Null_And_Not_Null() {
        System.out.println("Running test: testNullAndNotNull");

        // set up
        String str1 = null;
        String str2 = "luv2code";

        // execute

        // assert
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

//    @AfterEach
//    void tearDownAfterEach() {
//        System.out.println("Running @AfterEach");
//    }
//
//    @BeforeAll
//    static void setupBeforeEachClass() {
//        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll()
//    {
//        System.out.println("@AfterAll executes only once after all methods execution in the class");
//    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");
    }

    @Test
    @DisplayName("True and False")
    void testTrueAndFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

}
