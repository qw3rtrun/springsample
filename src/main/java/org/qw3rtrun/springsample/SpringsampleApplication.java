package org.qw3rtrun.springsample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringsampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner1() {
        return args -> System.out.print("Hello ");
    }

    @Bean
    public CommandLineRunner runner2() {
        return args -> System.out.println("World");
    }
}
