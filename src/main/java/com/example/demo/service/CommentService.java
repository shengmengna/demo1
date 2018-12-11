package com.example.demo.service;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.pojo.Comments;

@Service
public class CommentService {
	
	@Autowired
	CommentMapper commentMapper;
	
	public List<Comments> selectByCnid(@Param("cnid") int cnid){
		return this.commentMapper.selectByCnid(cnid);
	}
	
	public int selectByCount(@Param("cnid") int cnid) {
		return this.commentMapper.selectByCount(cnid);
	}
	
	public List<Comments> selectByNidComment(@Param("cnid") int cnid){
		return this.commentMapper.selectByNidComment(cnid);
	}
	
	public int insertComment(Comments comments) {
		return this.commentMapper.insertComment(comments);
	}
	
	public int deleteComment(@Param("cid") int cid) {
		return this.commentMapper.deleteComment(cid);
	}
}
