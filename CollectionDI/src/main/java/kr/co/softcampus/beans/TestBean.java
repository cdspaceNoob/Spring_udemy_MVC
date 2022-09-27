package kr.co.softcampus.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {
	
	private List<String> list01;
	
	// java에서는 원시타입(기본타입) 자료형을 list에 담지 못하므로
	// 원시타입(기본타입) 자료형의 Wrapper Class를 제너릭으로 사용한다
	private List<Integer> list02;
	private List<DataBean> list03;
	
	private Set<String> set01;
	private Set<Integer> set02;
	private Set<DataBean> set03;
	
	private Map<String, Object> map01;
	
	private Properties prop01;

	public List<String> getList01() {
		return list01;
	}

	public void setList01(List<String> list01) {
		this.list01 = list01;
	}

	public List<Integer> getList02() {
		return list02;
	}

	public void setList02(List<Integer> list02) {
		this.list02 = list02;
	}

	public List<DataBean> getList03() {
		return list03;
	}

	public void setList03(List<DataBean> list03) {
		this.list03 = list03;
	}

	public Set<String> getSet01() {
		return set01;
	}

	public void setSet01(Set<String> set01) {
		this.set01 = set01;
	}

	public Set<Integer> getSet02() {
		return set02;
	}

	public void setSet02(Set<Integer> set02) {
		this.set02 = set02;
	}

	public Set<DataBean> getSet03() {
		return set03;
	}

	public void setSet03(Set<DataBean> set03) {
		this.set03 = set03;
	}

	public Map<String, Object> getMap01() {
		return map01;
	}

	public void setMap01(Map<String, Object> map01) {
		this.map01 = map01;
	}

	public Properties getProp01() {
		return prop01;
	}

	public void setProp01(Properties prop01) {
		this.prop01 = prop01;
	}
	
}
