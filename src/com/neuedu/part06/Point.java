package com.neuedu.part06;

		//����һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬2�����췽��Point()��Point(int x0,y0),
		//�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
		//��������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ

public class Point {
	int x;
	int y;
	
	public Point(){
		System.out.println("x");
		System.out.println("y");
	}
	public Point(int x0,int y0){
		this.x=x0;
		this.y=y0;
	}
	
	public void movePoint(int dx,int dy){
		x=x+dx;
		y=y+dy;
		System.out.println("�ƶ��������Ϊ��"+this.x+"��"+this.y);
	}

}
