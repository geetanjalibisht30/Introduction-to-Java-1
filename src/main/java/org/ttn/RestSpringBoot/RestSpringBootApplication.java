package org.ttn.RestSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import java.util.Locale;

@SpringBootApplication
public class RestSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestSpringBootApplication.class, args);
	}


}
