package com.exampletuto.demo;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class currencyController {
	@Autowired
	private currency cur;
	
	@RequestMapping("/currency-config")
	
	public currency retrive()
	{
		return cur;
	}
	
}
