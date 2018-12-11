package com.example.demo.pojo;

import java.io.Serializable;

public class User implements Serializable{
	private int uid;
	private String nickName;
	private String accountImage;
	private String accountNum;
	private String pwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", nickName=" + nickName + ", accountImage=" + accountImage + ", accountNum="
				+ accountNum + ", pwd=" + pwd + "]";
	}
	
	
	
	
}
