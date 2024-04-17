package com.abc;

import java.util.Arrays;

public class Manager4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D[] x = {new D(9), new D(90), new D(19), 
				new D(29), new D(13), new D (33)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
