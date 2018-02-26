package com.zb.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSysTime {
	
	SimpleDateFormat df1 = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

    private String getbaseDate(){
        return "2017-03-02";  //从基础数据获取
    }

    public Date getDateTime() throws ParseException{
        Date date;

    	date = sdf.parse(this.getbaseDate() + " " + df1.format(new Date()));

    	return date;

    }

}
