package com.example.cqrssample;

import com.example.cqrssample.cqs.Bus;
import com.example.cqrssample.cqs.Registry;
import com.example.cqrssample.cqs.SpringBus;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CqrsSampleApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CqrsSampleApplication.class, args);
    }

    @Bean
    public Registry registry(ApplicationContext applicationContext){
        return new Registry(applicationContext);
    }

    @Bean
    public Bus commandBus(Registry registry) {
        return new SpringBus(registry);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Init");
    }
}
