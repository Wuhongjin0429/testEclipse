package com.neuedu.part05;

/**
 * �����Ķ���͵���
 * �����Ƕ���õģ����ж������ܣ����ظ����õģ�Ϊ�˼򻯴�����ڣ�����������������֣�����һ��������������Ķ�����Ϊ��
 * 
 * ���������
 * ����ͷ ������
 * [����Ȩ�޿��Ʒ�] [���η�] ����ֵ����  ������(��������  ����������������  �������� ...)
 * { ������  }
 * ����Ȩ�޿��Ʒ�  ����дpublic ��Χ���
 * ���η�����  ����дstatic
 * ����ֵ����  ���û�з���ֵдvoid
 * 
 * ����  �����ǻ����������ͣ�Ҳ������������������
 * ���������ô��ݲ���Ϊ������������ʱ���Ǵ�ֵ��������
 * ���������ô��ݲ���Ϊ������������ʱ�����������ã�String���⣬�ַ��������ǲ��ɱ�ģ�
 * 
 * ����������
 * ����ͷ�ж������������  ��ʽ����  ����β�
 * ����ʱ ʵ�ʴ���ֵ�����ֲ�������ʵ�ʲ���  ���ʵ��
 * 
 * �� ����������
 * ��ͬһ����������ͬʱ���ڶ����ͬ�����������������������
 * 
 * �������صĹ���
 * ��������ͬ
 * �����Ĳ�����ͬ�������ĸ�����ͬ�����߲��������Ͳ�ͬ
 * �����ķ���ֵ����ν��������ͬ��Ҳ���Բ���ͬ��
 * 
 * 
 * �ݹ�
 * �����Լ����Լ�
 *
 */

public class TestPart501 {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ӡһ��5��6�е��Ǻ�
		outPrint(5,6);//ʵ��
		
		//��ӡһ��7��8�е��Ǻ�
		outPrint(7,8);
		
		//����2���������ֵ
		//���ػ���ݲ����Ĳ�ͬ��̬ѡ���Ӧ�ķ�������
		System.out.println(compare(1, 2));
		
		int i=2;
		int j=3;
		//����һ�η�����������Ӧ��ֵ��2
		int add2=add2(j);
		System.out.println(add2);
		System.out.println(j);
		System.out.println(add2==j);
		
		String str = "asdfghjk";//��һ�������������������
		str="sssss";
		System.out.println(str);
		
		//����һ�������������鸳ֵ
		int[] arr=new int[5];
		input(arr);
		for(int item:arr){
			System.out.println(item);
		}
		
		//����ͼ�����
		//Բ
		System.out.println(getArea(1,2));
		//�����ε����
		//�����ε����

	}
	
	public static double getArea(double radius){
		//����Բ�����
		return radius*radius*3.14;
	}
	public static int getArea(int height,int width){
		//���㳤���ε����
		return height*width;
	}
	public static int getArea(int sidelength){
		//���������ε����
		return sidelength*sidelength;
	}
	
	public static void input(int[] arr){
		int count=1;
		for(int i=0;i<arr.length;i++){
			arr[i]=count++;
		}
	}
	
	public static int add2(int j){
		j=j+2;
		return j;
	}
	
	//û�з���ֵ��д��
	//�ھ�̬�����У����õķ�������Ҳ�Ǿ�̬�ģ�static���εģ�
	//��չ��synchronized �����߳�ͬ��������
	public static synchronized void outPrint(int row,int col){//�β�
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//��2���������ֵ
	public static int compare(int num1,int num2){
		return num1>num2?num1:num2;
	}
	public static double compare(double num1,double num2){
		return num1>num2?num1:num2;
	}

}
