package com.hgdiv.opendata;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebApplication {

    private static ConfigurableApplicationContext ctx;


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ctx = SpringApplication.run(WebApplication.class, args);
        ctx.registerShutdownHook();
        System.out.println("Deezer-api-client Started!");

    }
}

