package ca.java.arco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ArcoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArcoConfigServerApplication.class, args);
	}

}
