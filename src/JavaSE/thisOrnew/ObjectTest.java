package JavaSE.thisOrnew;


public class ObjectTest {
	
				private  int a;
	
				public static void main(String[] args) {
					ObjectTest objectTest = new ObjectTest();
					ObjectTest objectTest2 = new ObjectTest();
					System.out.println(objectTest.equals(objectTest2));
					System.out.println(objectTest.hashCode()==objectTest2.hashCode());
					
				}

				public ObjectTest(int a) {
					super();
					this.a = a;
				}
//new Object();
				public ObjectTest() {
				}



				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					ObjectTest other = (ObjectTest) obj;
					if (a != other.a)
						return false;
					return true;
				}

			

	
				
}