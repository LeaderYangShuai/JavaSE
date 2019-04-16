package JavaSE.init;

public class InitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(User.i);
	}

}

class  Person{
	 static  {
		System.out.println("Hello,nihao");
	}
	 public  static int i =1;
}
class User  extends Person{
	
	static {
	System.out.println("User");
	}
}

