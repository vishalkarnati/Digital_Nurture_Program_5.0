package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Step 1: create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: inject mock into service
        MyService service = new MyService(mockApi);

        // Step 4: call service method
        String result = service.fetchData();

        // Step 5: verify result
        assertEquals("Mock Data", result);
    }
}