package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean01 {

	public void method01() throws Exception{
		System.out.println("TestBean01의 method01 호출");
//		int a = 100/0;
	}
	
}
