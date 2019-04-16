package strings;

import java.util.Scanner;
import java.util.Stack;
public class SymbolMatch {
    private Stack<String> stack;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strings = "";
        String say = "请输入字符串";
        System.out.println(say);
        while (!("q".equals(strings)) || !("exit".equals(strings))) {
            strings = scanner.nextLine().trim();
            if (strings.equals("q") || ("exit".equals(strings))) {
                System.out.println("退出");
                break;
            }
            if (new SymbolMatch().matches(strings)) {
                System.out.println("匹配成功");
            } else {
                System.out.println("没有成功");
            }
            System.out.println(say);
        }

    }

    public SymbolMatch() {
        stack = new Stack<String>();
    }
    public  boolean matches(String string ){
        boolean b =true;
        String []s = string.split("");
        for(int i = 0;i<s.length;i++){
            if(s[i].equals("(") || s[i].equals("[") || s[i].equals("{")){
                stack.push(s[i]);
            }else{
                if(stack.empty())
                    return false;
                String s1 = stack.pop();
                if(s1.equals("(") && !s[i].equals(")")){
                    return false;
                }else if(s1.equals("[") && !s[i].equals("]")){
                    return false;
                }else if(s1.equals("{") && !s[i].equals("}")){
                    return false;
                }
            }
        }
        if(stack.empty())
        return true;
        else return false;
    }
}
