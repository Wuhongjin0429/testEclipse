package com.neuedu.part07;

//����һ��ֻ����11�����������ӵ��࣬����֤��
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
