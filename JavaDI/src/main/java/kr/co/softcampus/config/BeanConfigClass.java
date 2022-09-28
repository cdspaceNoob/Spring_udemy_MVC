package kr.co.softcampus.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.DataBean01;
import kr.co.softcampus.beans.DataBean02;
import kr.co.softcampus.beans.DataBean03;
import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean01 java01() {
		return new TestBean01(200, "문자열2", new DataBean01());
	}
	
	@Bean
	public TestBean01 java02() {
		TestBean01 t01 = new TestBean01();
		t01.setData01(400);
		t01.setData02("문자열");
		t01.setData03(new DataBean01());
		
		return t01;
	}
	
	// field(property) 또한 bean으로 정할 수 있다. xml과 마찬가진데 약간 어색;
	@Bean
	public DataBean02 data01() {
		return new DataBean02();
	}
	
	@Bean
	public DataBean02 data02() {
		return new DataBean02();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean02 java03() {
		return new TestBean02();
	}
	
	@Bean
	public DataBean03 data100() {
		return new DataBean03();
	}
	
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean03 java04() {
		return new TestBean03();
	}
	
}
