package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean02 {
	
	// Field
	private int data01;
	private String data02;
	private DataBean03 data03;
	private DataBean04 data04;
	
	// Constructor
	public TestBean02(@Value("100") int data01, @Value("문자열") String data02, DataBean03 data03, DataBean04 data04) {
		this.data01 = data01;
		this.data02 = data02;
		this.data03 = data03;
		this.data04 = data04;
	}
	
	public TestBean02() {
		
	}
	
	// GETTERS & SETTERS
	public int getData01() {
		return data01;
	}

	public String getData02() {
		return data02;
	}

	public DataBean03 getData03() {
		return data03;
	}

	public DataBean04 getData04() {
		return data04;
	}
	
	
}
