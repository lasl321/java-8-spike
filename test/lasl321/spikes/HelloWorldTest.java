package lasl321.spikes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHello() throws Exception {
        final HelloWorld helloWorld = new HelloWorld();
        assertEquals(helloWorld.sayHello(), "hello");
    }
}