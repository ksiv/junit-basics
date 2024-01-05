import org.junit.jupiter.api.*;
/*
    The tests are separated into two groups "a" and "b"
    These commands will run only "a", only "b", "a" and "b"
    mvn test -Dgroups="a"
    mvn test -Dgroups="b"
    mvn test -Dgroups="b,a"

 */

public class TagTest {
    @Test
    @Tag("a")
    void onlyA() {
        System.out.println("\"a\" only");
    }

    @Test
    @Tag("b")
    void onlyB() {
        System.out.println("\"b\" only");
    }

    @Test
    @Tags({@Tag("a"), @Tag("b")})
    void aAndB() {
        System.out.println(" \"a\" and \"b\"  by @Tags");
    }

    @Test
    @Tag("a")
    @Tag("b")
    void aAndB2() {
        System.out.println(" \"a\" and \"b\"  by @Tag");
    }

}
