package com.org.springboot.app.course.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.springboot.app.course.entity.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findCourseByTopicId(String topicId);
}
