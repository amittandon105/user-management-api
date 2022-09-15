package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.controller.entities.Course;
import com.springrest.springrest.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	List<Course> list;
	
	public CourseServiceImpl() {
//		list= new ArrayList<>();
//		list.add(new Course(145,"java core course","this course contain basic of java"));
//		list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
//				
	}
	
	
	@Override
	public List<Course> getCourses() 
	{
		return courseDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {

//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {

//		list.add(course);
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
	
//	list.forEach(e -> {
//		if(e.getId()==course.getId())
//		{
//			e.setTitle(course.getTitle());
//			e.setDescription(course.getDescription());
//		}
//		});
		courseDao.save(course);
	return course;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long id) {
//		list=this.list.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
		
		Course entity=courseDao.getById(id);
		courseDao.delete(entity);
	}
}

















