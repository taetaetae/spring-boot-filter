package com.taetaetae.springbootfilter.method1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Method1Application {

	public static void main(String[] args) {
		SpringApplication.run(Method1Application.class, args);
	}

	@Bean
	public FilterRegistrationBean setFilterRegistration() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
		// filterRegistrationBean.setUrlPatterns(Collections.singletonList("/filtered/*")); // list 를 받는 메소드
		filterRegistrationBean.addUrlPatterns("/filtered/*"); // string 여러개를 가변인자로 받는 메소드
		return filterRegistrationBean;
	}
}
