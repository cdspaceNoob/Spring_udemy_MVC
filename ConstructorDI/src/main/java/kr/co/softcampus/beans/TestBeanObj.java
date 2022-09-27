package kr.co.softcampus.beans;

public class TestBeanObj {

		private DataBean data01;
		private DataBean data02;
		
		public TestBeanObj(DataBean data01, DataBean data02) {
			this.data01 = data01;
			this.data02 = data02;
		}
		
		public void printData() {
			System.out.printf("data01: %s\n", data01);
			System.out.printf("data02: %s\n", data02);
		}
}
