package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean01;
import kr.co.softcampus.beans.TestBean01;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean01 java01() {
		return new TestBean01(200, "문자열2", new DataBean01());
	}
	
}
