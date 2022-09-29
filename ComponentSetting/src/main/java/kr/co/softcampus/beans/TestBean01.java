package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

// IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성된다.(ctx를 생성하면서 경로를 읽어올 때 자동으로 객체가 생성된다.)
// Type을 통해 등록된 bean 체를 가져온다.
// 싱글톤이다.
@Component
public class TestBean01 {
	
	public TestBean01() {
		System.out.println("TestBean01의 생성자 실행");
	}
	
}
