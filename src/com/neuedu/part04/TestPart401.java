package com.neuedu.part04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * 数组
 * 数组是相同类型的数据按照一定的顺序 组合在一起的引用数据类型
 * 引用数据类型：以地址形式存放
 * 如何定义？
 * 第一种定义方式： 定义静态数组  数据类型[] 名 = {存放的相同类型的值，多个值之间用逗号隔开}
 * 第二种定义方式： 定义动态数组  数据类型[] 名 = new 数据类型[数组大小]  数组大小不能省
 * 
 * 面试题：举出你常见的5种异常类型？
 * 
 * 数组的排序
 * ※  1.冒泡排序
 *   2.java底层给我们提供的数组排序方式  Arrays类下面的sort() 默认升序
 * 
 * 数组的查找
 *
 */

public class TestPart401 {

	public static void main(String[] args) {
		
		
		//定义数组
		int[] arr = {3,2,5,7,9,100,0};//是把new隐藏了
		System.out.println(arr);
		//数组的取值方式
		//通过值的位置（下标）来取值 index，从0开始的
		System.out.println(arr[1]);
		
		//定义数组2
		//定义好数组以后，会根据定义的类型赋予默认值  int默认0  char默认空字符
		int[] arr2 = new int[60];
		System.out.println(arr2);
		System.out.println((int)arr2[59]);
		//赋值
		arr2[0]='A';
		arr2[1]='B';
		
		int a = 0X6d06d69c;
		System.out.println(a);
		
		int[] arr3 = null;
		//System.out.println(arr3[0]);
		
		//数组赋值60个数字1--60
		//通常这里的i用于数组的下标
		int e=1;
		for(int i=0;i<60;i++){
			arr2[i]=e;
			e++;
		}
		//数组数据查看 循环输出 成为数组的遍历
		//数组的属性 length
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
		//计算arr2的平均值
		double sum=0;
		for(int i=0;i<arr2.length;i++){
			sum += arr2[i];
		}
		System.out.println(sum/arr2.length);
		
		
		//计算arr的最大值，最小值
		//需要一个参照数
		int min =arr[0];
		int max =arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("最大值是"+max+",最小值是"+min);
		
		
		//int[] arr = {3,2,2,5,5,7,9,100,0};
		//数组的排序
		//1.冒泡排序  升序
		for(int i=0;i<arr.length-1;i++){//排序的趟数
			for(int k=0;k<arr.length-i-1;k++){//每一趟比较的次数
				if(arr[k+1]<arr[k]){//比较判断
					int temp;//交换位置
					temp=arr[k+1];
					arr[k+1]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
		//给定一维数组{ -10，2，3，246，-100，0，5} ，计算出数组中的平均值、最大值、最小值。并且按照降序排列。
		int[] arr4={-10,2,3,246,-100,0,5};
		double sum1=0;
		for(int i=0;i<arr4.length;i++){
			sum1+=arr4[i];
		}
		System.out.println("平均值是"+sum1/arr4.length);
		
		int min1=arr4[0];
		int max1=arr4[0];
		for(int i=0;i<arr4.length;i++){
			if(arr4[i]>max1){
				max1=arr4[i];
			}
			if(arr4[i]<min1){
				min1=arr4[i];
			}
		}
		System.out.println("最大值是"+max1+",最小值是"+min1);
		
		//排序
		/*for(int i=0;i<arr4.length-1;i++){
			for(int j=0;j<arr4.length-i-1;j++){
				if(arr4[j+1]>arr4[j]){
					int temp;
					temp=arr4[j+1];
					arr4[j+1]=arr4[j];
					arr4[j]=temp;
				}
			}
		}*/
		//遍历   加强for (类型变量名：需要遍历的目标) 变量用来代表每次遍历的值
		//特点：没有了下标
		Arrays.sort(arr4);//默认升序
		for(int item:arr4){
			System.out.print(item+" ");
		}
		System.out.println();
		/*for(int i=0;i<arr4.length;i++){
			System.out.print(arr4[i]+" ");
		}*/
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==100){
				System.out.println(i);
				break;
			}
		}
		
		
		//二分法查找
		//前提是要排序
		//0 2 2 3 5 5 7 9 100 arr
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个预期值");
		int expect = scanner.nextInt();
		min=0;//定义的是下标
		max=arr.length-1;//定义的是下标

		while(max>=min){//条件
			//循环体
			int mid = (min+max)/2;
			if(expect>arr[mid]){
				//预期值大于arr[mid] 在右侧
				min=mid+1;
			}else if(expect<arr[mid]){
				//预期值小于mid值  在左侧
				max=mid-1;
			}else{
				//找到了
				System.out.println("预期值"+expect+"在数组里的下标为"+mid);
				break;
			}
		}
		if(max<min){
			System.out.println("预期值没有找到");
		}
		
		
		//java自带的二分查找的方法
		int binarySearch = Arrays.binarySearch(arr, -1);
		System.out.println(binarySearch);
		
		
		//数组的复制
		int[] arrCopy = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrCopy[i]=arr[i];
		}
		
		
		//java自带的复制方式
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		
		//生成随机数
		Random random = new Random();
		for(int i=0;i<100;i++){
			System.out.println(random.nextInt(100));//生成随机数   100代表范围0-99
		}
		System.out.println();
		
		
		//二位数组 就是 数组套数组
		int[] s[] = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		
		//作业：
		//给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，然后输出排序后的数组的值。
		int[] arr5={1,6,2,3,9,4,5,7,8};
		for(int u=0;u<arr5.length-1;u++){
			for(int o=0;o<arr5.length-u-1;o++){
				if(arr5[o+1]<arr5[o]){
					int temp;
					temp=arr5[o+1];
					arr5[o+1]=arr5[o];
					arr5[o]=temp;
				}
			}
		}
		for(int u=0;u<arr5.length;u++){
			System.out.print(arr5[u]+" ");
		}
		System.out.println();
		
		
		//在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
		int[] arr6={18,25,7,36,13,2,89,63};
		int max6=arr6[0];
		int p=0;
		for(int t=0;t<arr6.length-1;t++){
			if(arr6[t]>max6){
				max6=arr6[t];
				p=t;
			}
		}
		System.out.println("最大值是"+max6+"下标值是"+p);

		
		//将一个数组中的元素逆序存放。
		int[] a1 = { 1, 2, 6, 4, 5 };
        int b;
        for (int i = 0; i < a1.length/2; i++) {
            b=a1[i];
            a1[i]=a1[a1.length-1-i];
            a1[a1.length-1-i]=b;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        
      //控制台输入
      		Scanner scanner1 = new Scanner(System.in);
      		System.out.print("请输入数组长度： ");
      		int len = scanner1.nextInt();
      		System.out.println("请输入数组数值： ");
      		
      		// 定义数组arr
      				int[] arr7 = new int[len];
      				int[] arr8 = new int[arr.length];
      				int j = 0;
      		//输入一个数组
      		for(int i = 0;i < len;i++){
      			arr[i] = scanner.nextInt();
      		}

		
		
		

	}

}
