package strings.StringNorepeat;

import java.util.ArrayList;
import java.util.List;
 
public class Test3 {
 
    public static void main(String[] args) {
        String str = "教练大123教练裁判裁判裁判运动员运动员";
 
        List<String> data1= new ArrayList<String>();
        List<String> data2 = new ArrayList<String>();
 
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
         //   System.out.println(i+s);
            if (!data1.contains(s)) {
                data1.add(s);
            }else if (!(str.substring(i, i+1)).equals((str.substring(i-1, i)))) {
            	  data1.add(s);
            	  for (String ss : data2) {
            		  data2.add(ss);
                  }
            	 
            	  data1.clear();
            	  
			}
        }
 
        String result = "";
        for (String s : data2) {
            result += s;
        }
        System.out.println(result);
    }
}