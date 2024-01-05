import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;



class Parameterized {

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 5, 8, 9})
        // test will be executed for each input parameter
    void testPringNumbers(int number) {
        System.out.println("number is: " + number);
    }
}
