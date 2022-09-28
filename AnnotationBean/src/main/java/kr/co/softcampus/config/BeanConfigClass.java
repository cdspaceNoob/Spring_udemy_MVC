package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean01;
import kr.co.softcampus.beans.DataBean02;
import kr.co.softcampus.beans.TestBean01;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean01 java01() {
		return new TestBean01();
	}
	
	@Bean
	public DataBean01 data_bean01() {
		return new DataBean01();
	}
	
	@Bean
	public DataBean02 obj04() {
		return new DataBean02();
	}
	
	@Bean
	public DataBean02 obj05() {
		return new DataBean02();
	}
}
