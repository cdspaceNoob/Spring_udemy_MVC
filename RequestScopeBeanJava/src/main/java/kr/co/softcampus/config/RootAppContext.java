package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.softcampus.beans.DataBean1;

// 프로젝트 작업 시 사용할 Bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	@Bean
	@RequestScope // 새로운 요청이 생겼을 때 Bean이 생성되고 자동으로 주입해준다. request 객체에 저장한 것은 아니다. 
	public DataBean1 dataBean1() {
		return new DataBean1();
	}
}
