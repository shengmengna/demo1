package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Praise;

public interface PraiseMapper {
	//每个新闻的点赞数量
	@Select("SELECT COUNT(pnid) 'count' FROM praise WHERE pnid=#{pnid}")
	int selectByCount(@Param("pnid") int pnid);
	//新增点赞
	@Insert("INSERT INTO praise(pnid,puid)VALUES(#{pnid},#{puid})")
	int insertPraise(Praise praise);
	
	//删除点赞
	@Delete("DELETE FROM praise WHERE puid=#{puid} AND praise.`pnid`=#{pnid}")
	int deletePraise(@Param("puid") int puid,@Param("pnid") int pnid);
}
