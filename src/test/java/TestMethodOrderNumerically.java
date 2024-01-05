import org.junit.jupiter.api.*;

// Be careful, these test would run if you comment out @TestMethodOrder
// but this directive determines which ordering method to use.
// So, do not forget it
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMethodOrderNumerically {


    @Test
    @Order(2)
    void testSecond() {
        System.out.println("this test is executed later in spite occurring earlier in the code...");
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("this test is executed earlier in spite occurring later in the code...");
    }


}
