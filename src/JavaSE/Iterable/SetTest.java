package JavaSE.Iterable;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		Students students  = new Students();
		
		set.add(students);
		set.add(students);
		System.out.println("Set的大小是"+set.size());
	}

}
