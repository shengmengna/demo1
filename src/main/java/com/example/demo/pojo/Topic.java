package com.example.demo.pojo;

import java.io.Serializable;

public class Topic implements Serializable{
	private int tid;
	private String tName;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "Topic [tid=" + tid + ", tName=" + tName + "]";
	}
	
}
