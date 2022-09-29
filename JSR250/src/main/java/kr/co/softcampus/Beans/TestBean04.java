package kr.co.softcampus.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean04 {
	
	// @Qualifier에 명시한 문자열과 동일한 이름(메서드 이름)을 가진 
	// BeanConfigClass의 Bean을 가져와서 자동 주입.
	@Autowired
	@Qualifier("data01")	
	private DataBean01 data01;
	
	@Autowired
	@Qualifier("data02")
	private DataBean02 data02;
	
	// GETTERS & SETTERS
	public DataBean01 getData01() {
		return data01;
	}
	public void setData01(DataBean01 data01) {
		this.data01 = data01;
	}
	public DataBean02 getData02() {
		return data02;
	}
	public void setData02(DataBean02 data02) {
		this.data02 = data02;
	}
	
	
}
