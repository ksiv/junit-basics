import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

/*
        The major group of Junit assertions performs all kind equality checks,
   such as: if true,if arrays are equal, if object is null.
   there are also exception type assertions which are still can be put into same group as
   they check if an exception type is the one you want.
       Apart of it we can fail a test deliberately using fail() assertions if some logic
   requires more than one check.
       There is also an execution timeout check.

 */

public class Assetions {
    @Test
    @DisplayName("testAssertTrue()")
    void testAssertTrue() {
        Boolean bTest = true;
        assertTrue(bTest);
    }
    @Test
    @DisplayName("assertArrayEquals()")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
    @Test
    @DisplayName("assertThrows()")
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        });
    }
    @Test
    @DisplayName("assertTimeout()")
    void testAssertTimeoutPass() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(500);
        });
    }

    // this example is still can be written using an assert
    // but sometime if the logic is complicated and you can not split your test into several
    // this is a way to fail a test on such conditions
    // 
    @Test
    @DisplayName("testFail()")
    void testFail() {
        int age = 3;
        boolean isAnAdult = true;
        if (age<18 && isAnAdult){
            fail("in this example country adult age starts from 18");
        }
    }
}
