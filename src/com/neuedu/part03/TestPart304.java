package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����������������ǵ����Լ��
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ����");
		int first = scanner.nextInt();
		System.out.println("����ڶ�����");
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
		System.out.println("�����һ����");
		int first = scanner.nextInt();
		System.out.println("����ڶ�����");
		int second = scanner.nextInt();
		System.out.println("�����������");
		int third = scanner.nextInt();
		
		int result =0;
		int min = first>second?second>third?third:second:first;
		for(int i=1;i<=min;i++){
			if(first%i==0  && second%i==0  && third%i==0){
				result=i;
			}
		}
		System.out.println(result);*/
		
		
		//���1000��������ˮ�ɻ�����ָһ���������λ�������ĸ�λ���ֵ�����������������ȡ�
		int a,b,c;
		for (int s = 100; s < 1000; s++) {
			a=s/100%10;
			b=s/10%10;
			c=s/1%10;
			if (a*a*a+b*b*b+c*c*c ==s) {
				System.out.println(s);
			}
		}
		
		
		//��Ԫ�׼����⣬����
		
		
		//���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬������񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		//�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
		int x = 1;
		for(int i=9;i>=1;i--){
			x=2*(x+1);
		}
		System.out.println(x);
		
		
		//��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
		//�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
		//20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
		//60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
		//�ڳ������趨һ������Ϊ����������Ӧ���Ž���������
		System.out.println("�����뵱��������Ԫ����");
		Scanner sc1 = new Scanner(System.in);
		double y = sc1.nextDouble();
		if(y<0){
			System.out.println("�����������������루ʣ�����0��");
			y = sc1.nextDouble();
			if (y<0) {
				System.out.println("Ƶ�������������");
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
		System.out.println("Ӧ������Ϊ��"+bon);
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뵱��������Ԫ����");
		double profit = scanner.nextDouble();
		double royalties = 0;
		int profit1;
		while(true){
			profit1 = (int)profit/10;
			switch (profit1) {
			// >=0 <100��
			case 0:
				royalties = profit * 0.1;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
				break;
			case 1:
				royalties = 1 + (profit - 10)* 0.075;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
				break;
			case 2:
			case 3:
				royalties = 1.75 + (profit - 20)* 0.05;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
				break;
			case 4:
			case 5:
				royalties = 2.75 + (profit - 40)* 0.03;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				royalties = 3.35 + (profit - 60)* 0.015;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
				break;
			}
			
			//����100��Ԫ
			if (profit1 >= 10) {
				royalties = 3.95+ (profit - 100)* 0.01;
				System.out.println("\nӦ�ý���"+royalties*10000+"Ԫ");
			}

			System.out.println("\n�Ƿ�����������밴-1 ���������������ֵ");
			int select = scanner.nextInt();
			if (select == -1) {
				System.out.println("�������У�");
				break;
			}else{
				profit = select;
			}
			
		}
		
		
		//������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321��
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
