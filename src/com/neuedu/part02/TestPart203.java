package com.neuedu.part02;

import java.util.Scanner;

public class TestPart203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	//��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a = 1,b = 2;
	    int c = a;
	    a = b;
	    b = c;
	    System.out.println(a);
	    System.out.println(b);
	    
	    //����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
	    System.out.println("������һ��1~1000��������");
        Scanner sca = new Scanner(System.in);
        int h = sca.nextInt();
        int z, j, k, l, sum;
        l = h / 1000;
        z = h / 100 % 10;
        j = h  / 10 % 10;
        k = h % 10;
        sum = z +j +k +l;
        System.out.println("���Ϊ" + sum);

	    
	    //�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
	    double e;
	    double f;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("���뻪�϶�");
	    e = sc.nextDouble();
	    f = (e-32)*5/9;
	    System.out.println("ת��Ϊ���϶�Ϊ��"+f);
	    
	    //����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
	    char o = 'A';
	    int i = o;
	    System.out.println((char)(o+32));


	}

}
