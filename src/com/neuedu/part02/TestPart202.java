package com.neuedu.part02;

import java.util.Scanner;

/**
 * java运算符
 * 算数运算符：
 *        +， -， *，/， %取余（被除数为正就为正）
 *        ++自增， --自减， ++变量   先加后用， 变量++ 先用后加
 *        
 * 赋值运算符：+=，-=
 * 
 * 关系运算符：>，>=，<，<=，==，!=（不等于）        关系运算结果是布尔型
 * 
 * 逻辑运算符：针对两个布尔型的数进行的不二运算
 *         && 逻辑与     同真则真，有假则假
 *         || 逻辑或     有真则真，同假则假
 *         ! 逻辑非     对结果取反
 *         以上属于短路运算（&&判断第一个表达式的值如果为false，则第二个不执行，||判断第一个如果为true，第二个不执行）
 *         &，| 属于非短路（运行慢）
 * 
 * 三目条件运算符（三元表达式）
 * 如果表达式1为真，则输出表达式2，否则则输出表达式3
 * 表达式1? 表达式2: 表达式3
 * 
 * 
 *
 */
public class TestPart202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(-5%-2);
		
		int i = 0;
		//扩展：i++ 是否是线程安全的
		System.out.println(i++ + ++i);//表达式运算过程中也会受影响
		System.out.println("这是用来学习字符串连接"+(i+ ++i));
		
		
		int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++/*3*/ + x1*y1;/* 4*5 */
	    r2 = ++x2/*4*/ + x2*y2;/* 4*5 */
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
	    
	    System.out.println(5.0/2);
	    
	    x1 = x1 + 3;/* 4+3 */
	    x1 +=3;
	    System.out.println(x1);
	    
	    System.out.println(x1 != x2);
	    
	    boolean flag = true,flag1 = false;
	    System.out.println(flag & flag1);//false
	    System.out.println(flag | flag1);//true
	    System.out.println(flag ^ flag1);//true
	    
	    System.out.println(flag & flag1?3-1:4+1);
	    
	    //已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。

	    //给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。

	    //华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。

	    //给定一个任意的大写字母A~Z，转换为小写字母。
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("请输入内容：");
	    String c = sc.nextLine();
	    System.out.println("由控制台输入的数为："+c);

	}

}
