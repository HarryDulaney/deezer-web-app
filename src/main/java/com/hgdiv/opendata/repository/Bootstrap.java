package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.controller.HomeController;
import com.hgdiv.opendata.model.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Bootstrap {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Bean
    CommandLineRunner initDatabase(ArtistRepository artistRepository) {
        return args -> {
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket1","The first test packet")));
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket2","The second test packet")));
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket3","The third test packet")));
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket4","The fourth test packet")));
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket5","The fifth test packet")));
            log.info("Preloading " + artistRepository.save(new Artist("TestPacket6","The sixth test packet")));
        };
    }

}
