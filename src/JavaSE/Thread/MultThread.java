package JavaSE.Thread;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultThread   extends Thread{

	
	private static  int result=200;
	Object o = new ArrayList();
	
	public static void main(String[] args)  {
		

		MultThread multThread1= new MultThread();
		MultThread multThread2= new MultThread();
		MultThread multThread3= new MultThread();
		
		multThread1.start();

	//	multThread1.yield();

		multThread2.start();
		//multThread2.yield();

		multThread3.start();
		//multThread2.yield();
//							try {
//								System.out.println("你好");
//						Thread.currentThread().sleep(1);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
		
		ExecutorService executorService  = Executors.newCachedThreadPool();
//		executorService.execute(new MultThread());
//		executorService.execute(new MultThread());
//		executorService.execute(new MultThread());
		//下面这个是单例模式，也就是这个线程池里边只有一个线程，只有当这个线程执行完毕之后才能执行下一个线程
//		ExecutorService executorService  = Executors.newSingleThreadExecutor();
//		executorService.execute(new MultThread());
//		executorService.execute(new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				while(j>0) {
//					try {
//						Thread.sleep(200);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				   System.out.println("我很好"+currentThread().getName()+j);
//					j--;
//		}
//				
//			}
//		}));



	}
	@Override
	public   void run() {

		// TODO Auto-generated method stub
			while(result>0) {

			    synchronized(Object.class){
//					try {
//						Thread.sleep(2);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}

					try {
						Thread.currentThread().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("我很好"+currentThread().getName()+result);
					try {
						Thread.currentThread().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					result--;
			   }
			}
	}
	}


//class   RunnableTest  implements Runnable {
//	
//	private  MultThread m = new MultThread();
//	public void run() {
//		while(true) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("nihao");
//		}
//		
//	}
//}
