package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
@RequestMapping("/hello11")
public String hello() {
	return "hello";
}
}
