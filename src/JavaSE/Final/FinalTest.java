package JavaSE.Final;

public class FinalTest {

	private static int count=0;
	//初始化的时候id的值以已经被给定了
	private final int id=++count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalTest finalTest = new FinalTest();
		FinalTest.count++;
		System.out.println("count="+count+"id="+finalTest.id);
		FinalTest.count++;
		System.out.println("count="+count+"id="+finalTest.id);
	}

}
