package com.personalprojects.StillConnected;

import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Configuration
public class LoadDataBase {
    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initDataBase(SignUp repository){

        return args -> {
            log.info("Preloading " + repository.save(new Account("gb@yahoo.com","porto")));
        };
    }
}
