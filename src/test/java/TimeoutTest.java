import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;



public class TimeoutTest {
    @Test
    @Timeout(1)  // seconds
    @DisplayName("annotationTimeout()")
    void testTimeoutCheckViaAnnotation(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            return;
        }

    }
}


