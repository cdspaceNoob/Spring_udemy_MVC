package kr.co.softcampus.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean01 {
	
	@Autowired // 필드에 붙이면 컴파일 시 Setter가 자동으로 만들어진다. DataBean01 타입으로 등록되어 있는 bean을 data01에 자동 주입하겠다.
	private DataBean01 data01;
	
	@Autowired
	@Qualifier("obj02") // obj02라는 이름(id)로 등록된 bean을 data02에 자동 주입하겠다.
	private DataBean02 data02;
	
	@Resource(name = "obj03") // obj03이라는 이름(id)로 등록된 bean을 data03에 자동 주입하겠다.
	private DataBean03 data03;
	
	@Resource(name = "obj04")
	private DataBean03 data04;
	
	@Resource(name = "obj05")
	private DataBean03 data05;
	
	// GETTER & SETTER
	public DataBean01 getData01() {
		return data01;
	}

	public DataBean02 getData02() {
		return data02;
	}

	public DataBean03 getData03() {
		return data03;
	}

	public DataBean03 getData04() {
		return data04;
	}

	public DataBean03 getData05() {
		return data05;
	}
	
}
