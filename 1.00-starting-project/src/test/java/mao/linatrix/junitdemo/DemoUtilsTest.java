package mao.linatrix.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {

        // set up
        DemoUtils demoUtils = new DemoUtils();
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

        // set up
        DemoUtils demoUtils = new DemoUtils();
        String str1 = null;
        String str2 = "luv2code";

        // execute

        // assert
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

}
