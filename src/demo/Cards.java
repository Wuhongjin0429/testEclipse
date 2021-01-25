package demo;

import java.util.Random;

//��ҵ������һ���˿����ࣨ��ɫ��ֵ���������С�� 
//1.��������52���� 
//2.ϴ������ 
//3.�ж�ϴ�ƺ��ǰ�����Ƿ���ͬ��˳ 
//4.���һ�γ���ͬ��˳ʱ��һ��ϴ�˶��ٴ���
public class Cards {
	
	String color;
    String num;
    
	public void poker(String color, String num){
        this.color = color;
        this.num = num;
    }

	    
	    

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color ={"����","����","����","÷��"};
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
				System.out.print("����");break;
			case 1:
				System.out.print("����");break;
			case 2:
				System.out.print("÷��");break;
			case 3:
				System.out.print("��Ƭ");break;
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



