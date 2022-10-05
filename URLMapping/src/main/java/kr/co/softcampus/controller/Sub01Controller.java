package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Sub01Controller {

	@RequestMapping(value="/sub01/test03", method=RequestMethod.GET)
	public String sub01Test03() {
		return "sub01/test03";
	}
	
	@RequestMapping(value="/sub01/test04", method=RequestMethod.GET)
	public String sub01Test04() {
		return "sub01/test04";
	}
}
