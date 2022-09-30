package kr.co.softcampus.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"kr.co.softcampus.beans", "kr.co.softcampus.advisor"})
@EnableAspectJAutoProxy // advisor 클래스에 설정되어 있는 Annotation을 자동으로 분석하여 AOP 설정하기.
public class BeanConfigClass {

}
