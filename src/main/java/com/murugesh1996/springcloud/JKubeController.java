package com.murugesh1996.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JKubeController {

	@GetMapping("/hello")
	public String hello() {
		return "JKube is Cool!!!";
	}
}
