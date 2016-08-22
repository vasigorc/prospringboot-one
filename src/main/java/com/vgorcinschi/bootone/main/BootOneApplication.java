package com.vgorcinschi.bootone.main;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.vgorcinschi.bootone.domain.Journal;
import com.vgorcinschi.bootone.repository.JournalRepository;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.vgorcinschi.bootone.domain")
@ComponentScan("com.vgorcinschi.bootone.web")
@EnableJpaRepositories("com.vgorcinschi.bootone.repository") 
public class BootOneApplication {
    
    @Bean
    InitializingBean saveData(JournalRepository repo) {
        return () -> {
            repo.save(new Journal("Get to know Spring Boot", "Today I will learn Spring Boot", "01/01/2016"));
            repo.save(new Journal("Simple Spring Boot Project", "I will do my first Spring "
                    + "Boot Project", "01/02/2016"));
            repo.save(new Journal("Spring Boot Reading", "Read more about Spring "
                    + "Boot", "02/01/2016"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BootOneApplication.class, args);
    }
}
