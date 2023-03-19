package com.prudhvi;

import java.util.List;

public class Car {
	private int cno;
	private String cname;
	private int cprice;
	private Tyre tyre;
	private List<Engine> engine;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCprice() {
		return cprice;
	}
	public void setCprice(int cprice) {
		this.cprice = cprice;
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public List<Engine> getEngine() {
		return engine;
	}
	public void setEngine(List<Engine> engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [cno=" + cno + ", cname=" + cname + ", cprice=" + cprice + ", tyre=" + tyre + ", engine=" + engine
				+ "]";
	}

}
