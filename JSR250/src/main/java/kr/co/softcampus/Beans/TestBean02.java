package kr.co.softcampus.Beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean02 {
	
	public TestBean02() {
		System.out.println("TestBean02의 생성자 실행");
	}
	
	
	@PostConstruct		// 생성자 호출 이후 자동으로 호출
	public void init02() {
		System.out.println("TestBean02의 init 메서드 실행");
	}
	
	@PreDestroy			// 객체 소멸 전 자동으로 호출
	public void destroy02() {
		System.out.println("TestBean02의 destroy 메서드 실행");
	}
}
