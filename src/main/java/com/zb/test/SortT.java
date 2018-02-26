package com.zb.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortT implements Comparable {
	
	private String a1;
	private Double a2;
	
	public SortT(String m, Double n){
		this.a1 = m;
		this.a2 = n;
	}
	
	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public Double getA2() {
		return a2;
	}

	public void setA2(Double a2) {
		this.a2 = a2;
	}
	
	public int compareTo(Object o) {
		SortT st = (SortT)o;

		Double x = st.getA2();
		String y = st.getA1();
	       
		int ct =this.a2.compareTo(x);
		//return ct;
		
        if(ct!=0){
            return ct;
        }
        else{
        	return -this.a1.compareTo(y);
        }
        
	}

	public static void main( String[] args )  {
		
		SortT t1 = new SortT("2",-999.9);
		SortT t2 = new SortT("2",0.0);
		SortT t3 = new SortT("1",-999.9);
		SortT t4 = new SortT("1",0.0);
		
		List<SortT> sorttlist = new ArrayList();
		sorttlist.add(t1);
		sorttlist.add(t2);
		sorttlist.add(t3);
		sorttlist.add(t4);
		
		//Collections.sort(sorttlist);
		
		for(SortT t:sorttlist){
			System.out.println(t.getA1()+"**"+t.getA2());
		}
		
		System.out.println("========================");
		Collections.sort(sorttlist);
		
		for(SortT t:sorttlist){
			System.out.println(t.getA1()+"**"+t.getA2());
		}
		
    }

}
