package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.beans.TestBean04;

// @Configuration을 선언해주면, 해당 클래스가(Java Class File) config 패키지의 beans.xml의 역할을 대신하게 된다 
@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean01 java01() {			// class타입, 메서드의 이름이 bean의 이름.
		TestBean01 t01 = new TestBean01();	// 객체 생성.
		return t01;							// 반환.(아무 설정도 하지 않았을 때는 싱글톤이므로 이미 생성된 객체의 주소를 사용)
	}
	
	@Bean(name="java600")					// name 속성을 추가하여, 기존에 bean의 이름이 메서드 이름이었던 것을 바꿔줄 수 있다.
	public TestBean01 java500() {
		TestBean01 t01 = new TestBean01();
		return t01;
	}
	
	@Bean
	@Lazy	// lazy-init에 true을 준 것과 동일한 효과를 낸다.
	public TestBean02 java02() {
		TestBean02 t02 = new TestBean02();
		return t02;
	}
	
	@Bean
	@Scope("prototype")
	public TestBean03 java03() {
		TestBean03 t03 = new TestBean03();
		return t03;
	}
	
	@Bean
	public TestBean04 java04() {
		TestBean04 t04 = new TestBean04();
		return t04;
	}
	
	@Bean
	@Primary
	public TestBean04 java05() {
		TestBean04 t05 = new TestBean04();
		return t05;
	}
	
}
