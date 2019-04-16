package JavaSE.String;

public class StrEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  strings1 = new String("abc");
		String  strings2 = new String("abc");
		if (strings1.equals(strings2)) {
			System.out.println("你好，内容是相同的");
		}
		
		if (strings1==strings2) {
			System.out.println("你好，正在测试");
		}else {
			System.out.println("你好，我是杨红兵");
		}
		
	}

}
