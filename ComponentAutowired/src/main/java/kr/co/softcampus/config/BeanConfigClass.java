package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean03;
import kr.co.softcampus.beans.DataBean04;
import kr.co.softcampus.beans.DataBean05;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;

@Configuration
@ComponentScan(basePackages = "kr.co.softcampus.beans")
public class BeanConfigClass {

	@Bean
	public DataBean03 obj04() {
		return new DataBean03();
	}
	
	@Bean
	public DataBean03 obj05() {
		return new DataBean03();
	}
	
	// @Component가 선언된 클래스 파일에서 생성자를 정의하는 방법도 있고
	// 이와 같이, 직접 BeanConfigClass에 @Bean을 정의하면서 생성자를 사용하는 방법도 있다.
	@Bean
	public TestBean03 java02() {
		TestBean03 t02 = new TestBean03(200, "문자열2", new DataBean04(), new DataBean05());
		return t02;
	}
}
