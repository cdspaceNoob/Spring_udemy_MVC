package kr.co.softcampus.beans;

public class TestBean01 {
	
		private int data01;
		private String data02;
		private DataBean01 data03;
		
		public TestBean01(int data01, String data02, DataBean01 data03) {
			this.data01 = data01;
			this.data02 = data02;
			this.data03 = data03;
		}
		
		public TestBean01() {
			
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
		public DataBean01 getData03() {
			return data03;
		}
		public void setData03(DataBean01 data03) {
			this.data03 = data03;
		}
	
}
