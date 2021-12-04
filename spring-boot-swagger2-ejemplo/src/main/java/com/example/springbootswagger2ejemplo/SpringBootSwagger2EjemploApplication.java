package com.example.springbootswagger2ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "User API",
								version = "1.0", 
								description = "Informacion de User",
								license = @License(name = "ejemplo 1.0", url = "http://test"),
								contact = @Contact(url = "http://ejemplo", name = "test", email = "test@gmaill.com")))

public class SpringBootSwagger2EjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwagger2EjemploApplication.class, args);
	}

}
