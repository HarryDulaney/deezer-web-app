package com.hgdiv.opendata;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author HGDIV
 */
@SpringBootApplication
public class WebApplication {

    private static ConfigurableApplicationContext ctx;


    public static void main(String[] args) {
        ctx = SpringApplication.run(WebApplication.class, args);
        ctx.registerShutdownHook();
        System.out.println("Deezer-api-client Started!");

    }
}

