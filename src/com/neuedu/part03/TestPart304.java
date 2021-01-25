package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//输出两个数，输出它们的最大公约数
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数");
		int first = scanner.nextInt();
		System.out.println("输入第二个数");
		int second = scanner.nextInt();
		int result = 0;
		int min = first>second?second:first;
		for(int i=1;i<=min;i++){
			if(first%i==0 && second%i==0){
				result = i;
			}
		}
		System.out.println(result);*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数");
		int first = scanner.nextInt();
		System.out.println("输入第二个数");
		int second = scanner.nextInt();
		System.out.println("输入第三个数");
		int third = scanner.nextInt();
		
		int result =0;
		int min = first>second?second>third?third:second:first;
		for(int i=1;i<=min;i++){
			if(first%i==0  && second%i==0  && third%i==0){
				result=i;
			}
		}
		System.out.println(result);*/
		
		
		//输出1000以内所有水仙花数，指一个特殊的三位数，它的各位数字的立方和与其自身相等。
		int a,b,c;
		for (int s = 100; s < 1000; s++) {
			a=s/100%10;
			b=s/10%10;
			c=s/1%10;
			if (a*a*a+b*b*b+c*c*c ==s) {
				System.out.println(s);
			}
		}
		
		
		//百元白鸡问题，看懂
		
		
		//猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		//以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		int x = 1;
		for(int i=9;i>=1;i--){
			x=2*(x+1);
		}
		System.out.println(x);
		
		
		//企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
		//利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		//20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
		//60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
		//在程序中设定一个变量为当月利润，求应发放奖金总数？
		System.out.println("请输入当月利润（万元）：");
		Scanner sc1 = new Scanner(System.in);
		double y = sc1.nextDouble();
		if(y<0){
			System.out.println("输入有误，请重新输入（剩余次数0）");
			y = sc1.nextDouble();
			if (y<0) {
				System.out.println("频繁错误，输入结束");
				return;
			}
		}
		double bon=0;
		if(y<=10){
			bon=y*0.1;
		}else if(10<y && y<=20){
			bon=1+(y-10)*0.075;
		}else if(20<y && y<=40){
			bon=1.75+(y-20)*0.05;
		}else if(40<y && y<=60){
			bon=2.75+(y-40)*0.03;
		}else if(60<y && y<=100){
			bon=3.35+(y-60)*0.015;
		}else{
			bon=3.95+(y-100)*0.01;
		}
		System.out.println("应发奖金为："+bon);
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入当月利润（万元）：");
		double profit = scanner.nextDouble();
		double royalties = 0;
		int profit1;
		while(true){
			profit1 = (int)profit/10;
			switch (profit1) {
			// >=0 <100万
			case 0:
				royalties = profit * 0.1;
				System.out.println("\n应得奖金："+royalties*10000+"元");
				break;
			case 1:
				royalties = 1 + (profit - 10)* 0.075;
				System.out.println("\n应得奖金："+royalties*10000+"元");
				break;
			case 2:
			case 3:
				royalties = 1.75 + (profit - 20)* 0.05;
				System.out.println("\n应得奖金："+royalties*10000+"元");
				break;
			case 4:
			case 5:
				royalties = 2.75 + (profit - 40)* 0.03;
				System.out.println("\n应得奖金："+royalties*10000+"元");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				royalties = 3.35 + (profit - 60)* 0.015;
				System.out.println("\n应得奖金："+royalties*10000+"元");
				break;
			}
			
			//高于100万元
			if (profit1 >= 10) {
				royalties = 3.95+ (profit - 100)* 0.01;
				System.out.println("\n应得奖金："+royalties*10000+"元");
			}

			System.out.println("\n是否结束，结束请按-1 否则请继续输入数值");
			int select = scanner.nextInt();
			if (select == -1) {
				System.out.println("结束运行！");
				break;
			}else{
				profit = select;
			}
			
		}
		
		
		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
	   Scanner sc2 = new Scanner(System.in);
       int xy = sc2.nextInt();
       if(xy>999 && xy<=9999){
    	   int gewei = xy%10;
    	   int shiwei = xy % 100 / 10;
    	   int baiwei = xy%1000/100;
    	   int qianwei = xy/1000;
    	   int sum = qianwei + baiwei*10 +shiwei*100 +gewei*1000;
    	   System.out.println(sum);
       }
       else{
    	   System.out.println("error");
       }
				

		


	}

}
