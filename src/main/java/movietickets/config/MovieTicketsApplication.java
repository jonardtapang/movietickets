package movietickets.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "movietickets")
@EnableJpaRepositories(basePackages = "movietickets.repository")
@EntityScan(basePackages = "movietickets.domain.model")
public class MovieTicketsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketsApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MovieTicketsApplication.class);
	}
}
