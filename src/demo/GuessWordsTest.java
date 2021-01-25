package demo;
//猜单词游戏：
//*  自己定义一个单词数组，长度随意，比如8，然后存入8个单词。
//*  随机获取其中一个单词，开始猜测。
//*  控制台默认显示  -----(依据单词的长度而定)
//*  输入字符进行猜测，如果字符是单词内的，则替换-  ，比如显示为  --a--，否则提示字符不存在
//*  每个单词一共有5次错的机会，猜对则成功，否则失败。


import java.util.Random;
import java.util.Scanner;

public class GuessWordsTest {

	public static boolean isContaisChar(char[] array, char c){
        boolean bFind = false;
        for(int i = 0; i<array.length; i++){
            if(array[i] == c){
                bFind = true;
                break;
            }
        }
        return bFind;
    }

    public static void main(String[] args) {
	// write your code here
        //1.定义一个单词数组（字符串数组）
        String[] words = {"Mississippi"};
        
        //2.随机获取一个单词，随机一个下标(下标值在0到单词数组长度之间)
        Random random = new Random();
        int nRandomIndex = random.nextInt(words.length);
        String strWordChoose = words[nRandomIndex];
        
        //3.得到单词长度len，创建一个长度为len的字符数组word，数组元素初值均为-
        int nLen = strWordChoose.length();
        char[] wordShow = new char[nLen];
        for(int i = 0 ; i < nLen; i++){
            wordShow[i] = '-';
        }
        
        //4.循环以下步骤（退出循环的条件为，用户允许猜错的次数<=0或word字符中数组中不再包含-字符）
        int nGuessTimes = 5;

        while(nGuessTimes > 0 && isContaisChar(wordShow,'-')){
            //5.输出word到屏幕
            System.out.println(wordShow);
            
            //6.获取客户输入，判断随机选出的单词中是否包含用户输入的字符
            Scanner sc = new Scanner(System.in);
            String c = sc.nextLine();
            
            //7.若包含，得到字符在单词中出现的位置，并将该位置的字符替换成用户输入的字符，返回到4
            boolean bFind = false;
            for(int i = 0; i < wordShow.length; i++){
                if(strWordChoose.charAt(i) == c.toCharArray()[0]){
                    wordShow[i] = c.toCharArray()[0];
                    bFind = true;
                }
            }
            
            //8.若不包含，用户可以猜错的次数减一，返回到4
            if(!bFind){
                nGuessTimes--;
                System.out.println("您还有"+nGuessTimes+"次机会");
            }
        }

        //9.得出最后结论：判断用户允许猜错的次数是否大于0，如果大于0，输出用户胜利，否则输出用户失败
        if(nGuessTimes > 0){
            System.out.println("you win");
        }
        else{
            System.out.println("you lose");
        }
    }
}
