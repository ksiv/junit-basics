import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// When you want to exclude a test from execution

@Disabled

public class DisabledTest {


    @Test
    void disabledTest() {
        System.out.println("should not be executed because @Disabled");
    }


}
