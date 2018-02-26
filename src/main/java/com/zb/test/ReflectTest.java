package com.zb.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	public ReflectTest(){
	}
	
	public ReflectTest(String f){
		this.ff = f;
	}
	
	private String ff;
	
	public String getFf() {
		return ff;
	}

	public void setFf(String ff) {
		this.ff = ff;
	}

	public void print(String name, String id){
		System.out.println("Run name and id = "+name+"_"+id);
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, 
		IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		// TODO Auto-generated method stub
		
		ReflectTest rtobj = new ReflectTest("111");
		
		String fieldName = "ff";
		String methodName = "print";
		String className = "com.zb.test.ReflectTest";
		
		Class ownerClass = rtobj.getClass();
		   
	    //get field 
		Field field = ownerClass.getDeclaredField(fieldName);
	     field.setAccessible(true);
	     Object property = field.get(rtobj);
	     System.out.println("Field "+fieldName+" = "+property.toString());
	     
	     //do method
	     Object[] args1 = new String[]{"invoke run","001"};
	     Class[] argsClass = new Class[args1.length];
	     for (int i = 0, j = args1.length; i < j; i++) {
	         argsClass[i] = args1[i].getClass();
	     }
	     Method method = ownerClass.getMethod(methodName,argsClass);
	     method.invoke(rtobj, args1);
	     
	     //new instance
	     Class newoneClass = Class.forName(className);  
	     String cargs = "222";
	     Class[] cargsClass = new Class[]{cargs.getClass()};  
	     Constructor cons = newoneClass.getConstructor(cargsClass);
	     ReflectTest newobj = (ReflectTest)cons.newInstance(cargs);
	     ReflectTest newobj2 = (ReflectTest) newoneClass.newInstance();
	     
	     //new instance do method
	     Object[] args2 = new String[]{"new invoke run","002"};
	     Class[] argsClass2 = new Class[args2.length];
	     for (int i = 0, j = args2.length; i < j; i++) {
	    	 argsClass2[i] = args2[i].getClass();
	     }
	     Method method2 = newobj.getClass().getMethod(methodName,argsClass2);
	     method.invoke(newobj, args2);
		
	}

}
