package com.rMvcLecturaArchivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
@ComponentScan("MensajeService")
@ComponentScan("com.rMvcLecturaArchivoServiceImpl")
@ComponentScan("Model")
public class SpringMvcConLecturaTxt1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcConLecturaTxt1Application.class, args);
	}

}
