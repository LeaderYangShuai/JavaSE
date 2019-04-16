package strings.StringNorepeat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    private String str;
    private List<String> noReapted;//带有String类型的TreeSet泛型
         
     public Test1() {
        Scanner in = new Scanner(System.in);
         
        System.out.println ("输入一个字符串:");
        str = in.nextLine();
         
        noReapted = new ArrayList<String>();
    }
     
    //清楚重复的数据
    public void removeRepeated(){
        for (int i = 0; i < str.length(); i++){
            noReapted.add(""+str.charAt(i));
            //str.charAt(i)返回的是char型  所以先加一个""空格 , 转换成String型
            //TreeSet泛型能保证重复的不加入 , 而且有序
        }
         
        str = "";
         
        for(String index:noReapted){
            str += index;
        }
         
        //输出
        System.out.println (str);
    }
     
    public static void main(String[] args) {
        Test1 dr = new Test1();
         
        dr.removeRepeated();
    }
}