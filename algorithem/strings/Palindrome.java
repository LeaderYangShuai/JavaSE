package strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Palindrome
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-06 10:55
 */
public class Palindrome {
    private  String string;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s ="";
        String say = "请输入回文串";
        System.out.print(say);
        while (!("q".equals(s)) ||!("exit".equals(s)) ){
            s = scanner.nextLine().trim();
            if (s.equals("q") ||("exit".equals(s))){
                System.out.println("退出");
                break;
            }
            if(pdString(s)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            System.out.println(say);
        }

    }

    public static boolean pdString(String s){
        boolean b = true;
        char [] chs = s.toCharArray();
        char [] chTemp=new char[chs.length];

        for (int i = 0,j = chs.length-1;i<chs.length;i++,j--){
           // s1=s1+chs[i];
            chTemp[j]=chs[i];
        }
        String s1=new String(chs);
        String s2=new String(chTemp);
//        for (char ch:chTemp) {
//            s2=s2+ch;
//        }
        System.out.println(Arrays.toString(chs));
        System.out.println(Arrays.toString(chTemp));
        System.out.println(s1);
        System.out.println(s2);
        if(!s1.equals(s2))b=false;
        return b;
    }


}
