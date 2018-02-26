package com.zb.test;

public class A1 {
	
	public A1(){
		
	}
	
	public A1(String a, int b, String c){
		this.t1 = a;
		this.t2 = b;
		this.t3 = c;
	}
	
	private String t1;
	
	private int t2;
	
	private String t3;

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

	public String getT3() {
		return t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}	

}
