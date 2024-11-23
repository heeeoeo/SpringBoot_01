package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//GetMapping의 주소값이 메소드명과 달라도 무관하다
	@GetMapping("/hello1")
	@ResponseBody
	
	public String hello() {
		return "Hello World";
	}
}
