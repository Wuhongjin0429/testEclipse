package com.neuedu.part06;
		//定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。 
		//a) 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值； 
		//b) 输出笔记本信息的方法 
		//c) 然后编写一个测试类，测试笔记本类的各个方法。
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
		System.out.println("颜色："+color+"，"+"型号："+cpu);
	}
	
	public static void main(String[] args){
		Note a = new Note('a', 9504);
		a.a();
	}

}
