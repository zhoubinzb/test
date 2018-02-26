package com.zb.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ReviewMap {
	
	private static void review(Map inmap){
		Iterator entries = inmap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(String.valueOf(key) + ": " + String.valueOf(value));  
            if(value instanceof Map){
            	review((Map)value);
            }
        }
	}
	
	public static void main(String[] args) {
		Map<String, Object> jmap2 = new HashMap<String,Object>();  
        jmap2.put("name", "zitong");  
        jmap2.put("age", "26");  
        List<Map<String,String>> ll = new ArrayList<Map<String,String>>();
        Map<String, String> llmap = new HashMap<String,String>();  
        llmap.put("math", "60");  
        llmap.put("english", "70");  
        ll.add(llmap);
        jmap2.put("cout", ll);  
        review(jmap2);
    }

}
