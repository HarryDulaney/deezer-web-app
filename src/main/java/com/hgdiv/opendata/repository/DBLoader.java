package com.hgdiv.opendata.repository;

import com.hgdiv.opendata.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DBLoader {
    Logger log = LoggerFactory.getLogger(DBLoader.class);

    private HomeRepository homeRepository;

    @Bean
    CommandLineRunner initDatabase(HomeRepository homeRepository) {
        return args -> {
            log.info("Preloading " + homeRepository.save(new Person("Bilbo", "Baggins", "burglar")));
            log.info("Preloading " + homeRepository.save(new Person("Frodo", "Baggins", "thief")));
        };
    }


}
