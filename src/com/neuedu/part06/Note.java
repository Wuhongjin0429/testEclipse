package com.neuedu.part06;
		//����һ���ʼǱ��࣬��������ɫ��char����cpu�ͺţ�int���������ԡ� 
		//a) �޲κ��вε��������췽�����вι��췽�������ڴ��������ͬʱΪÿ�����Ը�ֵ�� 
		//b) ����ʼǱ���Ϣ�ķ��� 
		//c) Ȼ���дһ�������࣬���ԱʼǱ���ĸ���������
public class Note {
	
	char color;
	int cpu;
	
	public Note(){
		System.out.println();
	}
	
	public Note(char color,int cpu){
		this.color=color;
		this.cpu=cpu;
	}
	
	public void a(){
		System.out.println("��ɫ��"+color+"��"+"�ͺţ�"+cpu);
	}
	
	public static void main(String[] args){
		Note a = new Note('a', 9504);
		a.a();
	}

}
