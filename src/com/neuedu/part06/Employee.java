package com.neuedu.part06;

/**
 * ������
 * 
 *
 */
public class Employee {
	
	//��д����
	//����Ĭ��ֵ
	String name;
	int age;
	double sal;
	
	//���췽��   ����Ҫд����ֵ����
	public Employee(){
		System.out.println("����Employee�޲εĹ��췽��");
	}
	public Employee(String _name,int _age,double _sal){//�в�
		name=_name;//this.name=name;
		age=_age;//this.age=age;
		sal=_sal;//this.sal=sal;
	}
	public Employee(String _name,int _age){//�в�
		name=_name;
		age=_age;
		sal=500;
	}
	
	//д��Ϊ��������
	//��ȡ����
	public String showName(){
		System.out.println("Ա������Ϊ��"+name);
		return name;
	}
	/**
	 * ��ȡ���
	 * @param Ϊ��
	 * @return age ���
	 */
	public int showAge(){
		System.out.println("Ա�����Ϊ��"+age);
		return age;
	}
	/**
	 * �޸�����
	 * @param _name Ԥ���޸ĵ�����
	 */
	public void updateName(String _name){
		name = _name;
	}
	/**
	 * ��ȡ����
	 * @return sal
	 */
	public double getSal(){
		System.out.println("The sal of this month is"+sal);
		return sal;
	}

}
