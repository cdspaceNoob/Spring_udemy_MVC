package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

// 이름을 부여해도 Context를 읽어올 때 자동으로 생성된다. 
@Component("t03")
public class TestBean02 {
	
	public TestBean02() {
		System.out.println("TestBean02의 생성자 실행");
	}
}
