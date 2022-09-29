package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans02.TestBean04;

//@Configuration

@ComponentScan(basePackages = "kr.co.softcampus.beans02")
@ComponentScan(basePackages = "kr.co.softcampus.beans03")
public class BeanConfigClass {
	@Bean
	public TestBean01 java01() {
		return new TestBean01();
	}
	
	@Bean
	public TestBean02 java02() {
		return new TestBean02();
	}
	
	@Bean 
	public TestBean02 java03() {
		return new TestBean02();
	}
	
	@Bean
	public TestBean04 java100() {
		return new TestBean04();
	}
	
	@Bean
	public TestBean04 java200() {
		return new TestBean04();
	}
}
