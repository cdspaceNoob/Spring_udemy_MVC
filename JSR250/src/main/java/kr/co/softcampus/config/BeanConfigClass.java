package kr.co.softcampus.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softcampus.Beans.DataBean01;
import kr.co.softcampus.Beans.DataBean02;
import kr.co.softcampus.Beans.TestBean01;
import kr.co.softcampus.Beans.TestBean02;
import kr.co.softcampus.Beans.TestBean03;
import kr.co.softcampus.Beans.TestBean04;
import kr.co.softcampus.Beans.TestBean05;
import kr.co.softcampus.Beans.TestBean06;

@Configuration
public class BeanConfigClass {

	@Bean(initMethod="init01", destroyMethod="destroy01")	// 해당 클래스 파일에 직접 명시할 수도 있다 
	@Lazy
	public TestBean01 obj01() {
		return new TestBean01();
	}
	
	@Bean
	@Lazy
	public TestBean02 obj02() {
		return new TestBean02();
	}
	
	@Bean
	public DataBean01 data01() {
		return new DataBean01();
	}
	
	@Bean
	public DataBean02 data02() {
		return new DataBean02();
	}
	
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean03 obj03() {
		return new TestBean03();
	}
	
	@Bean
	public TestBean04 obj04() {
		return new TestBean04();
	}
	
	@Bean
	public TestBean05 obj05() {
		return new TestBean05();
	}
	
	@Bean
	public TestBean06 obj06() {
		return new TestBean06();
	}
	
}
