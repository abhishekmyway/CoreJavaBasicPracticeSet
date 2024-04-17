package com.abc;

import java.util.Arrays;

public class Manger3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C[] x = new C[4];
		x[0] = new C(9);
		x[1] = new C(5);
		x[3] = new C(4);
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
