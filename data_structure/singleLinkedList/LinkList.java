package singleLinkedList;

import javax.sound.midi.Soundbank;

/**
 * @ProjectName: JavaSE
 * @ClassName: LinkedList
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-24 10:50
 */
public class LinkList {
     class Node {
        //注：此处的两个成员变量权限不能为private，因为private的权限是仅对本类访问。
       private int data; //数据域
       private Node next;//指针域   next是对象的引用，指向的是一个对象的地址

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private int count;//记录总的节点的个数

    public  LinkList(){
        head = new Node();
        head.next = null;
        count = 0;
    }
    //方法：向链表中添加数据shiyong 头插入方法
    public void addHead(int data) {
         Node newNode = new Node();
         newNode.setData(data);
        //头插入方法
        newNode.next = head.next;
            //把链表的当前索引向后移动一位
        head.next= newNode;   //此步操作完成之后，current结点指向新添加的那个结点
        count++;
    }
    //方法：向链表中添加数据 尾插法
    public void addTail(int data) {
        Node p = head.next;
        if (p==null){
            Node newNode = new Node();
            newNode.setData(data);
            p= newNode;
            p.next=null;
            count++;
        }else{
            for (int i=0;i<count;i++){
                p = p.next;
            }
            Node newNode = new Node();
            newNode.setData(data);
            //把链表的当前索引向后移动一位
            p= newNode;   //此步操作完成之后，current结点指向新添加的那个结点
            p.next=null;
            count++;
        }

    }
    //方法：向链表中添加数据
    public void insert(int j,int data) {
        if (j>count){
            System.out.println("抛出异常");
            return;
        }
        int num = 0;
        Node p = head;
        while (p!=null && num<j-1){
            p = p.next;
            num++;
        }
        Node newNode = new Node();
        newNode.setData(data);
        //头插入方法
        newNode.next = p.next;
        //把链表的当前索引向后移动一位
        p.next= newNode;   //此步操作完成之后，current结点指向新添加的那个结点
        count++;
    }

    //方法：向链表中删除第j个位置的元素
    public void delete(int j) {
        if (j>count){
            System.out.println("删除错误");
            return;
        }
        int num = 0;
        Node p = head;
        while (p!=null && num<j-1){
            p = p.next;
            num++;
        }
        p.next = p.next.next;
        count--;
    }

    //方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
    public void print() {
        Node p1 = head.next;
      //  System.out.println(p1);
        while (p1 != null) {
            System.out.print(p1.data+"\t");
            p1 = p1.next;
        }
        //System.out.println("bianli");
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        //向LinkList中添加数据
        for (int i = 0; i < 10; i++) {
            linkList.addHead(i);
        }

        linkList.print();
        //在第5个位置插入34
        linkList.insert(5,34);
        System.out.println();
        linkList.print();
        //删除第7个元素
        linkList.delete(7);
        System.out.println();
        linkList.print();


//          Node node = new Node();
//        //求对象的地址，对象的引用本质上就是一个地址
//     //   System.out.println(System.identityHashCode(node));

    }

}