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
        System.out.println("test one");
    }

    @Test
    void testTwo() {
        System.out.println("test two");
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
            System.out.println("nested test one ");
        }

        @Test
        void testTwo() {
            System.out.println("nested test two");
        }
    }
}


