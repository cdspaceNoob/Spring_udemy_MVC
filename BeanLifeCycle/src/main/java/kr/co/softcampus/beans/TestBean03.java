package kr.co.softcampus.beans;

public class TestBean03 {
	
	public TestBean03() {
		System.out.println("TestBean03의 생성자 실행");
	}
	
	public void default_init() {
		System.out.println("TestBean03의 default_init 실행");
	}
	
	public void default_destroy() {
		System.out.println("TestBean03의 default_destory 실행");
	}
	
	public void bean03_init() {
		System.out.println("TestBean03의 init 메서드 실행");
	}
	
	public void bean03_destroy() {
		System.out.println("TestBean03의 destory 메서드 실행");
	}
}
