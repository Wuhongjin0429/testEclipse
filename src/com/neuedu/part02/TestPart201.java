package com.neuedu.part02;
/**
 * JDK java��������
 * JRE java���л���
 * �����������
 * ��{}ȷ������飨����飩�����п���д�������ͣ�����������������������
 * 
 * 1.��ʶ��
 * ��ʶ����������ĸ�����֣���Ԫ���ţ��»������
 *         ����ĸ�����֣���Ԫ���ţ��»�����ɣ����������ֿ�ͷ
 *         �����ǹؼ��ֻ��߱�����
 *         �����пո�
 *         ����û�����ƣ����˹�����
 *
 * �淶��
 * ����ÿ�����ʵ�����ĸ��д��������ĸСд
 * ����ÿ�����ʶ�Сд
 * ��������һ�����ʵ�����ĸСд���������ʵ�����ĸ��д
 * �������ͷ�����һ��
 * ���������鶼��д
 * 
 * 2.�������ڳ������й�������ʱ���ܷ����仯��
 * ͬһ��������б����������ظ�
 * java���������ͷ�Ϊ�����ࣺ 1.�����������ͣ�
 *                            �ַ���      char �ɵ��������Σ�ֻ��д�����ַ���ռ��2���ֽ�
 *                                       ����дUnicode�ַ�
 *                                       ���õ��ַ�����  A 65
 *                                                 a 97
 *                                                 0 48
 *                                       ת���ַ�  \n ����
 *                                             \r �س�
 *                                             \t tab
 *                                             \b �˸�
 *                            ������      boolean ֻ����true ��false ����ֵ     ����Сд��Ĭ��ֵ��false
 *                            ��ֵ�ͣ�  ���ͣ�byte��short��int��long�� 1���ֽ���8������λ
 *                                  byte �ֽ���  1�ֽ�  -128~127
 *                                  short ������  2�ֽ�  -32768~32767
 *                                  int ����  4�ֽ�  -2147483648~2147483647
 *                                  long ������  8�ֽ�  ����ʱ��Ҫ�ں���Ӹ�L  8*8  64  64-1=63  -2^63~2^63-1
 *                            �����ͣ���float��double��
 *                                  float �����ȸ�����  4�ֽ�  ֵ��λ-3.403E38 ~ 3.403E38  ����ʱ��ֵ�ĺ����F
 *                                  double ˫���ȸ�����  8�ֽ�  -1.798E308 ~ 1.798E308
 *                    2.������������
 * 
 * 3.����ת����ǿ����ʾ����ת�����Զ���ʽ����ת��
 * ��С��Χ��ֵת������Χ��ʱ���Զ�ת
 * ����Χת����С��Χʱ��ǿ��ת
 * 
 * 
 */
public class TestPart201 {
	static boolean b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i = 127;//
		System.out.println(i);
		i = 1;
		System.out.println(i);
		short j = 32767;
		
		int k = 2147483647;
		
		long l = 2147483648L;
		
		/*
		 * ������  ����0����1      ��2��1      ��0B����
		 * �˽���  ��0��ͷ����
		 * ʮ������  ��0X��ͷ 1~9 A~F
		 */
		
		int er = 0B0001;
		//������ת��Ϊʮ���� ��Ȩ��
		//�Զ�ת��Ϊʮ����
		System.out.println(er);
		//�˽���תʮ����  ��Ȩ��
		//ʮ����ת�˽���  �̳�
		
		int eight = 0140;
		
		System.out.println(eight);
		
		//ʮ������
		int sixteen = 0X1F;
		System.out.println(sixteen);
		//�˽���ת���ɶ����ƣ�ÿλ��3λ��
		//ʮ������ת���ɶ����ƣ�ÿλ��4λ��
		
		float f = 10.91111111111f;
		System.out.println(f);
		double d = 10.01;
		System.out.println(d);
		//f = (float)d;
		l = (long)f;
		System.out.println("�������ǿת���L: "+l);
		
		System.out.println(Integer.toBinaryString(10));//ת��������
		System.out.println(Integer.toOctalString(16));//ת���˽���
		System.out.println(Integer.toHexString(100));//ת����ʮ������
		//�Զ���ȫ����ֵCtrl+1
		String hexString = Integer.toHexString(100);
		
		//������
		boolean bl = true;
		boolean bll = false;
		System.out.print(b);
		
		//�ַ���
		//ת���ַ�
		char c = '\\';
		char c1 = 'A';
		System.out.print(c);
		System.out.print(c1);
		System.out.print('\n');
		
		int ic1 = c1;//�Զ�ת������ʽת����
		int ic = c;
		char ca = (char)(ic1+32);//ǿ��ת������ʾת����
		System.out.println(ic1+32);
		System.out.println(ic);
		
		System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("\'���ڵ�������\'");
	    System.out.println("��û�е�����");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
