package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloJump {
	@GetMapping("/jump")
	@ResponseBody
	
	public String Jump() {
		return "점푸 투 스프링 부트";
	}
}