package com.neuedu.part02;

import java.util.Scanner;

public class TestPart203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	//已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a = 1,b = 2;
	    int c = a;
	    a = b;
	    b = c;
	    System.out.println(a);
	    System.out.println(b);
	    
	    //给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
	    System.out.println("请输入一个1~1000的整数：");
        Scanner sca = new Scanner(System.in);
        int h = sca.nextInt();
        int z, j, k, l, sum;
        l = h / 1000;
        z = h / 100 % 10;
        j = h  / 10 % 10;
        k = h % 10;
        sum = z +j +k +l;
        System.out.println("结果为" + sum);

	    
	    //华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
	    double e;
	    double f;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("输入华氏度");
	    e = sc.nextDouble();
	    f = (e-32)*5/9;
	    System.out.println("转换为摄氏度为："+f);
	    
	    //给定一个任意的大写字母A~Z，转换为小写字母。
	    char o = 'A';
	    int i = o;
	    System.out.println((char)(o+32));


	}

}
