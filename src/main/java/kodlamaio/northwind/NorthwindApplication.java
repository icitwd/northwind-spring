package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

}
