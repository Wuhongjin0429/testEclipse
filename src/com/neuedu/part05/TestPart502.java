package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�õݹ鷽����׳�
		int factorial=factorial(5);
		System.out.println(factorial);
		
		
		//����쳲��������еĵ�16λ
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
	
	//쳲���������
	public static int fei(int n){//�ڼ�����
		if(n==1 || n==2){
			return 1;//����ֵ
		}else{
			return fei(n-1)+fei(n-2);
		}
	}
	
	
	//��дһ��������������n�Ľ׳ˣ�����5�Ľ׳���1*2*3*4*5��
	//��ײ�
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
	
	
	//дһ�����������ܣ�����һ��һά��int ���飬��������,Ȼ�����ǰ���С�����˳�������ʹ��ð�����򣩡�
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










