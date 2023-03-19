package com.prudhvi;

public class Engine {
	private String ename;
	private String etype;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	@Override
	public String toString() {
		return "Engine [ename=" + ename + ", etype=" + etype + "]";
	}
	

}
