package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise3Test {

    @Test
    void testArgumentMatching() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.fetchById(100);

        verify(api).getDataById(anyInt());

    }
}