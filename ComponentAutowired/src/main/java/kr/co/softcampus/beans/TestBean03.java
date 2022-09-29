package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean03 {
	
	private int data01;
	private String data02;
	private DataBean04 data03;
	private DataBean05 data04;
	
	// 이렇게 생성자를 설정하는 것만으로도 자동 주입이 실행된다. 
	// TestBean02는 Bean으로 등록되어 있고(@Component), DataBean04와 05 또한 Bean 목록에 등록되어 있기 때문이다.
//	public TestBean02(DataBean04 data03, DataBean05 data04) {
//		this.data03 = data03;
//		this.data04 = data04;
//	}
//	
	// 만약, 원시타입도 생성자에서 정의하길 원한다면 미리 명시해두면 된다.
	public TestBean03(@Value("100") int data01, @Value("문자열") String data02, DataBean04 data03, DataBean05 data04) {
		this.data01 = data01;
		this.data02 = data02;
		this.data03 = data03;
		this.data04 = data04;
	}
	
	public int getData01() {
		return data01;
	}
	public String getData02() {
		return data02;
	}
	public DataBean04 getData03() {
		return data03;
	}
	public DataBean05 getData04() {
		return data04;
	}
	
}
