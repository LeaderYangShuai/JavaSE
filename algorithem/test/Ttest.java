package test;

public class Ttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 test1 = new Test1();
		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test1);
		thread1.start();
		thread2.start();
	}

}
class Test1 implements Runnable{
	private volatile int i =0;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+this.getI());
		this.setI(3);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+this.getI());
	}
}
