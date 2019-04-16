package JavaSE.thisOrnew;

public class ThisOrNew {

	@Override
	public String toString() {
		return "ThisOrNew [nameObject()=" + nameObject() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisOrNew thisOrNew1  = new ThisOrNew();
		ThisOrNew thisOrNew2  = new ThisOrNew();
		ThisOrNew thisOrNew3  = new ThisOrNew();
		ThisOrNew thisOrNew4  = new ThisOrNew();

		//这里充分说明了this是指的是任意的当前对象，也就是说谁调用的它，他就是谁
		System.out.println(thisOrNew1.nameObject());
		System.out.println(thisOrNew2.nameObject());
		System.out.println(thisOrNew3.nameObject());
		System.out.println(thisOrNew4.nameObject());
		System.out.println(thisOrNew1.nameObject());
		thisOrNew1.toString();
		
	}
	
	public  ThisOrNew   nameObject() {
		return this;
	}

}
