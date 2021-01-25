package com.neuedu.part07;

import java.sql.Date;

public class Singleton {
	
	//构造方法私有化
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();//饿汉式
	
	public static Singleton getInstance(){
		return instance;
	}
	
	
	private static Singleton instance1 = null;
	
	public static Singleton getInstance1(){
		if(instance1==null){//懒汉式
			instance1=new Singleton();
		}
		return instance1;
	}
	
	/*public Date getDate(){
		return new Date();
	}*/
	

}
