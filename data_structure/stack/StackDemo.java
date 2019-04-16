package stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ProjectName: javaSe_review
 * @ClassName: StackDemo
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-15 16:32
 */
public class StackDemo {
    private Stack<Integer> stack;
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        stackDemo.printStack2();
    }

    public StackDemo(){
        stack = new Stack<Integer>();
    }
    public void  printStack1(){
        stack.push(1);
        stack.push(56);
        stack.push(23);
        while (!stack.empty()){
            System.out.print(stack.pop()+"   ");
        }
    }
    public void  printStack2(){
        stack.push(1);
        stack.push(56);
        stack.push(23);
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
