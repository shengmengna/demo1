package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Topic;

public interface TopicMapper {
	@Select("SELECT * FROM topic")
	List<Topic> selectAll();
	
	

}
