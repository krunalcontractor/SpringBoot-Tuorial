package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	
	public List <Course> getAllCourse(String id){
		List<Course> courses = new ArrayList<>();
		// courseRepository.findAll().forEach(courses :: add);
		courseRepository.findByTopicId(id).forEach(courses :: add);
		return courses;
	}
	
	public Course getCourse(String id){
	return	courseRepository.findOne(id);
	//	return topics.stream().filter(t ->t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
		//topics.add(topic);
	}
	
	public void updateCourse(Course topic) {
		courseRepository.save(topic);
//		for(int i=0; i < topics.size(); i++){
//			Topic t = topics.get(i);
//			if(t.getId().equalsIgnoreCase(id)){
//				topics.set(i,topic);
//				return;
//			}
//		}		
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
		//topics.removeIf(t -> t.getId().equals(id));
		
	}
}
