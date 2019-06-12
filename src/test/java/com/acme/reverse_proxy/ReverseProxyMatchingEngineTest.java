package com.acme.reverse_proxy;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseProxyMatchingEngineTest {
    private final ReverseProxyMatchingEngine engine = new ReverseProxyMatchingEngine();

    @Test
    public void testFindBackend() {
        assertEquals(
                "http://example.com/ failed",
                "SERVER_A",
                engine.findBackend("http://example.com/"));
    }
}
