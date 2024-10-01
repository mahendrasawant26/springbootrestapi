package com.test.demo.service;

import java.util.List;

import com.test.demo.entity.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(long courseId );

}
