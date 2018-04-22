package com.zb.test;

import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;

public class Test2 {
	
private Date date;
private String a1;
	
	public String getA1() {
	return a1;
}
	public void setA1(String a1) {
	this.a1 = a1;
}
	public Date getDate() { return date;	}
	public void setDate(Date date) { this.date = date; }

	public static void main(String[] args) throws Exception {

		Test2 dest = new Test2();
		Test2 source = new Test2();
		
		source.setA1("test2");
		//source.setDate(new Date());
		
		BeanUtils.copyProperties(dest, source);
		
		System.out.println(dest.getA1());
	}

}
