package JavaSE.instanceofTest;

public class Instanceof1 {

	int i =2;

	@Override
	public String toString() {
		return "Instanceof1 [i=" + i + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       HashMap  hashMap = new HashMap<>();
//       HashMap<String,String> 
		Instanceof1 instanceof1 = new Instanceof1();
		if (instanceof1 instanceof  Instanceof1) {
			System.out.println("true"+instanceof1);
		}
	}

}
