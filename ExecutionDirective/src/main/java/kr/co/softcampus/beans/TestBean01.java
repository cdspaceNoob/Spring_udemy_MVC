package kr.co.softcampus.beans;

public class TestBean01 {

	public void method01() {
		System.out.println("beans.TestBean01.method01() 실행");
	}
	
//	public void method02() {
//		System.out.println("beans.TestBean02.method02() 실행");
//	}
	
	public void method01(int a01) {
		System.out.println("beans.TestBean01.method01(int) 실행");
	}
	
	public void method01(String a02) {
		System.out.println("beans.TestBean01.method01(java.lang.String) 실행");
	}
	
	public void method01(int a01, int a02) {
		System.out.println("beans.TestBean01.method01(int, int) 실행");
	}
	
	public void method01(int a01, String a02) {
		System.out.println("beans.TestBean01.method01(String, int) 실행");
	}
	
	public void method02() {
		System.out.println("beans.TestBean01.method02() 실행");
	}
	
	public int method03() {
		System.out.println("int beans.TestBean01.method03() 실행");
		return 100;
	}
}