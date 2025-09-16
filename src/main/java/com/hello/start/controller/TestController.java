package com.hello.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "/test")
	public String test() {
		return ("스프링 부트 애플리케이션 입니다.");
	}
	

}
