package exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    @Test
    public void testServiceWithMultipleReturnValues() {

        Repository repository = mock(Repository.class);

        when(repository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        Service service = new Service(repository);

        String first = service.processData();
        String second = service.processData();

        assertEquals("Processed First Mock Data", first);
        assertEquals("Processed Second Mock Data", second);

    }

}