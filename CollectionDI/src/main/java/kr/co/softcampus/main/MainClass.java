package kr.co.softcampus.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t01 = ctx.getBean("t01", TestBean.class);
		
		List<String> list01 = t01.getList01();
		for(String str : list01) {
			System.out.printf("list01: %s\n", str);
		}
		
		List<Integer> list02 = t01.getList02();
		for(int val : list02) {
			System.out.printf("list02: %d\n", val);
		}
		
		List<DataBean> list03 = t01.getList03();
		for(DataBean bean : list03) {
			System.out.printf("DataBean: %s\n", bean);
		}
		
		System.out.println("--------------------------------------");
		
		Set<String> set01 = t01.getSet01();
		for(String str : set01) {
			System.out.printf("set01: %s\n", str);
		}
		
		Set<Integer> set02 = t01.getSet02();
		for(int val : set02) {
			System.out.printf("set02: %d\n", val);
		}
		
		Set<DataBean> set03 = t01.getSet03();
		for(DataBean bean : set03) {
			System.out.printf("set03: %s\n", bean);
		}
		
		System.out.println("--------------------------------------");
		
		Map<String, Object> map01 = t01.getMap01();
		String a1 = (String)map01.get("a1");
		int a2 = (Integer)map01.get("a2");
		DataBean a3 = (DataBean)map01.get("a3");
		DataBean a4 = (DataBean)map01.get("a4");
		List<String> a5 = (List<String>)map01.get("a5");
		
		System.out.printf("map01.a1: %s\n", a1);
		System.out.printf("map01.a2: %d\n", a2);
		System.out.printf("map01.a3: %s\n", a3);
		System.out.printf("map01.a4: %s\n", a4);
		System.out.printf("map01.a5: %s\n", a5);
		
		for(String str : a5) {
			System.out.printf("a5: %s\n", str);
		}
		
		System.out.println("--------------------------------------");
		
		Properties prop01 = t01.getProp01();
		String p01 = prop01.getProperty("p1");
		String p02 = prop01.getProperty("p2");
		String p03 = prop01.getProperty("p3");
		
		System.out.printf("p1: %s\n", p01);
		System.out.printf("p2: %s\n", p02);
		System.out.printf("p3: %s\n", p03);
		
		ctx.close();
	}

}
