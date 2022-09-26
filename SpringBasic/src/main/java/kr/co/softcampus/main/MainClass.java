package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// beans.xml 파일 로딩: 아래 코드를 작성하고 실행했을 때, 아무런 오류가 나오지 않는다면 정상적으로 세팅된 것임.
		// 그리고 logoback을 추가하면 로고를 볼 수 있게 된다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// xml에 정의한 bean 객체의 주소 가져오기.
		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		// 위와 동일한 결과를 얻는다. 
		HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
		callMethod(hello2);
		
		ctx.close();
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
	
}
