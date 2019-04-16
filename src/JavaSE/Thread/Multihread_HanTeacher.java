package JavaSE.Thread;

public class Multihread_HanTeacher {
    public static void main(String[] args) {
        TicketWindow window = new TicketWindow();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);
        t1.start();
        t2.start();
        t3.start();
        

    }
}
class TicketWindow implements Runnable{
    private     int nums = 200;
   //private   int nums = 200;

  //  String string="123" ;
   // new Object();
//    public  void  name() {
//    	int a =1;
//    }
    public void run() {
    //	TicketWindow yTicketWindow = new TicketWindow();


        while(true){
            //这段要保证原子性
      //      synchronized(string){                    System.out.println(Thread.currentThread().getName() + "正在销售第"+nums+"张票");
        	  synchronized(this){
                  System.out.println(this.toString());

                  if(this.nums > 0){

                    System.out.println(Thread.currentThread().getName() + "正在销售第"+nums+"张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
           //运算的情况下并不能保证原子性
                   this.nums = nums -1;
//                    for(int i = 0;i<nums;i++) {
//                    	System.out.println(i);
//                    }
           
                }else{
                    break;
                }
        	  }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 //       }
    }
}