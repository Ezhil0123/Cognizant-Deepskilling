package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Exercise7Test {

    @Test
    void testVoidException() {

        ExternalApi api = mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete Failed"))
                .when(api)
                .deleteData();

        MyService service = new MyService(api);

        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            service.delete();
        });

        assertEquals("Delete Failed", ex.getMessage());

        verify(api).deleteData();

    }
}