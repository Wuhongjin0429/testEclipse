package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//用递归方法算阶乘
		int factorial=factorial(5);
		System.out.println(factorial);
		
		
		//计算斐波那契数列的第16位
		//1.1.2.3.5.8.13.21
		int fei=fei(16);
		System.out.println(fei);
		
		
		//
		int[] arr={3,1,6,4,9,7};
		abc(arr);
		for(int e:arr) {
			System.out.print(e+"  ");
		}

	}
	
	//斐波那契数列
	public static int fei(int n){//第几个数
		if(n==1 || n==2){
			return 1;//本身值
		}else{
			return fei(n-1)+fei(n-2);
		}
	}
	
	
	//编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
	//算阶层
	public static int factorial(int n){
		if(n==2){
			return 1*2;
		}else{
			return n*factorial(n-1);
		}
	}	
	/*public static int factorial(int n){
		int result=1;
		for(int i=2;i<=n;i++){
			result*=i;
		}
		return result;*/
	
	
	//写一个方法，功能：定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。
	public static void abc(int[] arr){
		for(int d=0;d<arr.length-1;d++){
			for(int e=0;e<arr.length-d-1;e++){
				if(arr[e+1]<arr[e]){
					int temp;
					temp=arr[e+1];
					arr[e+1]=arr[e];
					arr[e]=temp;
				}
			}
		}
	}
	
	
	
	
	
	

}










