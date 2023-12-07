package com.uyong.example.web;

import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.server.WebServerException;

public class MyWebServer implements WebServer {
    @Override
    public void start() throws WebServerException {
        System.out.println("start web server");
    }

    @Override
    public void stop() throws WebServerException {
        System.out.println("stop web server");
    }

    @Override
    public int getPort() {
        return 19999;
    }
}
