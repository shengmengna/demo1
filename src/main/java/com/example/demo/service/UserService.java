package com.example.demo.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User selectOne(int uid){
		return this.userMapper.selectOne(uid);
	}
	public User Login(String num,String pwd) {
		return this.userMapper.Login(num, pwd);
	}
	
	public int insertUser(User user) {
		return this.userMapper.insertUser(user);
	}
}
