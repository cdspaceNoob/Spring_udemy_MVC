package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.TestBean02;

@Configuration
@ComponentScan(basePackages = "kr.co.softcampus.beans")
public class BeanConfigClass {

	@Bean 
	public TestBean02 t05() {
		return new TestBean02();
	}
	
	@Bean
	public TestBean02 t06() {
		return new TestBean02();
	}
}
