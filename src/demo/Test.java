package demo;

import java.util.Scanner;
/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
		System.out.println("第1月的兔子数量为1对");//第一个月
		System.out.println("第2月的兔子数量为1对");//第二个月
		//第三个月开始要发生变化。
		int x = 0; //代表当月
		int y = 1; //代表上个月
		int z = 1; //代表上上个月
		int month = 12;
		for(int i = 3; i<=month ;i++){//循环10次
			x = y + z ;//获得当月的兔子数量
			System.out.println("第"+i+"月的兔子数量为"+x+"对");
			z = y ;//将上月的兔子数量赋给上上月的兔子数量，下轮循环用。
			y = x; //将当月的兔子数量赋给上月，下轮循环用。
		}
		
		
		//判断101-200之间有多少个素数，并输出所有素数。
		int n = 0;//记录素数个数
		for (int i = 101; i <= 200; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				} else {
					System.out.print(i+"\t");
					n++;
				}
				break;
			}
		}
		System.out.printf("一共有%d个素数",n);
		System.out.println();
		
		
		//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
		//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。   
		int a,b,c;
		for(int s=100;s<10000;s++){
			a=s/100%10;
			b=s/10%10;
			c=s/1%10;
			if(a*a*a+b*b*b+c*c*c==s){
				System.out.print(s+"\t");
			}
		}
		System.out.println();
		
		
		//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入学习成绩");
		int score=scanner.nextInt();
		if(score>=90){
			System.out.println("A");
		}else if (score>=60 && score<90) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
		//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
		/*int num=0,chartra=0,blak=0,other=0;  
        Scanner s=new Scanner(System.in);  
        System.out.println("请输出字符创");  
        String result=s.nextLine();  
        char x1[]=result.toCharArray();  
        for(int i=0;i<x1.length;i++){  
           if(Character.isDigit(x1[i])){  
               num++;  
           }else if(Character.isLetter(x1[i])){  
               chartra++;  
           }else if(Character.isSpace(x1[i])){  
               blak++;  
           }  
           else{  
               other++;  
           }
           System.out.println(x1.length);  
        }  
        System.out.println("数字的个数是"+num);  
        System.out.println("字符的个数是"+chartra);  
        System.out.println("空值的个数是"+blak);  
        System.out.println("其他的个数是"+other); */
		
		
		//输入三个整数x,y,z，请把这三个数由小到大输出。
		int num1=0,num2=0,num3=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("请输入第一个数:");
	    num1=sc.nextInt();
	    System.out.print("请输入第二个数:");
	    num2=sc.nextInt();
	    System.out.print("请输入第三个数:");
	    num3=sc.nextInt();
	    int j;
	    if(num1>num2){
	        j=num2;
	        num2=num1;
	        num1=j;
	    }
	    if(num1>num3){
	        j=num3;
	        num3=num1;
	        num1=j;
	    }
	    if(num2>num3){
	        j=num3;
	        num3=num2;
	        num2=j;
	    }
	    System.out.println(num1+" "+num2+" "+num3);
	    
	    
	    //打印出如下图案（菱形）   
	    //*   
	    //***   
	    //*****   
	    //*******   
	    //*****   
	    //***   
	    //*
	    
	    
	    
	    //有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
	    
	    
	    
	    //给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
	    
	    
	    
	    //一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	    
	    
	    
	    //一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？



	    
	    
	    
	    
	    
	    



	}

}
