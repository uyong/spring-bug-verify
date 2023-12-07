package com.uyong.example.web;

import java.io.File;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.AbstractServletWebServerFactory;

public class MyWebServletWebServerFactory extends AbstractServletWebServerFactory {

    @Override
    public WebServer getWebServer(ServletContextInitializer... initializers) {
        // create my self web server
        System.out.println("create web server");

        // check license
        checkLicense();

        // if license no problem
        return new MyWebServer();
    }

    private void checkLicense() {
        File file = new File("licenses.txt");
        if (!file.exists()) {
            System.out.println("license file not found! i want exit vm");
            System.exit(1);
        }
    }
}
