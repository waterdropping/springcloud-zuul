package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import example.filter.AuthFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApplicationWithFilter {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplicationWithFilter.class, args);
	}

	@Bean
	public AuthFilter getAuthFilter() {
		return new AuthFilter();
	}
}
