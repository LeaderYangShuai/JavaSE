package strings.StringNorepeat;

public class Test2 {
 
    public static void main(String[] args) {
    	String s1 = "我很好很好很好";
        String s2 = "我说你是傻逼傻逼傻逼我的大傻逼";
        System.out.println(removeDuplicate2(s1));
        System.out.println(removeDuplicate2(s2));

    }
    public static String removeDuplicate2(String s) {
        int len = s.length();
        char [] ss = s.toCharArray();
        if(len < 2) 
            return s;
        String str = "";
        for(int i=0; i<len; ++i)
        {
            if(ss[i] != ' ')
            {
                str += ss[i];
                for(int j=i+1; j<len; ++j)
                {
                    if(ss[j]==ss[i])
                    {
                        ss[j] = ' ';
                    }                                            
                }
            }
        }
        return str;
    }
}