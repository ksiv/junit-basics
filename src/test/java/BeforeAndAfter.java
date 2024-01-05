import org.junit.jupiter.api.*;
/*
 *  @BeforeAll, @BeforeEach, @AfterAll, @AfterEach  annotations examples
 *
 * */

class BeforeAndAfter {

    @BeforeAll
    static void initAll() {
        System.out.println("this step is executed before all tests...");
    }

    @BeforeEach
    void init() {
        System.out.println("this step is executed before each test...");
    }

    @Test
    @DisplayName("Test 1 canonical name")
    void test1() {
        System.out.println("test 1");
    }

    @Test
    @DisplayName("Test 2 canonical name")
    void test2() {
        System.out.println("test 2");
    }





    @AfterEach
    void tearDown() {
        System.out.println("this step is executed after each test...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("this step is executed after all tests...");
    }
}