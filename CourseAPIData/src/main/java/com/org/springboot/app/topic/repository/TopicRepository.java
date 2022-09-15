package com.org.springboot.app.topic.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.springboot.app.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
