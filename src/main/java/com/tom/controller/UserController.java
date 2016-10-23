package com.tom.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@RequestMapping("/login")
	public ModelAndView loginView() {
		// 设置参数
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Hello");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("index", map);
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginAction", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(@RequestParam Map<?, ?> map) {
		System.out.println(map.toString());
		return "/index";
	}
}
