package com.hgdiv.opendata;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;

@Component
public class Launcher {

    @EventListener(ApplicationReadyEvent.class)

    public void launch() {
        System.setProperty("java.awt.headless", "false");
        Desktop desktop = Desktop.getDesktop();

        try{
            desktop.browse(new URI("http://localhost:5000"));
        }catch (Exception ex){
            ex.printStackTrace();
            ex.getCause();
            ex.getMessage();
        }
    }


}
