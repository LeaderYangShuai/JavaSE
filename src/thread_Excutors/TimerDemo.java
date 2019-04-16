package thread_Excutors;

import utils.SqlHelper;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ProjectName: javaSe_review
 * @ClassName: TimerDemo
 * @author: hongbing
 * @version: 1.0
 * @Date: 2018-10-20 12:02
 */
public class TimerDemo extends TimerTask {
    public static void main(String[] args) {

        TimerDemo timerDemo = new TimerDemo();
        Timer timer = new Timer();
        timer.schedule(timerDemo,1000,1000);
    }
    @Override
    public void run() {
        synchronized (SqlHelper.class){
            String sql="insert into user(username) values('hongbing')";
            SqlHelper.insert(sql);
        }

    }
}
