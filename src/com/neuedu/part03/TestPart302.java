package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch �����ж�
 * ���ṹ  switch(���ʽ){���ʽ���ΪԤ��ֵ
 *                   case ֵ:
 *                       �����;
 *                       [break;] ��д�ɲ�д   ������ִ�е���ֹͣ
 *                   case ֵ:
 *                       �����;
 *                       [break;] ��д�ɲ�д   ������ִ�е���ֹͣ
 *                   case ֵ:
 *                       �����;
 *                       [break;] ��д�ɲ�д   ������ִ�е���ֹͣ
 *                    ������
 *                   default:
 *                       �����;   
 *                  }
 * ע����� 1.���ʽ��ֵ����Ϊ byte��short��char��int��string
 *        2.case �����ֵ����Ϊ��������ֵ���Ҳ����ظ�
 *        3.���ܴ���鲿�ֿ���Ϊ����
 *        4.default �൱�� if else �е�else
 * ���������ɱ�������̶�ֵ   �ڶ������ʱǰ�����final
 *
 */


public class TestPart302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		switch("1"){
		case "1":
			System.out.println(1);
		case "2":
			//����2���߼���ͣ����
			System.out.println(2);
			break;
		default:
			System.out.println("����Ĭ��ֵ");
		}
		
		//����̨����һ���ɼ�������óɼ��ĵȼ���90-100���ţ�80-89������70-79���еȣ�60-69�Ǽ���60�����ǲ�����
		//��switchд
		int score = 100;
		switch(score/10){
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("�е�");
			break;
		case 6:
			System.out.println("����");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		}
		
		//����һ����ݣ��ж��Ƿ�������
		//1.�ܱ�4�����������ܱ�100����
		//2.�ܱ�400����
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year%4==0 && year%100!=0){
			System.out.println("������");
		}else if(year%400==0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
		
		//����һ���·ݣ�����ڴ��·�������ͬ���·ݣ���switchд��
		//1��3��5��7��8��10��12 ����31��
		//4��6��9��11 ����30��
		//2 ����29��
		System.out.println("�������·�");
		int month =scanner.nextInt();
		switch(month){
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println("1��3��5��7��8��10��12 ����31��");
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println("4��6��9��11 ����30��");
		    	break;
		    case 2:
		    	if(year%4==0 && year%100!=0){
					System.out.println("��29��");
				}else if(year%400==0){
					System.out.println("��29��");
				}else{
					System.out.println("��28��");
				}
		    	break;
		
		}
		
		
	}

}
