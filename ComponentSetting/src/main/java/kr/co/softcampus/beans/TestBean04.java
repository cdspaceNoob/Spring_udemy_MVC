package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // getBean()을 호출할 때마다 새로운 객체를 생성하여 반환.
public class TestBean04 {

		public TestBean04() {
			System.out.println("TestBean04의 생성자 실행");
		}
}
