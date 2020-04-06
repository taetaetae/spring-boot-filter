package com.taetaetae.springbootfilter.method2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Method2Application {

	public static void main(String[] args) {
		SpringApplication.run(Method2Application.class, args);
	}

}
