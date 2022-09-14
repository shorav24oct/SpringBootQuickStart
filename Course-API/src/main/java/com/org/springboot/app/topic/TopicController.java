package com.org.springboot.app.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("spring", "spring framework", "spring F/W description"),
				new Topic("java", "J2SE", "core java"),
				new Topic("REST", "REST full service", "by using JAX-RS implement Jersey"));
	}

}
