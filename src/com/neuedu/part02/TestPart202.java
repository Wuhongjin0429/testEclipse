package com.neuedu.part02;

import java.util.Scanner;

/**
 * java�����
 * �����������
 *        +�� -�� *��/�� %ȡ�ࣨ������Ϊ����Ϊ����
 *        ++������ --�Լ��� ++����   �ȼӺ��ã� ����++ ���ú��
 *        
 * ��ֵ�������+=��-=
 * 
 * ��ϵ�������>��>=��<��<=��==��!=�������ڣ�        ��ϵ�������ǲ�����
 * 
 * �߼��������������������͵������еĲ�������
 *         && �߼���     ͬ�����棬�м����
 *         || �߼���     �������棬ͬ�����
 *         ! �߼���     �Խ��ȡ��
 *         �������ڶ�·���㣨&&�жϵ�һ�����ʽ��ֵ���Ϊfalse����ڶ�����ִ�У�||�жϵ�һ�����Ϊtrue���ڶ�����ִ�У�
 *         &��| ���ڷǶ�·����������
 * 
 * ��Ŀ�������������Ԫ���ʽ��
 * ������ʽ1Ϊ�棬��������ʽ2��������������ʽ3
 * ���ʽ1? ���ʽ2: ���ʽ3
 * 
 * 
 *
 */
public class TestPart202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(-5%-2);
		
		int i = 0;
		//��չ��i++ �Ƿ����̰߳�ȫ��
		System.out.println(i++ + ++i);//���ʽ���������Ҳ����Ӱ��
		System.out.println("��������ѧϰ�ַ�������"+(i+ ++i));
		
		
		int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++/*3*/ + x1*y1;/* 4*5 */
	    r2 = ++x2/*4*/ + x2*y2;/* 4*5 */
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
	    
	    System.out.println(5.0/2);
	    
	    x1 = x1 + 3;/* 4+3 */
	    x1 +=3;
	    System.out.println(x1);
	    
	    System.out.println(x1 != x2);
	    
	    boolean flag = true,flag1 = false;
	    System.out.println(flag & flag1);//false
	    System.out.println(flag | flag1);//true
	    System.out.println(flag ^ flag1);//true
	    
	    System.out.println(flag & flag1?3-1:4+1);
	    
	    //��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���

	    //����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����

	    //�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�

	    //����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("���������ݣ�");
	    String c = sc.nextLine();
	    System.out.println("�ɿ���̨�������Ϊ��"+c);

	}

}
