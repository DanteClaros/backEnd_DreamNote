package com.dreamnote.api.controller;

import org.springframework.web.bind.annotation.*;


@RestController //RestController is used to make a restful web services. This annotation is used at the class level and allows the class to handle the requests made by the client. 
@RequestMapping("/api") //RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. This means to make a web request of this class you will have to search localhost:port/api
public class Api {
	@GetMapping("/getAboutUs")
	public String getAboutUs() {
		return ApiController.readJSONFile("/Users/alu2019106/Documents/JSON/AboutUs.json");
	}
	
	@GetMapping("/getContact")
	public String getContact() {
		return ApiController.readJSONFile("/Users/alu2019106/Documents/JSON/Contact.json");
	}
}
