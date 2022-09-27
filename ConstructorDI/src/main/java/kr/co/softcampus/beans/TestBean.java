package kr.co.softcampus.beans;

public class TestBean {
	private int 	data01;
	private double  data02;
	private String  data03; 
	
	public TestBean() {
		System.out.println("TestBean의 기본 생성자 실행");
		this.data01 = 0;
		this.data02 = 0.0;
		this.data03 = null;
	}
	
	public TestBean(int data01) {
		System.out.println("TestBean의 생성자 오버로딩: int 값 1개");
		this.data01 = data01;
		this.data02 = 0.0;
		this.data03 = null;
	}
	
	public TestBean(double data02) {
		System.out.println("TestBean의 생성자 오버로딩: double 값 1개");
		this.data01 = 0;
		this.data02 = data02;
		this.data03 = null;
	}
	
	public TestBean(String data03) {
		System.out.println("TestBean의 생성자 오버로딩: String 값 1개");
		this.data01 = 0;
		this.data02 = 0.0;
		this.data03 = data03;
	}
	
	public TestBean(int data01, double data02, String data03) {
		System.out.println("TestBean의 생성자 오버로딩: 모든 파라미터 입력");
		this.data01 = data01;
		this.data02 = data02;
		this.data03 = data03;
	}
	
	public void printData() {
		System.out.printf("data01: %d\n", data01);
		System.out.printf("data02: %f\n", data02);
		System.out.printf("data03: %s\n", data03);
	}
	
}
