package kr.co.softcampus.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.KeyValueBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public ModelAndView test1(ModelAndView mav, DataBean1 bean, Model model) {	//@ModelAttribute는 생략되었다.
		
		bean.setA1("data2");
		bean.setA2("data2");
		bean.setA3("data2");
		bean.setA4("data2");
		
		String[] check_list = {"data1", "data3"};
		bean.setA5(check_list);
		bean.setA6(check_list);
		bean.setA7(check_list);
		bean.setA8(check_list);
		
		bean.setA9("data2");
		bean.setA10("data2");
		bean.setA11("data2");
		bean.setA12("data2");
		
		String[] data_list1 = {"data1", "data2", "data3"};
		model.addAttribute("data_list1", data_list1);
		
		ArrayList<String> data_list2 = new ArrayList<String>();
		data_list2.add("data1");
		data_list2.add("data2");
		data_list2.add("data3");
		data_list2.add("data4");
		model.addAttribute("data_list2", data_list2);
		
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();
		
		key_bean1.setKey("항목1");
		key_bean1.setValue("data1");
		
		key_bean2.setKey("항목2");
		key_bean2.setValue("data2");
		
		key_bean3.setKey("항목3");
		key_bean3.setValue("data3");
		
		ArrayList<KeyValueBean> data_list3 = new ArrayList<KeyValueBean>();
		data_list3.add(key_bean1);
		data_list3.add(key_bean2);
		data_list3.add(key_bean3);
		model.addAttribute("data_list3", data_list3);
		
		mav.setViewName("test1");
		return mav;
	}
	
}
