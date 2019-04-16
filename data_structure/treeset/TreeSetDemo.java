package treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ProjectName: javaSe_review
 * @ClassName: TreeSetDemo
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-15 16:46
 */
public class TreeSetDemo {
    private TreeSet<Integer> treeSet;
    public static void main(String[] args) {
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.printTreeSet();
    }
    public TreeSetDemo(){
        treeSet = new TreeSet<Integer>();
    }
    public void printTreeSet(){
        treeSet.add(23);
        treeSet.add(45);
        treeSet.add(25);
        Iterator<Integer> iterator = treeSet.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }

        System.out.println(treeSet);
        while (!treeSet.isEmpty()){
            System.out.println(treeSet.pollFirst());
        }
      //
    }
}
