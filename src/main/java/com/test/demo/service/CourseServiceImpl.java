package com.test.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.demo.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(2,"test",""));
		list.add(new Course(3,"test",""));
		list.add(new Course(4,"",""));
		list.add(new Course(5,"",""));
		
	}
	
	

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		// TODO Auto-generated method stub
		return c;
	}
	
	
	

}
