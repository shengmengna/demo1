package com.example.demo.pojo;

import java.io.Serializable;

public class Comments implements Serializable{
	private int cid;//评论id
	private int cnid;//新闻id
	private int cuid;//用户id
	private String ccontent;//内容
	private String cdate;//评论时间
	
	private int count;//评论数量
	
	private String nickName;
	private String accountImage;
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAccountImage() {
		return accountImage;
	}
	public void setAccountImage(String accountImage) {
		this.accountImage = accountImage;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getCnid() {
		return cnid;
	}
	public void setCnid(int cnid) {
		this.cnid = cnid;
	}
	public int getCuid() {
		return cuid;
	}
	public void setCuid(int cuid) {
		this.cuid = cuid;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", cnid=" + cnid + ", cuid=" + cuid + ", ccontent=" + ccontent + ", cdate="
				+ cdate + ", count=" + count + ", nickName=" + nickName + ", accountImage=" + accountImage + "]";
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	
}
