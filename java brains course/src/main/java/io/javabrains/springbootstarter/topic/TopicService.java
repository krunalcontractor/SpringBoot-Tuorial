package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List <Topic> topics=   new ArrayList<Topic>(	Arrays.asList(
			new Topic("Spring" , "Spring Framwork" , "Spring framework discription"),
			new Topic("Java" , " Java Framwork" , "Java framework discription"),
			new Topic("Struts" , "Struts Framwork" , "Struts framework discription")
			
			));
	
	public List <Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		 topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	public Topic getTopic(String id){
	return	topicRepository.findOne(id);
	//	return topics.stream().filter(t ->t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		//topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		topicRepository.save(topic);
//		for(int i=0; i < topics.size(); i++){
//			Topic t = topics.get(i);
//			if(t.getId().equalsIgnoreCase(id)){
//				topics.set(i,topic);
//				return;
//			}
//		}		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		//topics.removeIf(t -> t.getId().equals(id));
		
	}
}
