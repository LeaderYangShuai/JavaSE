package sort.recursion;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Recursion
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-20 20:29
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("woshi ");
        algorithem(1,5);
        System.out.println("红兵");
    }
    static  void algorithem(int i, int j){
        if(i<j){
            System.out.print("你好");
            i++;
            System.out.println(i+j);

            algorithem(i,j);
            System.out.println("呵呵我还问你哈。你好呵"+i+" "+j);
        }
        System.out.println("呵呵呵"+i+" "+j+"讷讷");

    }
}



