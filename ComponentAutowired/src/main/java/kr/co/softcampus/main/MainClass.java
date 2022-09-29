package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 t01 = ctx.getBean(TestBean01.class);
		
		System.out.printf("t01.data01: %s\n", t01.getData01());
		System.out.printf("t01.data02: %s\n", t01.getData02());
		System.out.printf("t01.data03: %s\n", t01.getData03());
		System.out.printf("t01.data04: %s\n", t01.getData04());
		System.out.printf("t01.data05: %s\n", t01.getData05());

		System.out.println("=================================================");
		
		TestBean02 t02 = ctx.getBean(TestBean02.class);
		System.out.printf("t02.data01: %s\n", t02.getData01());
		System.out.printf("t02.data02: %s\n", t02.getData02());
		System.out.printf("t02.data03: %s\n", t02.getData03());
		System.out.printf("t02.data04: %s\n", t02.getData04());
		
		System.out.println("=================================================");
		
		// TestBean03 타입은 @Component 어노테이션으로 이미 등록되어 있으므로, 
		// BeanConfigClass에서 생성자를 통해 새로운 bean을 만들 때는 반드시 이름을 적어준다.
		TestBean03 java02 = ctx.getBean("java02", TestBean03.class);
		System.out.printf("java02.data01: %s\n", java02.getData01());
		System.out.printf("java02.data02: %s\n", java02.getData02());
		System.out.printf("java02.data03: %s\n", java02.getData03());
		System.out.printf("java02.data04: %s\n", java02.getData04());
		
		ctx.close();
		
	}
}
