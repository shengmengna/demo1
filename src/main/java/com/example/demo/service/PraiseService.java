package com.example.demo.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PraiseMapper;
import com.example.demo.pojo.Praise;


@Service
public class PraiseService {
	@Autowired
	private PraiseMapper praiseMapper;
	
	public int selectByCount(@Param("pnid") int pnid) {
		return this.praiseMapper.selectByCount(pnid);
	}
	public int insertPraise(Praise praise) {
		return this.praiseMapper.insertPraise(praise);
	}
	public int deletePraise(@Param("puid") int puid,@Param("pnid") int pnid) {
		return this.praiseMapper.deletePraise(puid, pnid);
	}
}
