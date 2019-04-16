package thinking.backtracking;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Queen8
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-09-21 20:04
 */

/**
 * 八皇后问题，是一个古老而著名的问题，是回溯算法的典型案例。
 * 该问题是国际西洋棋棋手马克斯·贝瑟尔于1848年提出：
 * 在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，
 * 即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
 * 高斯认为有76种方案。1854年在柏林的象棋杂志上不同的作者发表了40种不同的解，
 * 后来有人用图论的方法解出92种结果。计算机发明后，有多种计算机语言可以解决此问题。
 */
public class Queen8 {
    public static int num = 0; //累计方案总数
    public static final int MAXQUEEN = 8;//皇后个数，同时也是棋盘行列总数
    public static int[] cols = new int[MAXQUEEN]; //定义cols数组，表示8列棋子摆放情况

    public static void main(String args[]){
        Queen8 queen = new Queen8();
    }

    public Queen8() {
        //核心函数
        getArrangement(0);
        System.out.println(MAXQUEEN+"皇后问题有"+num+"种摆放方法。");
    }

    public void  getArrangement(int n){
        //遍历该列所有不合法的行，并用rows数组记录，不合法即rows[i]=true
        boolean[] rows = new boolean[MAXQUEEN];
        for(int i=0;i<n;i++){
            rows[cols[i]]=true;
            int d = n-i;
            if(cols[i]-d >= 0)rows[cols[i]-d]=true;
            if(cols[i]+d <= MAXQUEEN-1)rows[cols[i]+d]=true;

        }
        for(int i=0;i<MAXQUEEN;i++){
            //判断该行是否合法
            if(rows[i])continue;
            //设置当前列合法棋子所在行数
            cols[n] = i;
            //当前列不为最后一列时
            if(n<MAXQUEEN-1){
                getArrangement(n+1);
            }else{

                //累计方案个数
                num++;
                //打印棋盘信息
                printChessBoard();
            }


        }

    }
    public void printChessBoard() {

        System.out.println("第" + num + "种走法");

        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++) {
                if (i == cols[j]) {
                    System.out.print("# ");
                } else
                    System.out.print("- ");
            }
            System.out.println();
        }

    }

}
