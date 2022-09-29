package kr.co.softcampus.Beans;

import javax.annotation.Resource;

public class TestBean06 {
	// 변수의 이름과 주입하고자 하는 bean의 이름이 다른 경우?
	// 같은 이름을 가진 bean을 여러 변수에 주입하고 싶을 때는?
	// @Resource의 name 속성을 사용한다.
	
	@Resource(name = "data01")
	private DataBean01 data100;
	
	@Resource(name = "data02")
	private DataBean02 data200;

	public DataBean01 getData100() {
		return data100;
	}

	public void setData100(DataBean01 data100) {
		this.data100 = data100;
	}

	public DataBean02 getData200() {
		return data200;
	}

	public void setData200(DataBean02 data200) {
		this.data200 = data200;
	}
	
}
