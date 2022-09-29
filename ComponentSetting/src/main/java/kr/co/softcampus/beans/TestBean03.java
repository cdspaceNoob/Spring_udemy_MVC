package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean03 {
	
	public TestBean03() {
		System.out.println("TestBean03의 생성자 실행");
	}
	
}
