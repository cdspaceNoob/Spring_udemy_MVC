package prac.spring.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import prac.spring.beans.Greetings;

public class MainClass {

	public static void main(String[] args) {
		
//		greetingKoTest();
		greetingKoScopeTest();
//		greetingKoTestOs();
//		greetingKoTestOsProto();
	}
	
	// Using XmlBeanFactory: inside of package
	public static void greetingKoTest() {
		ClassPathResource cpr = new ClassPathResource("prac/spring/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(cpr);

		Greetings ko1 = factory.getBean("greetingKo", Greetings.class);
		ko1.Greeting();
		System.out.printf("ko1: %s\n", ko1);
		
		Greetings ko2 = factory.getBean("greetingKo", Greetings.class);
		ko2.Greeting();
		System.out.printf("ko2: %s\n", ko2);
		
		Greetings en1 = factory.getBean("greetingEn", Greetings.class);
		en1.Greeting();
		System.out.printf("en1: %s\n", en1);
		
		Greetings en2 = factory.getBean("greetingEn", Greetings.class);
		en2.Greeting();
		System.out.printf("ne2: %s\n", en2);
	}
	
	// Using XmlBeanFactory: inside of package - scope:prototype
	public static void greetingKoScopeTest() {
		ClassPathResource cpr = new ClassPathResource("prac/spring/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(cpr);
		
		Greetings ko1 = factory.getBean("greetingKoProto", Greetings.class);
		ko1.Greeting();
		System.out.printf("ko1: %s\n", ko1);
		
		Greetings ko2 = factory.getBean("greetingKoProto", Greetings.class);
		ko2.Greeting();
		System.out.printf("ko2: %s\n", ko2);
		
		Greetings en1 = factory.getBean("greetingEnProto", Greetings.class);
		en1.Greeting();
		System.out.printf("en1: %s\n", en1);
		
		Greetings en2 = factory.getBean("greetingEnProto", Greetings.class);
		en2.Greeting();
		System.out.printf("en2: %s\n", en2);
	}
	
	// Using XmlBeanFactory: outside 
	public static void greetingKoTestOs() {
		FileSystemResource fsr = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		
		Greetings ko1 = factory.getBean("greetingKo", Greetings.class);
		ko1.Greeting();
		
		Greetings ko2 = factory.getBean("greetingKo", Greetings.class);
		ko2.Greeting();
	}
	
	// Using XmlBeanFactory: outside 
	public static void greetingKoTestOsProto() {
		FileSystemResource fsr = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		
		Greetings ko1 = factory.getBean("greetingKoProto", Greetings.class);
		ko1.Greeting();
		System.out.printf("ko1: %s\n", ko1);
		
		Greetings ko2 = factory.getBean("greetingKoProto", Greetings.class);
		ko2.Greeting();
		System.out.printf("ko2: %s\n", ko2);
	}

}
