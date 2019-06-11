package com.acme.reverse_proxy;

import java.util.HashMap;
import java.util.Map;

public class ReverseProxyMatchingEngine {
    private final Map<String, String> rules;

    public ReverseProxyMatchingEngine() {
        this.rules = new HashMap<String, String>();
        this.rules.put("http://example.com/", "SERVER_A");
        this.rules.put("http://example.com/hello", "SERVER_B");
        this.rules.put("http://example.com/helloworld/", "SERVER_C");
        this.rules.put("http://example.com/goodbye", "SERVER_D");
        this.rules.put("http://company.com/", "SERVER_E");
        this.rules.put("http://company.com/new/", "SERVER_F");
        this.rules.put("http://company.com/news", "SERVER_G");
        this.rules.put("http://company.com/news/", "SERVER_H");
    }

    public ReverseProxyMatchingEngine(Map<String, String> rules) {
        this.rules = rules;
    }

    public String findBackend(String url) {
        return "SERVER_A";
    }
}
