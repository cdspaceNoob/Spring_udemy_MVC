package kr.co.softcampus.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softcampus.beans.DataBean;

@RestController
public class RestTestController {

	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataBean>> test2() {
		
		DataBean bean1 = new DataBean("String1", 101, 11.11, true);
		DataBean bean2 = new DataBean("String2", 202, 21.21, false);
		DataBean bean3 = new DataBean("String3", 303, 31.31, true);

		ArrayList<DataBean> list = new ArrayList<DataBean>();
		
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		
		// list를 json 객체로 변환해본다. ResponseEntity 생성자의 첫 번째 파라미터는 json으로 변환할 값이며 두 번째는 이 응답 결과가 정상적이라는 것을 알리기 위해 적어주는 것이다.
		ResponseEntity<ArrayList<DataBean>> entry = new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		
		return entry;	// 이 문자열 자체가 응답 결과가 된다. json을 볼 때는 firefox가 기본적으로 예쁘다. Chrome에서는 확장 프로그램을 이용하여 예쁘게 볼 수 있다. 
	}
}
