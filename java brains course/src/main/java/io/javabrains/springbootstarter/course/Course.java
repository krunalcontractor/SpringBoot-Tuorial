package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String discription;
	
	@ManyToOne
	private Topic topic;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Course(String id, String name, String discription, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.topic= new Topic(topicId,"","");
	}
	public Course() {
		super();
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
