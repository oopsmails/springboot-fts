package com.oopsmails.lucenesearch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@Slf4j
public class SpringBootLuceneSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLuceneSearchApplication.class, args);
    }

}
