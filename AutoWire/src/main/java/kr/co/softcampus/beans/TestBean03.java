package kr.co.softcampus.beans;

public class TestBean03 {
	
	private int data01;
	private String data02;
	private DataBean02 data03;
	private DataBean02 data04;
	
	public TestBean03(DataBean02 data03, DataBean02 data04){
		this.data03 = data03;
		this.data04 = data04;
	}
	
	public TestBean03(int data01, String data02, DataBean02 data03, DataBean02 data04) {
		this.data01 = data01;
		this.data02 = data02;
		this.data03 = data03;
		this.data04 = data04;
	}
	
	public int getData01() {
		return data01;
	}
	public void setData01(int data01) {
		this.data01 = data01;
	}
	public String getData02() {
		return data02;
	}
	public void setData02(String data02) {
		this.data02 = data02;
	}
	public DataBean02 getData03() {
		return data03;
	}
	public void setData03(DataBean02 data03) {
		this.data03 = data03;
	}
	public DataBean02 getData04() {
		return data04;
	}
	public void setData04(DataBean02 data04) {
		this.data04 = data04;
	}
	
	
}
