package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.User;

public interface UserMapper {
	
	@Select("SELECT * FROM USER WHERE uid=#{uid}")
	User selectOne(@Param("uid") int uid);
	
	// 登录
	@Select("SELECT * FROM USER WHERE accountNum=#{accountNum} AND pwd=#{pwd}")
	User Login(@Param("accountNum") String accountNum, @Param("pwd") String pwd);

	// 注册
	@Insert("INSERT INTO USER(nickName,accountNum,pwd)VALUES(#{nickName},#{accountNum},#{pwd})")
	int insertUser(User user);
}
