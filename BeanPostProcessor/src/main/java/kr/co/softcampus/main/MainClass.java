package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using ApplicationContext
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 t01 = ctx.getBean("t01", TestBean01.class);
		System.out.printf("t01: %s\n", t01);
		
		System.out.println("---------------------------------------------------------");
		
		TestBean02 t02 = ctx.getBean("t02", TestBean02.class);
		System.out.printf("t02: %s\n", t02);
		
		System.out.println("---------------------------------------------------------");
		
		ctx.close();
	}

}
