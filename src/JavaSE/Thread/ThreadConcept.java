package JavaSE.Thread;

public class ThreadConcept extends Thread{

	int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread= new ThreadConcept();
		thread.start();

	}
		 public void run(){
			 System.out.println(ThreadConcept.interrupted());
				while (!ThreadConcept.interrupted()){
					try{
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("nihao"+count+currentThread().getName());
					count++;
					if (count>10) {
//						System.out.println(currentThread().interrupted());
						currentThread().interrupt();
//						System.out.println(currentThread().interrupted());
//						System.out.println(currentThread().isInterrupted());
					}
					
			
						
				}

	}  

}
