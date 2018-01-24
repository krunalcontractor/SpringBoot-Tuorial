package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List <Topic> topics=   new ArrayList<Topic>(	Arrays.asList(
			new Topic("Spring" , "Spring Framwork" , "Spring framework discription"),
			new Topic("Java" , " Java Framwork" , "Java framework discription"),
			new Topic("Struts" , "Struts Framwork" , "Struts framework discription")
			
			));
	
	public List <Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t ->t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
