package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.pojo.News;

public interface NewsMapper {
	//按类别id查询新闻
	@Select("SELECT * FROM news WHERE ntid=#{ntid} ORDER BY ncreatedate DESC")
	List<News> selectByTid(@Param("ntid") int ntid);
	//按新闻id查询新闻详情
	@Select("SELECT * FROM news WHERE nid=#{nid}")
	News selectByNid(@Param("nid") int nid);
	//按时间排序查询每天的第一条新闻
	@Select("SELECT x.* FROM news X GROUP BY DATE_FORMAT(x.ncreatedate ,'%Y-%m-%d') ORDER BY x.ncreatedate DESC")
	List<News> selectByTopOne();
	
	//点击查看新闻详情浏览量+1
	@Update("update news set ncounts=ncounts+1 where nid=#{nid}")
	int updateNcounts(@Param("nid") int nid);
	//新增新闻
	@Insert("INSERT INTO news(ntid,ntitle,nauthor,ncontent,ncounts,npicpath,nsummary)\r\n" + 
			"VALUES(#{ntid},#{ntitle},#{nauthor},#{ncontent},#{ncounts},#{npicpath},#{nsummary})")
	int inserNews(News news);
}
