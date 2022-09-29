package kr.co.softcampus.Beans;

import javax.annotation.Resource;

public class TestBean05 {

	// 변수의 이름 즉, data01 또는 data02와 동일한 이름의 bean이 자동 주입.
	@Resource
	private DataBean01 data01;
	
	@Resource
	private DataBean02 data02;

	
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
