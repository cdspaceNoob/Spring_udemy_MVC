package kr.co.softcampus.Beans;

public class TestBean01 {

	public TestBean01() {
		System.out.println("TestBean01의 생성자 실행");
	}
	
	public void init01() {
		System.out.println("TestBean01의 init 메서드 실행");
	}
	
	public void destroy01() {
		System.out.println("TestBean01의 destroy 메서드 실행");
	}
}
