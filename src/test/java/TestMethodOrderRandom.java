import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Be careful, these test would run if you comment out @TestMethodOrder
// but this directive determines which ordering method to use.
// So, do not forget it
@TestMethodOrder(MethodOrderer.Random.class)

public class TestMethodOrderRandom {
    @Test
    void testFirst() {
        System.out.println("this is the first test it will be executed the first or the second");
    }

    @Test
    void testSecond() {
        System.out.println("this is the second test it will be executed the first or the second");
    }


}
