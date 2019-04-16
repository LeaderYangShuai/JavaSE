package thinking.exhaust;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Exhaust
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-27 08:16
 */
public class Exhaust {
    public static void main(String[] args) {

        exhaustive(40,90);
        System.out.println();
    }

    public static void exhaustive(int head,int foot){
        int chicken,rabbit;
        for(chicken=0;chicken<= head;chicken++){
            rabbit=head-chicken;
            if(chicken*2+rabbit*4 == foot){
                System.out.println(String.format("鸡有 %d只，兔子有%d只", chicken,rabbit));
            }
        }
    }
}
