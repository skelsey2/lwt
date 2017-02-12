package com.steveace6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	@RequestMapping("/")
	public String defaultPage() {
		System.out.println("home page loading");
		return "forward:baseLayout.html";
	}
}