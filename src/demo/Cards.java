package demo;

import java.util.Random;

//作业：创建一个扑克牌类（花色和值），不算大小王 
//1.放数组中52张牌 
//2.洗牌乱序 
//3.判断洗牌后的前三张是否是同花顺 
//4.求第一次出现同花顺时，一共洗了多少次牌
public class Cards {
	
	String color;
    String num;
    
	public void poker(String color, String num){
        this.color = color;
        this.num = num;
    }

	    
	    

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color ={"黑桃","红桃","方块","梅花"};
		String[] num ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//String pokers=new String();
		//Random rand;
		
		for(int i=0;i < color.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(color[i]+num[j]+"\t");
            }
        }
        int[] arr = new int[52];
		Random x = new Random();
		for(int i=0;i<num.length;i++){
			System.out.println(arr[i]);
		}*/
	

	public static void main(String[] args) {
		int N=52;
		int[] cards=new int[N];
		for(int i=0;i<N;i++){
			cards[i]=i+1;
		}
		
		for(int i=0;i<N;i++){
			int id=(int)(Math.random()*(N-1));
			int card;
			
			card=cards[id];
			cards[id]=cards[i];
			cards[i]=card;
		}
		
		for(int i=0;i<N;i++){
			switch((cards[i]-1)/13){
			case 0:
				System.out.print("黑桃");break;
			case 1:
				System.out.print("红心");break;
			case 2:
				System.out.print("梅花");break;
			case 3:
				System.out.print("方片");break;
			}
			
			int number=cards[i]%13;
			
			switch(number){
			case 0:
				System.out.print("K ");break;
			case 1:
				System.out.print("A ");break;
			case 12:
				System.out.print("Q ");break;
			case 11:
				System.out.print("J ");break;
			default:
				System.out.print(number+" ");break;
			}
			
			if((i+1)%13==0)System.out.println(" ");
		}
	}
		
		
}



