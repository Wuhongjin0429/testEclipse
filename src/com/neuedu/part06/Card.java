package com.neuedu.part06;

public class Card {
	
	//��ҵ������һ���˿����ࣨ��ɫ��ֵ���������С�� 
	//1.��������52���� 
	//2.ϴ������ 
	//3.�ж�ϴ�ƺ��ǰ�����Ƿ���ͬ��˳ 
	//4.���һ�γ���ͬ��˳ʱ��һ��ϴ�˶��ٴ���
	
	
	String color;//��ɫ
    String num;//ֵ
    int count;
    
    public Card(String color, String num, int count){
        this.color = color;
        this.num = num;
        this.count = count;
    }

}
