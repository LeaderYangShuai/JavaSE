package JavaSE.AbstrctOrInterface;

public  class AbstractClass  extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person= new AbstractClass() ;
		person.speak();
		person.walk();
	}


	public void name() {
		System.out.println("我的名字是抽象类");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("我用抽象语言说话");
	}
}

abstract class Person{
	
	public void walk() {
		System.out.println("我在走路");
	}
	public abstract  void speak() ;
}