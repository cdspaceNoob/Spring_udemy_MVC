package kr.co.softcampus.config;

import org.springframework.context.annotation.Configuration;

// 프로젝트 작업 시 사용할 Bean을 정의하는 클래스. 
// 용도에 맞게 여러 클래스를 생성하고 @Configuration을 선언하여 자기 책임성을 가질 수 있게 한다.
@Configuration	// Bean을 관리하는 Beans.xml과 동일한 역할을 한다. 이 어노테이션이 있는 클래스 내부에 @Bean을 설정한다.
public class RootAppContext {

}
