package com.neuedu.part03;

import java.util.Scanner;

/**
 * ѭ��
 * 1.while(���ʽ){�����} ������ʽ���Ϊ�棬��ִ�д���顣 ��������ʽ����ʱ��ѭ��ֹͣ��
 * 
 * 2.do...while     do{�����}while(���ʽ) ��ִ��һ�δ���飬Ȼ�������ʽ��������ʽ���Ϊ�棬���ٴ�ִ�д���顣 ��������ʽ����ʱ��ѭ��ֹͣ��
 * 
 * 3.for(���ʽ1;���ʽ2;���ʽ3){�����}  ���ʽ1����ʼ��������ִֻ��һ�Ρ�
 *                                 ���ʽ2��ѭ���ж����������Ϊ�����͡�
 *                                 ���ʽ3�������仯��
 * ���ʽ���Բ�д���ֺű���д��
 * ѭ���ǿ���Ƕ�׵ġ�
 * 
 * 4.ѭ�����ж�
 * break�ؼ��ֿ����ж�,�жϵ�ǰѭ��
 * continue�ؼ���  continue���ֻ��������ѭ��
 * 
 * debug �ȼӶϵ㣬F6ִ�д��룬F8������ǰ�ϵ�
 * ѡ����Ҫ��ʽ���Ĵ��룺Ctrl+Shift+F
 *
 */
public class TestPart303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		//��ѭ��  ��Զ����ֹͣ��ѭ��
		while(a>b){
			System.out.println("ִ����ѭ��");
		}
		//do...while ѭ�� ��Ĭ����ִ��һ�� ��ȥУ���������
		//ʹ�ó�������
		do {
			System.out.println("ִ����ѭ��");
		} while (a>b);
		
		
		//���1��100�ĺ�
		int i = 1;
		int sum = 0;
		while(i<=100){//ʲôʱ��ֹͣѭ��
			sum += i;//sum = sum +i;
			i++;
		}
		System.out.println(sum);
		
		
		sum = 0;
		i = 1;
		do{
			sum += i;//sum = sum +i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		
		//���1-1000��������
		int j = 1;
		int sums = 0;
		while(j<=1000){
			//�ж� ����
			if(j%2!=0){
				sums += j;
			}
			j++;
		}
		System.out.println("1-1000��������="+sums);
		
		
		sums=0;
		for(int k=1;k<=1000;k++){//���ʽ����ʡ��
			if(k%2!=0){
				sums += k;
			}
		}
		System.out.println("1-1000��������="+sums);
		
		
		//���5��7�е�*��
		for(int o=1;o<=5;o++){
			System.out.println("*******");
		}
		
		
		//ѭ�����ж�
		//�ж�һ�����Ƿ�Ϊ������������
		int num = 101;
		for(int g=2;g<num;g++){
			if (num%g == 0) {
				System.out.println("��������");
				break;
			}
		}
		System.out.println("������");
		
		
		//һ���� 3�� ÿ��4%�����ʣ������� ����֮��Ϣһ������
		double money = 100;
		for(int g=1;g<=3;g++){
			money *= (1+0.04);
		}
		System.out.println(money);
		
		
		//���5��7�е�*��
		for(int h=1;h<=5;h++){
			for(int f=1;f<=7;f++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
		
		
		//���1 + 1/2 + 1/3 + 1/4 +...+ 1/100�ĺ�
		//5.187377517639621
		double sumd = 0;
		for(double u=1;u<=100;u++){
			sumd +=(1/u);
		}
		System.out.println(sumd);
		
		
		//����žų˷���
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++){
				System.out.print(x+"*"+y+"="+(x*y)+'\t');
			}
			System.out.println();
		}
		
		
		//1+2+3+4...�ж��ۼӶ��ٴ��ܳ���666
		//ѭ������ֹ���жϣ�
		//break;
		sum=0;
		int count = 0;//����
		i = 1;//��ֵ
		while(true){
			count++;
			sum +=i;
			i++;
			if(sum>666){
				break;
			}
		}
		System.out.println(count);
		
		
		//��дһ�������ҳ�����200����С��������
		//��Ƿ�
		i = 200;
		boolean flag;
		while(true){
			flag = true;//��ǳ�ʼ��
			i++;
			for(int g=2;g<i;g++){
				if (i%g == 0) {
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(i+"������");
				break;
			}
			
		}
		
		
		//continue ��������ѭ��
		for(int g = 1;g < 20;g++){
			   if((g % 2) == 0){
				continue;
			   }
			System.out.print(g + " ");
		}
		
		
		//ָ��ѭ��λ������     ��Ŀ��λ�ô������ƣ�lable����ʶ����ð�ţ��������ؼ��ֺ�ӱ�ʶ������
		inner:for(int g = 1;g < 20;g++){
			   if((g % 2) == 0){
				continue inner ;
			   }
			System.out.print(g + " ");
		}
		
		
		//break lable ��ָ��ѭ����ֹ
		//continue lable ��ָ��ѭ����ʼ
		outer: for (int u = 0;u < 10; u++) {
            System.out.println("���ѭ��");
            inner: while (true) {
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                System.out.println("�ڲ�ѭ��:" + s);
                if (s.equals("hello"))
                    break inner;
                if (s.equals("kitty"))
                    break outer;
            }
        }
		
		
		//��չ���������ģʽ�е�   ����ģʽ���else if ��������


	}

}
