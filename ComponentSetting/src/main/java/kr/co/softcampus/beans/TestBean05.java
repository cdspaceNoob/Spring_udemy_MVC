package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean05 {
	
	public TestBean05() {
		System.out.println("TestBean05의 생성자 실행");
	}

	@PostConstruct
	public void init() {
		System.out.println("TestBean05의 init 메서드 실행");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean05의 destroy 메서드 실행");
	}
	
}
