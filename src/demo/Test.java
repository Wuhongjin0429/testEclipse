package demo;

import java.util.Scanner;
/**
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
		System.out.println("��1�µ���������Ϊ1��");//��һ����
		System.out.println("��2�µ���������Ϊ1��");//�ڶ�����
		//�������¿�ʼҪ�����仯��
		int x = 0; //������
		int y = 1; //�����ϸ���
		int z = 1; //�������ϸ���
		int month = 12;
		for(int i = 3; i<=month ;i++){//ѭ��10��
			x = y + z ;//��õ��µ���������
			System.out.println("��"+i+"�µ���������Ϊ"+x+"��");
			z = y ;//�����µ������������������µ���������������ѭ���á�
			y = x; //�����µ����������������£�����ѭ���á�
		}
		
		
		//�ж�101-200֮���ж��ٸ����������������������
		int n = 0;//��¼��������
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
		System.out.printf("һ����%d������",n);
		System.out.println();
		
		
		//��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
		//���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���   
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
		
		
		//���������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ѧϰ�ɼ�");
		int score=scanner.nextInt();
		if(score>=90){
			System.out.println("A");
		}else if (score>=60 && score<90) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
		//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
		/*int num=0,chartra=0,blak=0,other=0;  
        Scanner s=new Scanner(System.in);  
        System.out.println("������ַ���");  
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
        System.out.println("���ֵĸ�����"+num);  
        System.out.println("�ַ��ĸ�����"+chartra);  
        System.out.println("��ֵ�ĸ�����"+blak);  
        System.out.println("�����ĸ�����"+other); */
		
		
		//������������x,y,z���������������С���������
		int num1=0,num2=0,num3=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("�������һ����:");
	    num1=sc.nextInt();
	    System.out.print("������ڶ�����:");
	    num2=sc.nextInt();
	    System.out.print("�������������:");
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
	    
	    
	    //��ӡ������ͼ�������Σ�   
	    //*   
	    //***   
	    //*****   
	    //*******   
	    //*****   
	    //***   
	    //*
	    
	    
	    
	    //��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
	    
	    
	    
	    //��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
	    
	    
	    
	    //һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	    
	    
	    
	    //һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ�



	    
	    
	    
	    
	    
	    



	}

}
