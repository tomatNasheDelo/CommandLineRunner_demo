package com.example.conce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConceApplication {

	private static final Logger logger = LoggerFactory.getLogger(ConceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ConceApplication.class, args);

	}

	@Bean
    public CommandLineRunner getRunner() {
        return args -> {
         //   logger.info("Application started with @Bean CommandLineRunner::run(-) ::" + Arrays.toString(args));

		 System.out.println("Hello from main");
        };
    }

	@Bean
    public CommandLineRunner r() {
        return args -> {
         //   logger.info("Application started with @Bean CommandLineRunner::run(-) ::" + Arrays.toString(args));

		 System.out.println("Hello from r main");
        };
    }

	@Bean
    public CommandLineRunner CommandLineRunnerBean() {
        return (args) -> {
            System.out.println("In CommandLineRunnerImpl ");

            for (String arg : args) {
                System.out.println(arg);
            }
        };



}
}
