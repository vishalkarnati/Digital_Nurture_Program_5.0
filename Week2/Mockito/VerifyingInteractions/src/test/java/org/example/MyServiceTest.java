package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // inject mock into service
        MyService service = new MyService(mockApi);

        // call method
        service.fetchData();

        // verify that getData() was called
        verify(mockApi).getData();
    }
}