package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TopicMapper;
import com.example.demo.pojo.Topic;

@Service
public class TopicService {
	
	@Autowired
	TopicMapper topicMapper;
	
	public List<Topic> selectAll(){
		return this.topicMapper.selectAll();
	}
}
