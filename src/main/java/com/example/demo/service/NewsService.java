package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NewsMapper;
import com.example.demo.pojo.News;

@Service
public class NewsService {
	@Autowired
	NewsMapper newsMapper;
	
	public List<News> selectByTid(@Param("ntid") int ntid){
		return this.newsMapper.selectByTid(ntid);
	}
	
	public News selectByNid(@Param("nid") int nid) {
		this.newsMapper.updateNcounts(nid);
		return this.newsMapper.selectByNid(nid);
		
	}
	
	public int updateNcounts(@Param("nid") int nid) {
		return this.newsMapper.updateNcounts(nid);
	}
	
	public int inserNews(News news) {
		return this.newsMapper.inserNews(news);
	}
	
	public List<News> selectByTopOne(){
		return this.newsMapper.selectByTopOne();
	}
}
