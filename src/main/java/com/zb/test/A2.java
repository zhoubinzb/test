package com.zb.test;

public class A2 {
	
	public A2(){
		
	}
	
	public A2(String a, int b, int c){
		this.t1 = a;
		this.t2 = b;
		this.t4 = c;
	}
	
	private String t1;
	
	private int t2;
	
	private int t4;

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public int getT2() {
		return t2;
	}

	public void setT2(int t2) {
		this.t2 = t2;
	}

	public int getT4() {
		return t4;
	}

	public void setT4(int t4) {
		this.t4 = t4;
	}
	
}
