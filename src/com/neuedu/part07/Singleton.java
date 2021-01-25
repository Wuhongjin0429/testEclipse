package com.neuedu.part07;

import java.sql.Date;

public class Singleton {
	
	//���췽��˽�л�
	private Singleton(){
		
	}
	
	private static Singleton instance = new Singleton();//����ʽ
	
	public static Singleton getInstance(){
		return instance;
	}
	
	
	private static Singleton instance1 = null;
	
	public static Singleton getInstance1(){
		if(instance1==null){//����ʽ
			instance1=new Singleton();
		}
		return instance1;
	}
	
	/*public Date getDate(){
		return new Date();
	}*/
	

}
