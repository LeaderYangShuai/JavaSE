package JavaSE.Iterable;

import java.util.ArrayList;

public class ArrayListTest {
	ArrayList arrayList = null;
	User user1 = new User();
	User user11 = new User();
	public static void main(String[] args) {
		ArrayListTest arrayListTest = new ArrayListTest();
		arrayListTest.addStudents();
//		arrayListTest.getStudents();
	
		if (arrayListTest.queryStudents()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	

		
	}
	
	public void addStudents() {
		arrayList = new ArrayList();
		Students [] students=new Students[10];
		for(int i = 0;i<10;i++){
			 students[i] = new Students();
			 students[i].setName(i+"name");
			 students[i].setId(i+"id");
			 arrayList.add(students[i]);
			
		}

		arrayList.add(user1);
		 arrayList.remove(user1);
		
	}

	public void  getStudents() {
		
		for(int i = 0;i<arrayList.size();i++) {
			Students  ss = (Students) arrayList.get(i);
			System.out.println(ss.getId()+"  "+ss.getName());
		}
	}
	
	public boolean  queryStudents( ){
		
//		for(int i = 0;i<arrayList.size();i++) {
//			Students  ss = arrayList.get(i);
//			if (ss.getId().equals(id)) {
//				return true;
//			}
//		}
//		return false;
		
		if (arrayList.contains(user1)) {
			return true;
		}else {
			return false;
		}
	}
	

}
