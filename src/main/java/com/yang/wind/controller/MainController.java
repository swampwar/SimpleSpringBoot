package com.yang.wind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yang.wind.dto.Simple;
import com.yang.wind.service.SimpleService;

@Controller
public class MainController {
	
	@Autowired
	SimpleService sService;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/db")
	@ResponseBody
	public String dbConnectionTest() {
		List<Simple> lists = sService.selectAll();
		return lists.toString();
	}
}
