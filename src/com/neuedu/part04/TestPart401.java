package com.neuedu.part04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * ����
 * ��������ͬ���͵����ݰ���һ����˳�� �����һ���������������
 * �����������ͣ��Ե�ַ��ʽ���
 * ��ζ��壿
 * ��һ�ֶ��巽ʽ�� ���徲̬����  ��������[] �� = {��ŵ���ͬ���͵�ֵ�����ֵ֮���ö��Ÿ���}
 * �ڶ��ֶ��巽ʽ�� ���嶯̬����  ��������[] �� = new ��������[�����С]  �����С����ʡ
 * 
 * �����⣺�ٳ��㳣����5���쳣���ͣ�
 * 
 * ���������
 * ��  1.ð������
 *   2.java�ײ�������ṩ����������ʽ  Arrays�������sort() Ĭ������
 * 
 * ����Ĳ���
 *
 */

public class TestPart401 {

	public static void main(String[] args) {
		
		
		//��������
		int[] arr = {3,2,5,7,9,100,0};//�ǰ�new������
		System.out.println(arr);
		//�����ȡֵ��ʽ
		//ͨ��ֵ��λ�ã��±꣩��ȡֵ index����0��ʼ��
		System.out.println(arr[1]);
		
		//��������2
		//����������Ժ󣬻���ݶ�������͸���Ĭ��ֵ  intĬ��0  charĬ�Ͽ��ַ�
		int[] arr2 = new int[60];
		System.out.println(arr2);
		System.out.println((int)arr2[59]);
		//��ֵ
		arr2[0]='A';
		arr2[1]='B';
		
		int a = 0X6d06d69c;
		System.out.println(a);
		
		int[] arr3 = null;
		//System.out.println(arr3[0]);
		
		//���鸳ֵ60������1--60
		//ͨ�������i����������±�
		int e=1;
		for(int i=0;i<60;i++){
			arr2[i]=e;
			e++;
		}
		//�������ݲ鿴 ѭ����� ��Ϊ����ı���
		//��������� length
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		
		//����arr2��ƽ��ֵ
		double sum=0;
		for(int i=0;i<arr2.length;i++){
			sum += arr2[i];
		}
		System.out.println(sum/arr2.length);
		
		
		//����arr�����ֵ����Сֵ
		//��Ҫһ��������
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
		System.out.println("���ֵ��"+max+",��Сֵ��"+min);
		
		
		//int[] arr = {3,2,2,5,5,7,9,100,0};
		//���������
		//1.ð������  ����
		for(int i=0;i<arr.length-1;i++){//���������
			for(int k=0;k<arr.length-i-1;k++){//ÿһ�˱ȽϵĴ���
				if(arr[k+1]<arr[k]){//�Ƚ��ж�
					int temp;//����λ��
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
		
		
		
		//����һά����{ -10��2��3��246��-100��0��5} ������������е�ƽ��ֵ�����ֵ����Сֵ�����Ұ��ս������С�
		int[] arr4={-10,2,3,246,-100,0,5};
		double sum1=0;
		for(int i=0;i<arr4.length;i++){
			sum1+=arr4[i];
		}
		System.out.println("ƽ��ֵ��"+sum1/arr4.length);
		
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
		System.out.println("���ֵ��"+max1+",��Сֵ��"+min1);
		
		//����
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
		//����   ��ǿfor (���ͱ���������Ҫ������Ŀ��) ������������ÿ�α�����ֵ
		//�ص㣺û�����±�
		Arrays.sort(arr4);//Ĭ������
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
		
		
		//���ַ�����
		//ǰ����Ҫ����
		//0 2 2 3 5 5 7 9 100 arr
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��Ԥ��ֵ");
		int expect = scanner.nextInt();
		min=0;//��������±�
		max=arr.length-1;//��������±�

		while(max>=min){//����
			//ѭ����
			int mid = (min+max)/2;
			if(expect>arr[mid]){
				//Ԥ��ֵ����arr[mid] ���Ҳ�
				min=mid+1;
			}else if(expect<arr[mid]){
				//Ԥ��ֵС��midֵ  �����
				max=mid-1;
			}else{
				//�ҵ���
				System.out.println("Ԥ��ֵ"+expect+"����������±�Ϊ"+mid);
				break;
			}
		}
		if(max<min){
			System.out.println("Ԥ��ֵû���ҵ�");
		}
		
		
		//java�Դ��Ķ��ֲ��ҵķ���
		int binarySearch = Arrays.binarySearch(arr, -1);
		System.out.println(binarySearch);
		
		
		//����ĸ���
		int[] arrCopy = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrCopy[i]=arr[i];
		}
		
		
		//java�Դ��ĸ��Ʒ�ʽ
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		
		//���������
		Random random = new Random();
		for(int i=0;i<100;i++){
			System.out.println(random.nextInt(100));//���������   100����Χ0-99
		}
		System.out.println();
		
		
		//��λ���� ���� ����������
		int[] s[] = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		
		//��ҵ��
		//����һ����9��������1,6,2,3,9,4,5,7,8�������飬������Ȼ����������������ֵ��
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
		
		
		//��һ����8��������18��25��7��36��13��2��89��63�����������ҳ����������������±ꡣ
		int[] arr6={18,25,7,36,13,2,89,63};
		int max6=arr6[0];
		int p=0;
		for(int t=0;t<arr6.length-1;t++){
			if(arr6[t]>max6){
				max6=arr6[t];
				p=t;
			}
		}
		System.out.println("���ֵ��"+max6+"�±�ֵ��"+p);

		
		//��һ�������е�Ԫ�������š�
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
        
      //����̨����
      		Scanner scanner1 = new Scanner(System.in);
      		System.out.print("���������鳤�ȣ� ");
      		int len = scanner1.nextInt();
      		System.out.println("������������ֵ�� ");
      		
      		// ��������arr
      				int[] arr7 = new int[len];
      				int[] arr8 = new int[arr.length];
      				int j = 0;
      		//����һ������
      		for(int i = 0;i < len;i++){
      			arr[i] = scanner.nextInt();
      		}

		
		
		

	}

}
