package com.meet.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude={HibernateJpaAutoConfiguration.class})
public class SpringbootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJspApplication.class, args);
	}

}
