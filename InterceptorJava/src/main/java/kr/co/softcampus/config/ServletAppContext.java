package kr.co.softcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softcampus.interceptor.TestInterceptor1;
import kr.co.softcampus.interceptor.TestInterceptor2;
import kr.co.softcampus.interceptor.TestInterceptor3;
import kr.co.softcampus.interceptor.TestInterceptor4;
import kr.co.softcampus.interceptor.TestInterceptor5;
import kr.co.softcampus.interceptor.TestInterceptorAll;
import kr.co.softcampus.interceptor.TestInterceptorEvery;

// 얘는 Spring MVC 프로젝트에 관련된 설정을 담고 있는 클래스다.
@Configuration	// Bean을 관리하는 Beans.xml과 동일한 역할을 한다. 이 어노테이션이 있는 클래스 내부에 @Bean을 설정한다.
@EnableWebMvc	
@ComponentScan("kr.co.softcampus.controller")	// 스캔할 패키지를 지정한다.(스캔하여 가져온 후 이 패키지에서 @Bean으로 관리할 것이다)
public class ServletAppContext implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");	// 불러올 jsp 파일의 이름만 남도록 설정. 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");	// 위와 같이 정적 파일 경로 설정.
	}
	
	// 인터셉터 등록. addInterceptors를 Override한다.
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		// 아래에 위치한 것이 Controller에 더 가까이 위치한다. 
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		TestInterceptorAll interAll = new TestInterceptorAll();
		TestInterceptorEvery interEvery = new TestInterceptorEvery();
		
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration regAll = registry.addInterceptor(interAll);
		InterceptorRegistration regEvery = registry.addInterceptor(interEvery);
		
		reg1.addPathPatterns("/test1");	// url test1로 요청이 있을 때 얘가 가로챌 것이다.
		reg2.addPathPatterns("/test1");
		
		reg3.addPathPatterns("/test2");
		
//		reg4.addPathPatterns("/test1");	// 하나의 인터셉터가 여러 개의 경로(Controller)에 대응할 수 있다. 
//		reg4.addPathPatterns("/test2");
		
//		reg4.addPathPatterns("/test1", "/test2");	// 이렇게 설정하는 것도 가능하다.
		reg4.excludePathPatterns("/**");	// 이러면 두 덩어리짜리는 다 거르고 나머지만 반응한다는 뜻이다. 
		
//		reg5.addPathPatterns("/sub1/test3", "/sub1/test4");
		reg5.excludePathPatterns("/sub1/test3", "/sub1/test4");	// 이러면 /sub1/test3 이랑 /sub1/test4는 거르겠다는 뜻이다. 나머지에는 반응한다. 
		
		regAll.addPathPatterns("/*");
		
		regEvery.addPathPatterns("/**");	// 몇 덩어리든, 비어있어도 실행된다. 
		
		
		
		
	}
	
}
