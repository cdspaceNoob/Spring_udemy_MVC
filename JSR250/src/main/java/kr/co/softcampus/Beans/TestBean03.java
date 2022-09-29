package kr.co.softcampus.Beans;

// 이 클래스에 DataBean들을 자동으로 주입 받기
public class TestBean03 {
	
	private DataBean01 data01;
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
