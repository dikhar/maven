package com.exampletuto.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class courseController {
	@RequestMapping("/course")
	public List<Course> retreiveCourse()
	{
		return Arrays.asList(
				new Course(1,"h"),
				new Course(2,"j")
				);
	}
}
	