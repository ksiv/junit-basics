import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


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
