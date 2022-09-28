package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 obj01 = ctx.getBean("obj01", TestBean01.class);
		System.out.printf("ojb01: %s\n", obj01);
		System.out.printf("obj01.data01: %s\n", obj01.getData01());
		System.out.printf("obj01.data02: %s\n", obj01.getData02());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean01 obj02 = ctx.getBean("obj02", TestBean01.class);
		System.out.printf("obj02.data01: %s\n", obj02.getData01());
		System.out.printf("obj02.data02: %s\n", obj02.getData02());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean02 obj03 = ctx.getBean("obj03", TestBean02.class);
		System.out.printf("odj03.data01: %s\n", obj03.getData01());
		System.out.printf("odj03.data02: %s\n", obj03.getData02());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean03 obj04 = ctx.getBean("obj04", TestBean03.class);
		System.out.printf("odj04.data01: %d\n", obj04.getData01());
		System.out.printf("odj04.data02: %s\n", obj04.getData02());
		System.out.printf("odj04.data03: %s\n", obj04.getData03());
		System.out.printf("odj04.data04: %s\n", obj04.getData04());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean03 obj05 = ctx.getBean("obj05", TestBean03.class);
		System.out.printf("odj05.data01: %d\n", obj05.getData01());
		System.out.printf("odj05.data02: %s\n", obj05.getData02());
		System.out.printf("odj05.data03: %s\n", obj05.getData03());
		System.out.printf("odj05.data04: %s\n", obj05.getData04());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean03 obj06 = ctx.getBean("obj06", TestBean03.class);
		System.out.printf("odj06.data01: %d\n", obj06.getData01());
		System.out.printf("odj06.data02: %s\n", obj06.getData02());
		System.out.printf("odj06.data03: %s\n", obj06.getData03());
		System.out.printf("odj06.data04: %s\n", obj06.getData04());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean03 obj07 = ctx.getBean("obj07", TestBean03.class);
		System.out.printf("odj07.data01: %d\n", obj07.getData01());
		System.out.printf("odj07.data02: %s\n", obj07.getData02());
		System.out.printf("odj07.data03: %s\n", obj07.getData03());
		System.out.printf("odj07.data04: %s\n", obj07.getData04());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean01 obj08 = ctx.getBean("obj08", TestBean01.class);
		System.out.printf("odj08.data01: %s\n", obj08.getData01());
		System.out.printf("odj08.data02: %s\n", obj08.getData02());
		
		System.out.println("-------------------------------------------------------");
		
		TestBean01 obj09 = ctx.getBean("obj09", TestBean01.class);
		System.out.printf("odj08.data01: %s\n", obj09.getData01());
		System.out.printf("odj08.data02: %s\n", obj09.getData02());
		
		ctx.close();
	}
}
