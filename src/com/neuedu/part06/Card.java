package com.neuedu.part06;

public class Card {
	
	//作业：创建一个扑克牌类（花色和值），不算大小王 
	//1.放数组中52张牌 
	//2.洗牌乱序 
	//3.判断洗牌后的前三张是否是同花顺 
	//4.求第一次出现同花顺时，一共洗了多少次牌
	
	
	String color;//花色
    String num;//值
    int count;
    
    public Card(String color, String num, int count){
        this.color = color;
        this.num = num;
        this.count = count;
    }

}
