package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ProjectName: javaSe_review
 * @ClassName: QueueDemo
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-15 15:51
 */
public class QueueDemo {
    private Queue<Integer> queue;
    public static void main(String[] args) {

        QueueDemo queueDemo = new QueueDemo();
        queueDemo.printQueue2();

    }
    public QueueDemo(){
        queue = new LinkedList<Integer>();
    }
    public void printQueue1(){
        queue.offer(1);
        queue.offer(13);
        queue.offer(14);
        while (!queue.isEmpty()){
           System.out.print(queue.poll()+"   ");
        }
    }
    public void printQueue2(){
        queue.add(5);
        queue.add(6);
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        while (!queue.isEmpty()){
//            System.out.print(queue.poll()+"   ");
//            //System.out.println(queue.peek());
//        }
    }
}
