package com.test.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Course;
import com.test.demo.service.CourseService;


@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	
//	home page
	@GetMapping("/home")
	public String Home() {
		return " mahendra";
	}
	
//	course
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
		return this.courseService.getCourse();
		
	}
	
	
//	course by id 
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	
	

}
