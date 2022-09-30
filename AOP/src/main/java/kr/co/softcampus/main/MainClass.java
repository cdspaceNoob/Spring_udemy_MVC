package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;

public class MainClass {

		public static void main(String[] args) {
			
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
			
			TestBean01 bean01 = ctx.getBean("xml01", TestBean01.class);
			int a01 = bean01.method01();
			System.out.printf("a01: %d\n", a01);
			
			ctx.close();
		}
}
