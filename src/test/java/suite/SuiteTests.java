package suite;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


@Tag("allSuite")
public class SuiteTests {

    @Test
    @Tag("a")
    public void testCaseA(TestInfo testInfo) {
        System.out.println("tagged \"a\" inside a suite" );
    }

    @Test
    @Tag("b")
    public void testCaseB(TestInfo testInfo) {
        System.out.println("tagged \"b\" inside a suite" );
    }

    @Test
    @Tag("a")
    @Tag("b")
    public void testCaseC(TestInfo testInfo) {
        System.out.println("tagged \"a\" and \"b\" inside a suite" );
    }
}



