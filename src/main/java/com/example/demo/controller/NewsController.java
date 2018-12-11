package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.PraiseMapper;
import com.example.demo.pojo.Comments;
import com.example.demo.pojo.News;
import com.example.demo.pojo.Praise;
import com.example.demo.pojo.Topic;
import com.example.demo.pojo.User;
import com.example.demo.service.CommentService;
import com.example.demo.service.NewsService;
import com.example.demo.service.TopicService;
import com.example.demo.service.UserService;
@CrossOrigin
@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	NewsService newsService;
	
	@Autowired
	CommentService commentService;
	
	@Autowired
	TopicService topicService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	PraiseMapper praiseMapper;
	
	//所有类别
	@ResponseBody
	@GetMapping("/topic")
	public List<Topic> index() {
		return this.topicService.selectAll();
	}
	//根据类别查询所有对应的新闻
	@ResponseBody
	@GetMapping("/news/{ntid}")
	public List<News> selectByTid(@PathVariable int ntid) {
		return this.newsService.selectByTid(ntid);
	}
	//根据新闻呢id查询评论数量
	@ResponseBody
	@GetMapping("/CommentCount/{cnid}")
	public int selectByPraise(@PathVariable int cnid) {
		return this.commentService.selectByCount(cnid);
	}
	//根据新闻呢id查询评论数量
	@ResponseBody
	@GetMapping("/Praise/{cnid}")
	public int selectByCount(@PathVariable int cnid) {
		return this.praiseMapper.selectByCount(cnid);
	}
	//根据新闻类id查询新闻详情
	@ResponseBody
	@GetMapping("/selectByNid/{nid}")
	public News selectByNid(@PathVariable int nid) {
		return this.newsService.selectByNid(nid);
	}
	//根据新闻id查询新闻所有评论
	@ResponseBody
	@GetMapping("/selectByNidComment/{cnid}")
	public List<Comments> selectByNidComment(@PathVariable int cnid) {
		return this.commentService.selectByNidComment(cnid);
	}
	//按时间排序查询每天的第一条新闻
	@ResponseBody
	@GetMapping("/selectByTopOne")
	public List<News> selectByTopOne() {
		return this.newsService.selectByTopOne();
	}
	//新增评论
	@ResponseBody
	@GetMapping("/insertComment/{cnid}/{cuid}/{ccontent}")
	public int insertComment(@PathVariable int cnid,@PathVariable int cuid,@PathVariable int ccontent) {
		Comments c=new Comments();
		c.setCnid(cnid);
		c.setCuid(cuid);
		c.setCount(ccontent);
		return this.commentService.insertComment(c);
	}
	//新增点赞
	@ResponseBody
	@GetMapping("/insertPraise/{pnid}/{puid}")
	public int insertPraise(@PathVariable int pnid,@PathVariable int puid) {
		Praise p=new Praise();
		p.setPnid(pnid);
		p.setPuid(puid);
		return this.praiseMapper.insertPraise(p);
	}
	//删除评论
	@ResponseBody
	@GetMapping("/deleteComment/{cid}")
	public int deleteComment(int cid) {
		return this.commentService.deleteComment(cid);
	}
	//删除点赞
	@ResponseBody
	@GetMapping("/deleteComment/{puid}/{pnid}")
	public int deletePraise(int puid,int pnid) {
		return this.praiseMapper.deletePraise(puid, pnid);
	}

	// 去登录
		@RequestMapping(value = "/log", method = RequestMethod.GET)
		public String login() {
			return "/login.jsp";
		}
	@ResponseBody	
	@RequestMapping(value = "/login/{num}/{pwd}", method = RequestMethod.POST)
	public User login(@PathVariable String num, @PathVariable String pwd, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		
		User u = this.userService.Login(num, pwd);
		if (u == null) {
			return null;
		}
		session.setAttribute("user", u);
		return u;
	}
	// 退出
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/rest/user/log";
		}
		// 注册
				@ResponseBody
				@RequestMapping(value = "/insertUser/{name}/{num}/{pwd}", method = RequestMethod.POST)
				public void insertUser(@PathVariable String name,@PathVariable String num, @PathVariable String pwd,HttpSession session, HttpServletRequest request, HttpServletResponse response)
						throws IOException {
					response.setContentType("text/html;charset=utf-8");
					HttpSession sess = request.getSession();
								
								//否则新增数据
							    	   User u=new User();
										u.setNickName(name);
										u.setPwd(pwd);
										u.setAccountNum(num);
										int i = this.userService.insertUser(u);
										System.out.println(i>0);
										  
										if (i >0) {
											User us = this.userService.Login(num, pwd);
											System.out.println(us);
											session.setAttribute("user", us);
											//return "redirect:/rest/user/qq";
										}
				}
		}
