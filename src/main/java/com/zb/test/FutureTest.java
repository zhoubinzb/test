package com.zb.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
	
	public void deal(){
		System.out.println("task done");
	}
	public String getName(){
		return "Task 101";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newSingleThreadExecutor();
		final FutureTest ft = new FutureTest();
		FutureTask<String> futureTask =  new FutureTask<String>(new Callable<String>() {//使用Callable接口作为构造参数  
		         public String call() {  
		        	 ft.deal();
		        	 ft.getName();
		        	 return "aa";
		       }});  
		executor.execute(futureTask);  
		String result = "";
		try {  
		    result = futureTask.get(10000, TimeUnit.MILLISECONDS); //取得结果，同时设置超时执行时间为5秒。同样可以用future.get()，不设置执行超时时间取得结果  
		} catch (InterruptedException e) {  
			futureTask.cancel(true);  
		} catch (ExecutionException e) {  
		    futureTask.cancel(true);  
		} catch (TimeoutException e) {  
		    futureTask.cancel(true);  
		} finally {  
		    executor.shutdown();  
		}
		
		System.out.println(result);
	}

}
