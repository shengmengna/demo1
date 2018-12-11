package com.example.demo.pojo;

import java.io.Serializable;

public class Praise implements Serializable{

	private int pid;
	private int pnid;
	private int puid;
	private String pdate;
	
	private int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPnid() {
		return pnid;
	}
	public void setPnid(int pnid) {
		this.pnid = pnid;
	}
	public int getPuid() {
		return puid;
	}
	public void setPuid(int puid) {
		this.puid = puid;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Praise [pid=" + pid + ", pnid=" + pnid + ", puid=" + puid + ", pdate=" + pdate + ", count=" + count
				+ "]";
	}
	
	
}
