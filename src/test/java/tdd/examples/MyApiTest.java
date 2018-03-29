package tdd.examples;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MyApiTest {
    
    private MyApi myApi;
    
    @Test
    public void testMyApi() {
        this.myApi = new MyApiImpl();
    
        assertNotNull(myApi.get());
    }
    
}
