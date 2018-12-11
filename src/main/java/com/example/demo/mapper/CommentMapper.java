package com.example.demo.mapper;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Comments;

public interface CommentMapper {
	//根据新闻id查询所有评论
	@Select("SELECT * FROM comments	WHERE cnid=#{cnid}")
	List<Comments> selectByCnid(@Param("cnid") int cnid);
	//每个新闻的评论数量
	@Select("SELECT COUNT(cid) 'count' FROM comments WHERE cnid=#{cnid}")
	int selectByCount(@Param("cnid") int cnid);
	//根据新闻id查询新闻评论
	@Select("SELECT * FROM comments INNER JOIN USER ON user.`uid`=comments.`cuid` WHERE cnid=#{cnid} ORDER BY cdate DESC")
	List<Comments> selectByNidComment(@Param("cnid") int cnid);
	//新增评论信息
	@Insert("INSERT INTO comments(cnid,cuid,ccontent)VALUES(#{cnid},#{cuid},#{ccontent})")
	int insertComment(Comments comments);
	//删除评论信息
	@Delete("delete from comments where cid=#{cid}")
	int deleteComment(@Param("cid") int cid);
	
}
