package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBean obj01 = new TestBean();
		obj01.setData01(100);
		System.out.printf("obj01.data01: %d\n", obj01.getData01());
		
		System.out.println("------------------------------------");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		TestBean t01 = ctx.getBean("t01", TestBean.class);
		System.out.printf("t01.data01: %d\n", t01.getData01());
		System.out.printf("t01.data02: %f\n", t01.getData02());
		System.out.printf("t01.data03: %s\n", t01.isData03());
		System.out.printf("t01.data04: %s\n", t01.getData04());
		System.out.printf("t01.data05: %s\n", t01.getData05());
		System.out.printf("t01.data06: %s\n", t01.getData06());
		ctx.close();
	}

}
