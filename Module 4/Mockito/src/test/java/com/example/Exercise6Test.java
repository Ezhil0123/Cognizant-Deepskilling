package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class Exercise6Test {

    @Test
    void testOrderVerification() {

        Logger logger = mock(Logger.class);

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.process(logger);

        InOrder order = inOrder(logger);

        order.verify(logger).start();
        order.verify(logger).log("Processing...");
        order.verify(logger).end();

    }
}