package com.tom.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        //设置参数
        Map<String, String> map = new HashMap<String, String>();
        map.put("Name", "Hello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("index", map);
        return modelAndView;
    }
}
