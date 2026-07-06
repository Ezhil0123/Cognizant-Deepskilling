package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise4Test {

    @Test
    void testVoidMethod() {

        ExternalApi api = mock(ExternalApi.class);

        doNothing().when(api).saveData(anyString());

        MyService service = new MyService(api);

        service.save("Mockito");

        verify(api).saveData("Mockito");

    }
}