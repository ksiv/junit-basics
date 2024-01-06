import org.junit.jupiter.api.*;

/*
 *  @Nested annotation example
 *
 * */

class NestedTest {
    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll.L1");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach.L1");
    }

    @Test
    void testOne() {
        System.out.println("test one.L1");
    }

    @Test
    void testTwo() {
        System.out.println("test two.L1");
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class nestedTestsL2 {

        @BeforeAll
        void initAll() {
            System.out.println("@BeforeAll.L2");
        }

        @BeforeEach
        void init() {
            System.out.println("@BeforeEach.L2");
        }

        @Test
        void testOne() {
            System.out.println("test one.L2 ");
        }

        @Test
        void testTwo() {
            System.out.println("test two.L2");
        }
    }
}


