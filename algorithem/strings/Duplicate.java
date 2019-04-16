package strings;

import javax.swing.*;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Duplicate
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-06 11:43
 */
public class Duplicate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = "";
        String say = "请输入字符串";
        System.out.print(say);
        while (!("q".equals(s)) || !("exit".equals(s))) {
            s = scanner.nextLine().trim();
            if (s.equals("q") || ("exit".equals(s))) {
                System.out.println("退出");
                break;
            }
            System.out.println("去重后的字符串是："+removeDuplication(s));
            System.out.print(say);
        }
    }
    public static String removeDuplication(String string){
        char [] chs = string.toCharArray();
        char [] chars = new char[chs.length];

        for(int i = 0,j=0;i<chs.length;i++){
            if(i+1<chs.length) {
                if (chs[i] == chs[i + 1]) {

                } else {
                    chars[j] = chs[i];
                    j++;
                }
            }else{
                chars[j]=chs[chs.length-1];
            }
        }

//        String []s1 =string.split("");
//        String []s2 =new String[s1.length];
//        for(int i = 0,j=0;i<s1.length;i++,j++){
//            if(i+1<s1.length) {
//                if (s1[i].equals(s1[i + 1]) ) {
//
//                } else {
//                    s2[j] = s1[i];
//                }
//            }else{
//                s2[j]=s1[s1.length-1];
//            }
//
//        }
//
//        String str ="";
//        for(int k =0;k<s2.length;k++){
//            if(s2[k]!=null && s2[k]!="")
//            str=str+s2[k];
//        }
//        String str ="";
//        for(int k =0;k<chars.length;k++){
//            str=str+chars[k];
//        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            sb. append(chars[i]);
        }
        return sb.toString().trim();
    }
}
