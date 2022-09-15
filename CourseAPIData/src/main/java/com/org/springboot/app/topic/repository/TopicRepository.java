package com.org.springboot.app.topic.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.springboot.app.topic.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
