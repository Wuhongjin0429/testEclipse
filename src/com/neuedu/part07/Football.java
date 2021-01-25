package com.neuedu.part07;

//创建一个只能有11个对象的足球队的类，并验证它
public class Football {
	
	public static void main(String[] args) {
		while(true){
			Ball creatNewPlayer = Ball.creatNewPlayer();
			
			if(creatNewPlayer==null){
				break;
			}
		}
	}
}

class Ball{
	
	private static int count=0;
	private static int num=11;
	
	private Ball(){
		count++;
	}
	
	public static Ball creatNewPlayer(){
		if(count<num){
			return new Ball();
		}else{
			return null;
		}
	}
}
