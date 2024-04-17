package com.abc;
import java.util.Arrays;
public class Manager2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B[] x = new B[2];
		x[0] = new B(90);
		x[1] = new B(910);
		B[] y = {new B(9), new B(80)};
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}

}
