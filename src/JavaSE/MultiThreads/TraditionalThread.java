package JavaSE.MultiThreads;

public class TraditionalThread {

	public static void main(String[] args) {
		// 创建了一个线程（执行线索）
		//	Thread thread = new Thread();
		
		//下面这条语句并不是重写Thread类，而是写了一个Thread的子类，
		//子类和Thread一样，但是可以重写父类中的一些方法
		Thread thread = new Thread() {
			@Override
			public void run() {
					while (true) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("得到当前这个线程的名字 1:"+Thread.currentThread().getName());
							//这个this表示的是什么？this表示的是当前对象的引用，当前对象是什么？
							//当前对象就是run()方法所在的类的实例的引用，也就是就是new Thread()这个子类
							System.out.println("得到当前这个线程的名字 2:"+this.getName());
					}
			}
		};
		//让这个线程开始执行，执行什么呢？就是去执行Thread中的run()方法
		thread.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("得到当前这个线程的名字 3:"+Thread.currentThread().getName());
					//在这个地方不能用this，因为this表示当前对像的引用，
					//在这个地方就是Runnable对象，Runnable对象不是线程，是线程要运行的代码的宿主
					//所以会报错
					//System.out.println("得到当前这个线程的名字 2:"+this.getName());
			}
			}
			
		}
		);
		thread2.start();
	
		
		//在这个例子中，new Thread().start();会去找new Thread中的run（）方法，
		//如果找不到，就会去找runnable中的run（）方法
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("得到当前这个runnable线程的名字 6:"+Thread.currentThread().getName());
					//System.out.println("得到当前这个线程的名字 5:"+this.getName());
				}
				
			}
		}) {
			public void run() {
							while (true) {
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								System.out.println("得到当前这个线程的名字 4:"+Thread.currentThread().getName());
								System.out.println("得到当前这个线程的名字 5:"+this.getName());
							}
			};
	}.start();
		

	}

}
