package JavaSE.Iterable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableTest {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students   xm = new Students();
		xm.setId(3+"");
		HashMap  hashMap;
		Hashtable  hashtable = new Hashtable();
		hashtable.put(5, xm);
		hashtable.put(2, xm);
		
//		Iterator iterator =hashtable.values().iterator();
//		while(iterator.hasNext()) {
//			Students students = (Students) iterator.next();
//			System.out.println(students);
//		}
		
//		Iterator iterator =hashtable.entrySet().iterator();
//		while(iterator.hasNext()) {
//			Entry  map= (Entry) iterator.next();
//			System.out.print(map.getKey()+"=");
//			System.out.println(((Students)map.getValue()).getName());
//		}

		
//		Iterator iterator =hashtable.keySet().iterator();
//		while(iterator.hasNext()) {
//
//			Students s = (Students) hashtable.get(iterator.next());
//			System.out.println(s.getId());
//		}

		Enumeration enumeration =hashtable.keys();
		while(enumeration.hasMoreElements()) {

			Students s = (Students) hashtable.get(enumeration.nextElement());
			System.out.println(s.getId());
		}
	}

}
