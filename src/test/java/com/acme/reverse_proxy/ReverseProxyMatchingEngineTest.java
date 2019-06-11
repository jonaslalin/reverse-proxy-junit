package com.acme.reverse_proxy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseProxyMatchingEngineTest {
    private final ReverseProxyMatchingEngine engine = new ReverseProxyMatchingEngine();

    @Test
    public void testFindBackend() {
        assertEquals("http://example.com/ failed", "SERVER_A", engine.findBackend("http://example.com/"));
        assertEquals("http://example.com/helloo failed", "SERVER_A", engine.findBackend("http://example.com/helloo"));
        assertEquals("http://example.com/hello failed", "SERVER_B", engine.findBackend("http://example.com/hello"));
        assertEquals("http://example.com/hello/ failed", "SERVER_B", engine.findBackend("http://example.com/hello/"));
        assertEquals("http://company.com/news failed", "SERVER_G", engine.findBackend("http://company.com/news"));
        assertEquals("http://company.com/news/it failed", "SERVER_H", engine.findBackend("http://company.com/news/it"));
        assertEquals("http://google.com/ failed", null, engine.findBackend("http://google.com/"));
    }
}
