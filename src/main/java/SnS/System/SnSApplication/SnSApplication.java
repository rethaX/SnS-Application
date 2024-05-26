package SnS.System.SnSApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnSApplication {
	private static final Logger log = LoggerFactory.getLogger(SnSApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SnSApplication.class, args);

		log.info("Application Started Successfully");
	}

}
