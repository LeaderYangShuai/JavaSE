package thread_Excutors;

import utils.SqlHelper;

/**
 * @ProjectName: javaSe_review
 * @ClassName: Tradion_Thread
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 13:13
 */
public class Tradion_Thread {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {

            String sqlEnd = "select max(id) from user";

            String sqlSum = "select id from user";

            @Override
            public void run() {
                synchronized (SqlHelper.class){
                    while (SqlHelper.countSum(sqlSum)>1){
                        String sql = "delete from user where id ="+SqlHelper.endMax(sqlEnd)+"";
                        SqlHelper.delete(sql);
                        try {
                            //System.out.println(SqlHelper.countSum(sqlEnd));
                            Thread.sleep(1000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread.start();
    }
}


