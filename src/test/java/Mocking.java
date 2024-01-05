
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class MockingFrameworkExample {

    @Test
        // Test 1: Test that checks if a method that depends on an external service behaves correctly
    void testExternalService() {
        // Create a mock object for the external service
        ExternalService externalService = mock(ExternalService.class);

        // Set up the mock object to return a specific value
        when(externalService.getData()).thenReturn("Hello, world!");

        // Create an instance of the class that depends on the external service
        MyClass myClass = new MyClass(externalService);

        // Call the method that depends on the external service
        String result = myClass.getDataFromExternalService();

        // Check that the method returned the expected value
        assertEquals("Hello, world!", result);
    }
}

// A simple class that depends on an external service
class MyClass {
    private ExternalService externalService;

    public MyClass(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String getDataFromExternalService() {
        return externalService.getData();
    }
}

// An interface that represents an external service
interface ExternalService {
    String getData();
}