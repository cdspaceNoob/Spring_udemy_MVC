package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.beans.TestBean04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using ApplicationContext
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 t01 = ctx.getBean("t01", TestBean01.class);
		System.out.printf("t01: %s\n", t01);
		
		System.out.println("-------------------------------------------------");
		
		TestBean02 t02 = ctx.getBean("t02", TestBean02.class);
		System.out.printf("t02: %s\n", t02);
		
		System.out.println("-------------------------------------------------");
		
		TestBean03 t03 = ctx.getBean("t03", TestBean03.class);
		System.out.printf("t03: %s\n", t03);
		
		System.out.println("-------------------------------------------------");
		
		TestBean04 t04 = ctx.getBean("t04", TestBean04.class);
		System.out.printf("t04: %s\n", t04);
		
		// IoC 컨테이너 닫기
		ctx.close();
	}

}
