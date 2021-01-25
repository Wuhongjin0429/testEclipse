package com.neuedu.part06;
		//定义一个矩形类Rectangle： a) 定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。 
		//b) 有2个属性：长length、宽width 
		//c) 通过构造方法Rectangle(int width, int length)，分别给两个属性赋值 
		//d) 创建一个Rectangle对象，并输出相关信息
public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	
	public int getArea(){
		return width*height;
	}
	
	public int getPer(){
		return(width+height)*2;
	}
	
	public void showAll(){
		System.out.println("长："+height);
		System.out.println("宽："+width);
		System.out.println("周长："+this.getPer());
		System.out.println("面积："+this.getArea());
	}
	
	
	public static void main(String[] args){
		Rectangle rec = new Rectangle(2, 3);
		rec.showAll();
	}

}
