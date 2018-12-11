package com.example.demo.pojo;

import java.io.Serializable;

public class News implements Serializable{
	private int nid;//新闻id
	private int ntid;//类别id
	private String ntitle;//标题
	private String nauthor;//作者
	private String ncontent;//内容
	private int ncounts;//浏览量
	private String ncreatedate;//创建时间
	private String nmodifydate;//修改时间
	private String npicpath;//图片路径
	private String nsummary;//备注
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public int getNcounts() {
		return ncounts;
	}
	public void setNcounts(int ncounts) {
		this.ncounts = ncounts;
	}
	public String getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(String ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public String getNmodifydate() {
		return nmodifydate;
	}
	public void setNmodifydate(String nmodifydate) {
		this.nmodifydate = nmodifydate;
	}
	public String getNpicpath() {
		return npicpath;
	}
	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}
	public String getNsummary() {
		return nsummary;
	}
	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}
	@Override
	public String toString() {
		return "News [nid=" + nid + ", ntid=" + ntid + ", ntitle=" + ntitle + ", nauthor=" + nauthor + ", ncontent="
				+ ncontent + ", ncounts=" + ncounts + ", ncreatedate=" + ncreatedate + ", nmodifydate=" + nmodifydate
				+ ", npicpath=" + npicpath + ", nsummary=" + nsummary + "]";
	}
	
}
