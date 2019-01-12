package com.geral.springboot08.task.contral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geral.springboot08.task.service.AsyncService;

@RestController
public class Contral {
	@Autowired
	AsyncService asyncService;
	
	@GetMapping("/hello")
	public String hello() 
	{
		asyncService.hello();
		return "运行中....";
	}
}
