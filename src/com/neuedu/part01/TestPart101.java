package com.neuedu.part01;

/**
 * 同一个java源文件可以写多个类
 * 多个类只能存在一个类通过public修饰
 * public修饰的类名 必须和源文件名一致
 * 
 * 可不可以有多个main方法？
 * 多个类可以分别有main方法，默认运行java程序时候会运行 public 修饰的类的main方法
 * 
 */
public class TestPart101{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("这是TestPart101的main方法");
		

	}

}

class Test20210206002{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("这是Test20210106002的main方法");
		

	}
}
