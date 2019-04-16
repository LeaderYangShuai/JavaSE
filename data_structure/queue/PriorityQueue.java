package queue;

import java.util.Queue;

/**
 * @ProjectName: javaSe_review
 * @ClassName: PriorityQueue
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-15 16:12
 *
 * 描述：优先队列采用的是最小堆的方式，也就是用完全二叉树的最小堆方式，每次取出最小的元素
 */
public class PriorityQueue {
    private Queue<Integer> priorityQueue;
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.printPriorityQueue();
    }
    public PriorityQueue(){
        priorityQueue = new java.util.PriorityQueue<Integer>();
    }
    public void printPriorityQueue(){
        priorityQueue.offer(41);
        priorityQueue.offer(5);
        priorityQueue.offer(9);
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+"    ");
        }
    }
}
