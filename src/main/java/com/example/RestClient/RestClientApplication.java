package com.example.RestClient;

import com.example.RestClient.client.Quote;
import javafx.application.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}


    @Override
    public void run(String... strings) throws Exception {

            RestTemplate restTemplate = new RestTemplate();
            String quote = restTemplate.getForObject(
                    "http://192.168.43.131:8090/artur", String.class);
            log.info(quote.toString());

    }
}
