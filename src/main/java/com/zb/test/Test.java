package com.zb.test;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.json.JSONObject;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;  

import net.sf.cglib.beans.BeanMap;


public class Test {
	
	public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException
    {
        A1 a1 = new A1();
        A2 a2 = new A2("abc",97,80);
        
        //BeanUtils.copyProperties(a1, a2);
        
		System.out.println( a1.getT1() + " || " + a1.getT2()  + " || " + a1.getT3() );
		
		List<A3> la3 = new ArrayList<A3>();
		List<A4> la4 = new ArrayList<A4>();
		
		A4 z1 = new A4("s1",1);
		A4 z2 = new A4("s2",2);
		A4 z3 = new A4("s3",3);
		
		A4 z4 = new A4();
		
		A4 zz1 = new A4();
		Map<String, Object> map = new HashMap<String, Object>();
		BeanMap beanMap = BeanMap.create(zz1);
		for(Object key:beanMap.keySet()){
			map.put(key+"",beanMap.get(key));
		}
		System.out.println( map.toString() );
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("q1", 1);
		map2.put("q2", 2);
		map2.put("q3", 3);
		System.out.println( map2.toString() );
		
		GetSysTime systime = new GetSysTime();
		try {
			Date t = systime.getDateTime();
			System.out.println(t.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(z4.getT1() == null){
			System.out.println( "aaaaaaa");
		}
		
		System.out.println(Integer.MAX_VALUE);
		
		//map转json-----start
		ObjectMapper mapper = new ObjectMapper();  
        String m2json = "";  
          
        Map<String, String> jmap = new HashMap<String,String>();  
        jmap.put("name", "zitong");  
        jmap.put("age", "26");  
          
        try {
			m2json = mapper.writeValueAsString(jmap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
          
        System.out.println(m2json);  
        //map转json-----end
        
        Map<String, String> dmap = new HashMap<String,String>(); 
        System.out.println(dmap.size());
        dmap.put("xx", "1");
        dmap.put("xx", "2");
        dmap.put("yy", "3");
        System.out.println(dmap.toString());
        System.out.println(dmap.size());
        
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        System.out.println(dateString);  
        
        System.out.println("舍掉小数取整:Math.floor=" + (int)Math.floor(new BigDecimal(2.5).doubleValue())); 
        
      //json2map-----start
        String json = "{\"name\":\"zitong\", \"age\":\"26\"}";  
        Map<String, Object> mmap = new HashMap<String, Object>();  
          
        try{  
        	mmap = mapper.readValue(json, new TypeReference<HashMap<String,Object>>(){});  
            System.out.println("mmap:: "+mmap);  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
      //json2map-----end
        
      //map转json-----start2
              String m2json2 = "";  
                
              Map<String, Object> jmap2 = new HashMap<String,Object>();  
              jmap2.put("name", "zitong");  
              jmap2.put("age", "26");  
              List<Map<String,String>> ll = new ArrayList<Map<String,String>>();
              Map<String, String> llmap = new HashMap<String,String>();  
              llmap.put("math", "60");  
              llmap.put("english", "70");  
              ll.add(llmap);
              jmap2.put("cout", ll);  
              
              try {
            	  m2json2 = mapper.writeValueAsString(jmap2);
      		} catch (JsonProcessingException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}  
                
              System.out.println(m2json2);  
              //map转json-----end2
        
             
        
    }

}
