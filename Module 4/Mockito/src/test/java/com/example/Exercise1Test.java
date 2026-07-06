package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Exercise1Test {

    @Test
    void testMockingAndStubbing() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        MyService service = new MyService(api);

        assertEquals("Mock Data", service.fetchData());

    }
}