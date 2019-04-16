package JavaSE.arrays;

import java.util.Arrays;

public class DydficArrays {

	private int  [] [] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DydficArrays dydficArrays = new DydficArrays();
		System.out.println(Arrays.deepToString(dydficArrays.getArr()));
	}

	public DydficArrays() {
		arr=new int[2][];
		for(int i =0;i<2;i++) {
			for(int j= 0;j<3;j++) {
				arr[i][j]=i;
			}
		}
	}

	public int[][] getArr() {
		return arr;
	}

	public void setArr(int[][] arr) {
		this.arr = arr;
	}

}
