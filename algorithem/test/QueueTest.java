package test;

import java.util.Arrays;

/**
 * @ProjectName: JavaSE
 * @ClassName: QueueTest
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-11-03 11:24
 *
 * 浪费一个空间，用于循环队列
 */
public class QueueTest {
    private static int [] arr;
    int front;
    int rear;

    public static void main(String[] args) {
        QueueTest queueTest = new QueueTest();
        queueTest.offer( 12);
    }

    public QueueTest(){
        arr = new int[10];
        front= rear = 0;
    }
    public void  offer(int value){
        if ((rear+1)%arr.length!=front){
            arr[rear]=value;
            rear = (rear+1)%arr.length;
        }else{
            System.out.println("满了");
        }
    }

    public int poll(){
        if (rear!=front){
            int temp = arr[front];
            front = (front+1)%arr.length;
            return temp;
        }
       return -12;
    }
}
