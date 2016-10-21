package com.tom.controller;

import org.springframework.web.bind.annotation.RequestMethod;

public class BaseController {
	public static RequestMethod GET = RequestMethod.GET;
	public static RequestMethod POST = RequestMethod.POST;
	
	public enum R {
		GET
	}
}
